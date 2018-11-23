package Voorbeeldweek4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OefeningRaadWedstrijdje {

    public static void main(String[] args){

        System.out.println("Welkom");
        OefeningRaadWedstrijdje oefening = new OefeningRaadWedstrijdje();
        oefening.startCompetitie();
    }
    void startCompetitie(){
        Competitie competitie = new Competitie();
        competitie.addTeam();
        System.out.println("Er wordt een random getal gegenereerd tussen de 1 en 100");
        competitie.geefRandom();
        competitie.vraagScore();
        competitie.bepaalScore();
        competitie.bepaalWinnaar();


    }
}

class Competitie{

    int gekozenNummer;


    void geefRandom(){
        Random random = new Random();
        int randomNummer = random.nextInt(100);
        gekozenNummer = randomNummer;
    }

    ArrayList<Team> teams = new ArrayList<>();

    void addTeam(){
        teams.add(new Team("Rood"));
        teams.add(new Team("Blauw"));
        teams.add(new Team("Groen"));
        teams.add(new Team("Geel"));
    }

    void vraagScore(){

        for (Team team : teams){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hallo team " + team.naam +". Wat is je gok?");
            int s = scanner.nextInt();
            team.gok = s;
            System.out.println("Je gok is: " + team.gok);
        }
    }


    void bepaalScore(){
        for (Team team : teams){
            int verschil = Math.abs(gekozenNummer - team.gok);
            team.score = 100 - verschil;
            System.out.println("Team " + team.naam +  " zit " + verschil + " van het te raden nummer af");
            System.out.println("De score van team " + team.naam + " = " + team.score + "\n");
        }
    }

    void bepaalWinnaar() {
        int hoogsteGetal = 0;
        String winnaar = "";
        for (Team team : teams){
            if (team.score > hoogsteGetal){
                hoogsteGetal = team.score;
                winnaar = team.naam;
            }
        }
        System.out.println("De winnaar is: " + winnaar);
    }
}

class Team {
    int gok;
    int score = 0;
    String naam;

    Team(String naam){
        this.naam = naam;
    }
}


// Toernooi app
// aantal teams die tegen elkaar spelen in een Competitie
// komt ook een ranking in
// evt aantal poules
// winnaars tegen elkaar
package Voorbeeldweek4;

public class ObjectenMeegeven {
    public static void main(String[] args){
        System.out.println("Hallo");
        Persoon persoon = new Persoon();
        persoon.naam = "Jeroen";
        Basgitaar basgitaar = new Basgitaar();
        basgitaar.merk = "Sandberg";
        basgitaar.snaren.nieuwSetjeSnaren = false;
        basgitaar.hebJeSnaren();
        persoon.legSnarenOp(basgitaar);
    }
}

class Persoon {
    String naam;
    void legSnarenOp(Basgitaar basgitaar){
        if (basgitaar.snaren.nieuwSetjeSnaren) {
            System.out.println("ik leg nu snaren op de " + basgitaar.merk);
        } else {
            System.out.println("er liggen al snaren op");
        }
    }
}

class Basgitaar {
    String merk;
    Snaren snaren = new Snaren();
    Snaren hebJeSnaren() {
        if (snaren.nieuwSetjeSnaren == true) {
            System.out.println("Je hebt al snaren");
            return snaren;
        } else {
            System.out.println("Hier heb je nieuwe snaren");
            snaren.nieuwSetjeSnaren = true;
            return new Snaren();
        }
    }
}

class Snaren {
    boolean nieuwSetjeSnaren = false;
}

package Voorbeeldweek4;

public class ObjectenMeegeven {
    public static void main(String[] args){
        System.out.println("Hallo");
        Persoon persoon = new Persoon();
        persoon.naam = "Jeroen";
        Basgitaar basgitaar = new Basgitaar();
        basgitaar.merk = "Sandberg";
        basgitaar.snaren.nieuwSetjeSnaren = true;
        basgitaar.heeftSnaren = true;
        basgitaar.hebJeSnaren();
        persoon.legSnarenOp(basgitaar);
    }
}

class Persoon {
    String naam;
    void legSnarenOp(Basgitaar basgitaar){
        if (basgitaar.heeftSnaren == false) {
            System.out.println("ik leg nu snaren op de " + basgitaar.merk);
            basgitaar.heeftSnaren = true;
        } else {
            System.out.println("er liggen al snaren op");
        }
    }
}

class Basgitaar {
    boolean heeftSnaren;
    String merk;
    Snaren snaren = new Snaren();
    Snaren hebJeSnaren() {
        if (snaren.nieuwSetjeSnaren == true) {
            System.out.println("Je hebt al snaren");
            return snaren;
        } else {
            System.out.println("Hier heb je nieuwe snaren");
            snaren.nieuwSetjeSnaren = true;
            heeftSnaren = true;
            return new Snaren();
        }
    }
}

class Snaren {
    boolean nieuwSetjeSnaren = false;
}

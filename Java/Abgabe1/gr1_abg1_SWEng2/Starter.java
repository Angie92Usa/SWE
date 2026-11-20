import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {

        Tier tier = new Tier("Hund");
        tier.print();

        Tier tier2 = new Tier("Hund");
        tier2.setName("Katze");
        tier2.print();

        Tier adler = new Adler("Adler");
        adler.print();

        Tier adler2 = new Adler("Adler2");
        adler2.print();

        // Aufgabe 2c: Fragen zur Vererbung
        // 1. Ein Adler-Objekt enthält das name-Feld aus Tier.
        // 2. Nein, name ist private. Zugriff geht über getName() und setName().
        // 3. Die überschriebene print() Methode von Adler wird aufgerufen.
        // 4. Nicht direkt von Starter aus. Innerhalb von Adler
        // kann man mit super.print() die Methode von Tier aufrufen.

        ArrayList<Tier> tierListe = new ArrayList<>();
        tierListe.add(tier);
        tierListe.add(tier2);
        tierListe.add(adler);
        tierListe.add(adler2);

        for (int i = 0; i < tierListe.size(); i++) {
            tierListe.get(i).print();
        }

        for (Tier tierInListe : tierListe) {
            tierInListe.print();
        }
    }

}

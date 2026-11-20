public class Adler extends Tier {

    public Adler(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("print() der Klasse Adler. Mein Name ist " + getName());
    }

}

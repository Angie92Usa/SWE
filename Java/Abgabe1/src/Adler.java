public class Adler extends Tier {

    public Adler(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Adler: Ich heisse " + getName());
    }

}

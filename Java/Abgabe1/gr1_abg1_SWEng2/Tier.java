public class Tier {
    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("print() der Klasse Tier. Mein Name ist " + getName());
    }
}

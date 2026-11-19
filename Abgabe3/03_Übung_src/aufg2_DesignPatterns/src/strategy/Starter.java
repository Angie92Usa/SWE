package strategy;

public class Starter {
    public static void main(String[] args) {
        PersonAdministratorNew csvAdmin = new PersonAdministratorNew(
                new CSVPersonReader(), "persons.csv");
        csvAdmin.print();

        PersonAdministratorNew textAdmin = new PersonAdministratorNew(
                new PlainTextPersonReader(), "persons.txt");
        textAdmin.print();
    }
}

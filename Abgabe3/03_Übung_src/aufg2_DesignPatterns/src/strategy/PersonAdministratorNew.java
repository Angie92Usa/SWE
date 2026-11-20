package strategy;

import java.util.List;

public class PersonAdministratorNew {
    private List<Person> persons;

    public PersonAdministratorNew(PersonReader reader, String filePath) {
        // Der Reader kann ausgetauscht werden, ohne diese Klasse zu ändern.
        this.persons = reader.readPersons(filePath);
    }

    public void print() {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}


import java.util.List;

public class PersonAdministratorOriginal {
    List<Person> persons;

    public PersonAdministratorOriginal(String filePath){
        this.persons = read(filePath);
    }

    private List<Person> read(String filePath){
        CSVPersonReader csvReader = new CSVPersonReader();
        List<Person> pers = csvReader.readPersonsFromCSVFile("persons.csv");
        return pers;
    }

    public void print(){

        for (Person p : persons) {
            System.out.println(p);
        }
    }


    /*
    hier käme in der Realität noch jede Menge komplexer Code...
    ...
     */
}

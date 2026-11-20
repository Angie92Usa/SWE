
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVPersonReader {

    public List<Person> readPersonsFromCSVFile(String filePath) {

        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                if (line.isEmpty())
                    continue;

                String[] parts = line.split(";");

                String lastName = parts[0].trim();
                String firstName = parts[1].trim();
                String city = parts[2].trim();

                persons.add(new Person(firstName, lastName, city));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }
}
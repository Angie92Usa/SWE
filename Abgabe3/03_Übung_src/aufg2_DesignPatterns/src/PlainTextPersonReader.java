import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlainTextPersonReader {

    public List<Person> readPersonsFromTextFile(String filePath) {

        List<Person> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                if (line.isEmpty())
                    continue;

                String[] parts = line.split(" ");

                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
                String city = parts[2].trim();
                persons.add(new Person(firstName, lastName, city));
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }

        return persons;
    }

}
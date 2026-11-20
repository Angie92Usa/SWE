package strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlainTextPersonReader implements PersonReader {

    @Override
    public List<Person> readPersons(String filePath) {
        List<Person> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\\s+", 3);
                String firstName = parts[0];
                String lastName = parts[1];
                String city = parts[2];
                persons.add(new Person(firstName, lastName, city));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }

        return persons;
    }
}

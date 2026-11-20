package strategy;

import java.util.List;

public interface PersonReader {
    List<Person> readPersons(String filePath);
}

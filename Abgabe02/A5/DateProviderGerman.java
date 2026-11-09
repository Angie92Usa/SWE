import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateProviderGerman implements DateProvider {

    public String getFormattedDate() {
        LocalDate today = LocalDate.now();
        String formatted = today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return "Heute ist der " + formatted;
    }
}
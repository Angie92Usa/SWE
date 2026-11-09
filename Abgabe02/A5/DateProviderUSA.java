import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateProviderUSA implements DateProvider {

    public String getFormattedDate() {
        LocalDate today = LocalDate.now();
        String formatted = today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return "Today's date is " + formatted;
    }
}
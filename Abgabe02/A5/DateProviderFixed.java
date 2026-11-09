import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateProviderFixed implements DateProvider{
    
    public String getFormattedDate(){
        LocalDate today = LocalDate.now();
        String formatted = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return "Today's date is " + formatted;
    }
}
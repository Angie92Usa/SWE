public class DatePrinter{
    private DateProvider dateProvider;

    public DatePrinter(DateProvider ConcreteDateProvider){
        dateProvider = ConcreteDateProvider;
    }

    public void printDateToday(){
        String formattedDate = dateProvider.getFormattedDate();
        System.out.println(formattedDate);
    }
}
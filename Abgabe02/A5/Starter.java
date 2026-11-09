public class Starter{

    public static void main(String[] args) {

        DatePrinter printer;

        DateProvider german = new DateProviderGerman();
        printer = new DatePrinter(german);
        printer.printDateToday();


        DateProvider usa = new DateProviderUSA();
        printer = new DatePrinter(usa);
        printer.printDateToday();


        DateProvider fixed = new DateProviderFixed();
        printer = new DatePrinter(fixed);
        printer.printDateToday();

        DateProvider mock = new DateProviderMock();
        printer = new DatePrinter(mock);
        printer.printDateToday();
    }
}
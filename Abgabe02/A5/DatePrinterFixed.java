class DatePrinterFixed{

    public void printDateToday(){
        DateProviderFixed dateProvider = new DateProviderFixed();
        String formattedDate = dateProvider.getFormattedDate();
        System.out.println(formattedDate);
    }
}
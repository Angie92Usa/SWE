import java.util.Scanner;

public class CalculatorInput{

    private Scanner scanner;

    public CalculatorInput(){
        scanner = new Scanner(System.in);
    }

    public String readOperation(){
        System.out.println("Operation: +, -, *, / or 'exit'");
        return scanner.next();
    }

    public double readNumber(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }
}
public class CalculatorOutput{

    public void printStart(){
        System.out.println("Calculator");
    }

    public void printResult(double result){
        System.out.println("Result: " + result);
    }

    public void printExit(){
        System.out.println("Exiting...");
    }

    public void printError(String error){
        System.out.println("Error: "+ error);
    }
}
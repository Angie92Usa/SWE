public class CalculatorLogic{
    
    // operation muss "+", "-", "+" oder "/" sein, sonst wird NaN zurueckgegeben
    public double calculate(double num1, double num2, String operation) throws ArithmeticException{
        switch(operation){
            case "+":
                return num1+num2;

            case "-":
                return num1-num2;

            case "*":
                return num1*num2;

            case "/":
                if(num2 == 0){
                    throw new ArithmeticException("Division by zero!");
                }
                return num1/num2;

            default:
                return Double.NaN;
        }
    }
}

void main(){
    CalculatorLogic calculator = new CalculatorLogic();
    CalculatorInput input = new CalculatorInput();
    CalculatorOutput output = new CalculatorOutput();
    String operation;

    output.printStart();

    do{

        operation = input.readOperation();

        try {
            double number1 = input.readNumber("Enter first number:");
            double number2 = input.readNumber("Enter second number:");

            double result = calculator.calculate(
                number1, number2, operation
            );

            output.printResult(result);

        } catch (ArithmeticException e) {
            output.printError(e.getMessage());
        }

    }while( !operation.equals("exit") );

    output.printExit();
}
package Calculator;

public class CalculatorController {
	
	private calculatorModel model;

    public CalculatorController(calculatorModel model) {
        this.model = model;
    }

    public void calculate(double num1, char operator, double num2) {
        model.setNum1(num1);
        model.setOperator(operator);
        model.setNum2(num2);
        model.performOperation();
    }
}

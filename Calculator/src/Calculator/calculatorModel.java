package Calculator;

public class calculatorModel {

	 private double num1;
	    private double num2;
	    private double result;
	    private char operator;


	    public void setOperator(char operator) {
	        this.operator = operator;
	    }

	    public void performOperation() {
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    result = Double.NaN; // Gestion de l'erreur de division par zéro
	                }
	                break;
	        }
	    }

	    public double getResult() {
	        return result;
	    }

		public void setNum1(double num1) {
			this.num1 = num1;
		}

		public void setNum2(double num2) {
			this.num2 = num2;
		}

}

package Calculator;

import Calculator.CalculatorController;
import java.util.Scanner;

public class CalculatorMain {
	
	 public static void main(String[] args) {
	        calculatorModel model = new calculatorModel();
	        CalculatorController controller = new CalculatorController(model);
	        CalculatorView view = new CalculatorView();

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Entrez le premier nombre : ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Entrez l'opérateur (+, -, *, /) : ");
	        char operator = scanner.next().charAt(0); // Lire le premier caractère de l'opérateur

	        System.out.print("Entrez le deuxième nombre : ");
	        double num2 = scanner.nextDouble();
	        
	        // Effectuez le calcul après avoir obtenu les entrées de l'utilisateur
	        controller.calculate(num1, operator, num2);
	        double result = model.getResult();
	        view.printResult(result);
	        
	        scanner.close();
	    }

}

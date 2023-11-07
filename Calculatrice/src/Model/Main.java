package Model;

import javax.swing.SwingUtilities;

import Controller.CalculatriceController;
import View.CalculatriceView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                // Création du modèle, de la vue et du contrôleur
	                Calculatrice model = new Calculatrice();
	                CalculatriceView view = new CalculatriceView();
	                CalculatriceController controller = new CalculatriceController(model, view);
	                
	                // Affichage de la vue
	                view.afficher();
	            }
	        });
	}

}

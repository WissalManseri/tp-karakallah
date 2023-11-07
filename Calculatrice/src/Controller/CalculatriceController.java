package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Calculatrice;
import View.CalculatriceView;

public class CalculatriceController {
	 private Calculatrice model;
	    private CalculatriceView view;

	    public CalculatriceController(Calculatrice model, CalculatriceView view) {
	        this.model = model;
	        this.view = view;

	        view.ajouterBouton("1", new BoutonNumeriqueListener(1));
	        view.ajouterBouton("2", new BoutonNumeriqueListener(2));
	        view.ajouterBouton("+", new BoutonOperateurListener("+"));
	        view.ajouterBouton("=", new BoutonEgalListener());
	        view.ajouterBouton("C", new BoutonEffacerListener());
	    }

	    private class BoutonNumeriqueListener implements ActionListener {
	        private double nombre;

	        public BoutonNumeriqueListener(double nombre) {
	            this.nombre = nombre;
	        }

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            model.setNombre(nombre);
	        }
	    }

	    private class BoutonOperateurListener implements ActionListener {
	        private String operateur;

	        public BoutonOperateurListener(String operateur) {
	            this.operateur = operateur;
	        }

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            model.setOperateur(operateur);
	        }
	    }

	    private class BoutonEgalListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            double resultat = model.effectuerCalcul();
	            view.afficherResultat(resultat);
	        }
	    }

	    private class BoutonEffacerListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            model.effacer();
	            view.afficherResultat(0);
	        }
	    }

	    public static void main(String[] args) {
	        Calculatrice model = new Calculatrice();
	        CalculatriceView view = new CalculatriceView();
	        CalculatriceController controller = new CalculatriceController(model, view);
	        view.afficher();
	    }
}

package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatriceView {
	  private JFrame frame;
	    private JTextField champResultat;
	    private JPanel boutonPanel;
	    
	    
	    
	    
	    
	    
	    // Écouteur pour les chiffres
	    
	    private class BoutonNumeriqueListener implements ActionListener {
	        private int nombre;

	        public BoutonNumeriqueListener(int nombre) {
	            this.nombre = nombre;
	        }

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Mise à jour du champ de texte avec le chiffre saisi
	            champResultat.setText(champResultat.getText() + String.valueOf(nombre));
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // Écouteur pour les opérateurs
	    
	    
	    private class BoutonOperateurListener implements ActionListener {
	        private String operateur;

	        public BoutonOperateurListener(String operateur) {
	            this.operateur = operateur;
	        }

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Mise à jour du champ de texte avec l'opérateur saisi
	            champResultat.setText(champResultat.getText() + " " + operateur + " ");
	        }
	    }
	    
	    
	    
	     private double calculerExpression(String expression) {
             double resultat = 0.0;
             try {
                 // Divisez l'expression en termes séparés par des espaces
                 String[] termes = expression.split(" ");
                 
                 // Initialisez le résultat avec le premier terme (nombre initial)
                 resultat = Double.parseDouble(termes[0]);
                 
                 // Parcourez les termes restants et effectuez les opérations
                 for (int i = 1; i < termes.length; i += 2) {
                     String operateur = termes[i];
                     double nombreSuivant = Double.parseDouble(termes[i + 1]);
                     
                     switch (operateur) {
                         case "+":
                             resultat += nombreSuivant;
                             break;
                         case "-":
                             resultat -= nombreSuivant;
                             break;
                         case "*":
                             resultat *= nombreSuivant;
                             break;
                         case "/":
                             if (nombreSuivant != 0) {
                                 resultat /= nombreSuivant;
                             } else {
                                 // Gérer la division par zéro
                             }
                             break;
                     }
                 }
             } catch (Exception ex) {
                 // Gérer les erreurs d'évaluation d'expression
                 ex.printStackTrace();
             }
             return resultat;
         }
	    
	    
	    
	 // Écouteur pour le bouton Effacer
	    private class BoutonEffacerListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Réinitialiser le champ de texte
	            champResultat.setText("");
	        }
	    
	    
	    
	        
	        
	     // Écouteur pour le bouton Égal
	        private class BoutonEgalListener implements ActionListener {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String expression = champResultat.getText();
	                double resultat = calculerExpression(expression);
	                champResultat.setText(String.valueOf(resultat));
	            }
	            
	       
	        }

	 

	        public CalculatriceView() {
	        frame = new JFrame("Calculatrice");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 400);

	        champResultat = new JTextField(10);
	        boutonPanel = new JPanel();
	        boutonPanel.setLayout(new GridLayout(4, 4));

	        frame.add(champResultat, BorderLayout.NORTH);
	        frame.add(boutonPanel, BorderLayout.CENTER);
	    

	    
	 // Ajoutez des boutons numériques (0-9) et les opérateurs
	        
        for (int i = 0; i <= 9; i++) {
            ajouterBouton(String.valueOf(i), new BoutonNumeriqueListener(i));
        }
        ajouterBouton("+", new BoutonOperateurListener("+"));
        ajouterBouton("-", new BoutonOperateurListener("-"));
        ajouterBouton("*", new BoutonOperateurListener("*"));
        ajouterBouton("/", new BoutonOperateurListener("/"));

        ajouterBouton("=", new BoutonEgalListener());
        
        ajouterBouton("C", new BoutonEffacerListener());
    }


	    
	  
	       
        
        public void ajouterBouton(String libelle, ActionListener listener) {
	        JButton bouton = new JButton(libelle);
	        bouton.addActionListener(listener);
	        boutonPanel.add(bouton);
	    }
    
    

	    
	    
	    public void afficher() {
	        frame.setVisible(true);
	    }

	    public void afficherResultat(double resultat) {
	        champResultat.setText(String.valueOf(resultat));
	    }
	    }
	    
}

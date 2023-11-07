package Model;

public class Calculatrice {

	  private double nombre;
	    private double resultat;
	    private String operateur;
	   
		
		public void setNombre(double nombre) {
			this.nombre = nombre;
		}
	
		
		public void setOperateur(String operateur) {
			this.operateur = operateur;
		}
		
		 public double getNombre() {
		        return nombre;
		    }
			
		 public String getOperateur() {
		        return operateur;
		    }
		 public void setResultat(double resultat) {
				this.resultat = resultat;
			}
		  
		 public double getResultat() {
		        return resultat;
		
		 }
		 
		 // Le calcule 
		 
		 private double nombrePrecedent; // Nouvel attribut pour stocker le premier nombre
		 public double effectuerCalcul() {
		     
			 
			   if (operateur != null) {
		            // Si un premier nombre a été saisi et un opérateur est défini
		            if (nombrePrecedent != 0) {
		                switch (operateur) {
		                    case "+":
		                        resultat = nombrePrecedent + nombre;
		                        break;
		                    case "-":
		                        resultat = nombrePrecedent - nombre;
		                        break;
		                    case "*":
		                        resultat = nombrePrecedent * nombre;
		                        break;
		                    case "/":
		                        if (nombre != 0) {
		                            resultat = nombrePrecedent / nombre;
		                        } else {
		                            // Gérer la division par zéro
		                        }
		                        break;
		                }
		            }
		            // Mise à jour du résultat pour les opérations futures
		            nombrePrecedent = nombre;
		        }

		        // Réinitialisation du nombre courant et de l'opérateur
		        nombre = 0;
		        operateur = null;

		        return resultat;
		    }
			 
			 
			 
		 public void effacer() {
		        resultat = 0;
		        nombre = 0;
		        operateur = null;
		    }
		        
		        
		        
		        
		
}

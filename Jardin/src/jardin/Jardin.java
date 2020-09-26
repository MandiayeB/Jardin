package jardin;
import java.util.HashMap;
import java.util.Scanner;
import flore.Ail;
import flore.Betterave;
import flore.Carotte;
import flore.Tomate;
import flore.Etat;
import flore.IOgm;
import flore.IRacePure;
import java.util.Map;

public class Jardin {
	
	private int longueur;
	private int largeur;
	Emplacement emplacement[][];
	private HashMap<String, Integer> panier;
	
	public void ajouterPanier(String nomDuVegetal, Integer quantite) {
		
		this.panier.put(nomDuVegetal, quantite);
		
	}
	
	public Jardin (int longueur, int largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
		this.emplacement = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();
		
	}
	
	public void semer() {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Quelle plante désirez-vous ?\n1-Ail\n2-Betterave\n3-Carotte\n4-Tomate\n");
		int choice = scanner.nextInt();
		
		System.out.println("Où souhaitez-vous placer votre graine ?");
		System.out.print("x :");
		int x = scanner.nextInt();
		
		System.out.print("y :");
		int y = scanner.nextInt();
		
		
		
		if ( choice == 1 ) {
			
			 this.emplacement[x][y] = new Emplacement(new Ail());
			 int replace = this.panier.get("Ail");
			 this.panier.put( "Ail", replace - 1 );
			 
		} else if ( choice == 2 ) {
			
			this.emplacement[x][y] = new Emplacement(new Betterave());
			int replace = this.panier.get("Betterave");
			this.panier.put( "Betterave", replace - 1 );
			
		} else if ( choice == 3 ) {
			
			this.emplacement[x][y] = new Emplacement(new Carotte());
			int replace = this.panier.get("Carotte");
			this.panier.put( "Carotte", replace - 1 );
			
		} else if ( choice == 4 ) {
			
			this.emplacement[x][y] = new Emplacement(new Tomate());
			int replace = this.panier.get("Tomate");
			this.panier.put( "Tomate", replace - 1 );
			
		}
		
	}
	
	public void saisonSuivante() {
		
		for ( int x = 0; x < longueur; x++ ) {
			
			for ( int y = 0; y < largeur; y++ ) {
				
				if ( this.emplacement[x][y] != null ) {
					
					if ( emplacement[x][y].getVegetal().getEtat() !=  Etat.MORT ) {
						
						this.emplacement[x][y].getVegetal().grandir();
					
					} else {
						
						this.emplacement[x][y] = null;
						
					}
				
				}
			
			}
		
		}
	}
	
	public void recolter() {
		
		for ( int i = 0; i < longueur; i++ ) {
			
			for ( int j = 0; j < largeur; j++ ) {
				
				if ( emplacement[i][j] != null ) {
					
					if ( emplacement[i][j].getVegetal().getEtat() ==  Etat.FLEUR ) {
						
						if ( emplacement[i][j].getVegetal() instanceof IRacePure ) {
							
							IRacePure v = (IRacePure) emplacement[i][j].getVegetal();
							v.seReproduire(panier);
							
						}
						
						if ( emplacement[i][j].getVegetal() instanceof IOgm ) {

							IOgm v = (IOgm) emplacement[i][j].getVegetal();
							emplacement[v.seDupliquer(longueur, largeur).getKey()][v.seDupliquer(longueur, largeur).getValue()] = new Emplacement(new Betterave());

						}
						
						emplacement[i][j] = null;
						
					}
					
				}
				
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String str = "Voici notre jardin :\n";
		
		for (int i = 0; i < longueur; i++) {

			for (int j = 0; j < largeur; j++) {

				if ( emplacement[i][j] == null ) {

					str += "o";

				} else {
					
					str += emplacement[i][j].toString();
					
				}

			}

			str += "\n";
		}
		
		str += "Et voici notre panier :\n";
		
		for (Map.Entry<String, Integer> m : this.panier.entrySet()) {
            
			str += m.getKey() + " : " + m.getValue() + " graine(s)\n";
			
        }
		
		return str;
		
	}
	
	
}

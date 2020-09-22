package jardin;
import java.util.HashMap;
import java.util.Scanner;
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
		try {
			
			System.out.println("Quelle plante désirez-vous ?\n1-Ail\n2-Betterave\n3-Carotte\n4-Tomate\n");
			int choice = scanner.nextInt();
			
			if ( choice == 1 ) {
				 
			} else if ( choice == 2 ) {
				
			} else if ( choice == 3 ) {
				
			} else if ( choice == 4 ) {
				
			}
			
			System.out.println("Où souhaitez-vous placer votre graine ?");
			System.out.print("x :");
			int res = scanner.nextInt();
			System.out.print("y :");
			int ans = scanner.nextInt();
			this.emplacement[res][ans] = new Emplacement(new Ail());


		} finally {
			
			scanner.close();
			
		}
		
	}
	
	public void saisonSuivante() {
		
		for ( int x = 0; x < longueur; x++ ) {
			
			for ( int y = 0; y < largeur; y++ ) {
			
				this.emplacement[x][y].getVegetal().grandir();
			
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

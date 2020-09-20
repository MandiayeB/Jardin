package jardin;
import java.util.HashMap;
public class Jardin {
	
	private int longueur;
	private int largeur;
	Emplacement emplacement[][];
	private HashMap<String, Integer> panier;

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	public Emplacement[][] getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(Emplacement[][] emplacement) {
		this.emplacement = emplacement;
	}
	
	public HashMap<String, Integer> getPanier() {
		return panier;
	}

	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}
	
	public void ajouterPanier(String nomDuVegetal, Integer quantite) {
		
		this.panier.put(nomDuVegetal, quantite);
		
	}
	
	public Jardin (int longueur, int largeur) {
		
		this.longueur = longueur;
		this.largeur = largeur;
		this.emplacement = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();
		
	}
	
	
}

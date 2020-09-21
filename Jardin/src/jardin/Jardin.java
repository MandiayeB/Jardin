package jardin;
import java.util.HashMap;
import java.util.Map;
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
	
	@Override
	public String toString() {
		
		String str = "Voici notre jardin :\n";
		
		for (int i = 0; i < getEmplacement().length; i++) {

			for (int j = 0; j < getEmplacement()[i].length; j++) {

				str += "o";

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

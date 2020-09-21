package flore;

public abstract class Vegetal {
	
	protected Etat etat;
	protected Etat dessin;
	
	public Etat getEtat() {
		return etat;
	}
	
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	public Etat getDessin() {
		return dessin;
	}
	
	public void setDessin(Etat dessin) {
		this.dessin = dessin;
	}
	
	public Vegetal () {
		
		String tableau[] = new String [6];
		tableau[0] = "_";
		tableau[1] = ".";
		tableau[2] = "|";
		tableau[5] = "#";
		
		this.etat = Etat.GRAINE;
		
		
	}
	
}

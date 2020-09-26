package flore;

public abstract class Vegetal {
	
	protected Etat etat;
	protected String dessin[];
	
	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public Vegetal () {
		
		dessin = new String [6];
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";
		
		this.etat = Etat.GRAINE;
		
		
	}
	
	public void grandir() {
		
		this.etat = Etat.values()[this.etat.ordinal() + 1];

	}
	
	@Override
	public String toString()  {

		return dessin[this.etat.ordinal()];

	}
	
}

package jardin;
import flore.Vegetal;
public class Emplacement {
	
	private Vegetal vegetal;

	public Vegetal getVegetal() {
		return vegetal;
	}

	public void setVegetal(Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	public Emplacement(Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

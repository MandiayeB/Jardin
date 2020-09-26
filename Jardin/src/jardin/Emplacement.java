package jardin;
import flore.Vegetal;
public class Emplacement {
	
	private Vegetal vegetal;
	
	public Vegetal getVegetal() {
		return vegetal;
	}
	
	public Emplacement(Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	@Override
	public String toString() {
		
		String str = vegetal.toString();
		return str;
		
	}
}

package flore;
import java.util.AbstractMap.SimpleEntry;

public class Betterave extends Vegetal implements IOgm {

	public Betterave () {
		
		super();
		dessin[3] = "b";
		dessin[4] = "B";
	
	}

	@Override
	public SimpleEntry<Integer, Integer> seDupliquer(int longueur, int largeur) {
		
		int x = 0 + ( int )( Math.random() * ( ( longueur ) ) );
		int y = 0 + ( int )( Math.random() * ( ( largeur ) ) );
		
		return new SimpleEntry<Integer, Integer>(x, y);
		
	}
	
}

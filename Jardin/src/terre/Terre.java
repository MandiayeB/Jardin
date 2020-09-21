package terre;
import jardin.Jardin;
public class Terre {

	public static void main(String[] args) {

		Jardin jardin = new Jardin(3,5);
		
		jardin.ajouterPanier( "Betteraves", 5 );
		jardin.ajouterPanier( "Carottes", 4 );
		jardin.ajouterPanier( "Tomates", 3 );
		jardin.ajouterPanier( "Ail", 2 );
		
		System.out.println(jardin.toString());

	}

}

package terre;
import jardin.Jardin;
public class Terre {

	public static void main(String[] args) {

		Jardin jardin = new Jardin(3,5);
		
		jardin.ajouterPanier( "betteraves", 5 );
		jardin.ajouterPanier( "carottes", 4 );
		jardin.ajouterPanier( "tomates", 3 );
		jardin.ajouterPanier( "ail", 2 );
		
		System.out.println("Voici notre jardin :");
		
		for(int i = 0; i < jardin.getEmplacement().length; i++) {
			
			for(int j = 0; j < jardin.getEmplacement()[i].length; j++) {
				
				System.out.print("o");
				
			}
			
			System.out.println();
		}
		
		System.out.println( "Et notre panier contient :" );
		System.out.println( "Betteraves : " + jardin.getPanier().get( "betteraves" ) + " graine(s)" );
		System.out.println( "Carottes : " + jardin.getPanier().get( "carottes" ) + " graine(s)" );
		System.out.println( "Tomates : " + jardin.getPanier().get( "tomates" ) + " graine(s)" );
		System.out.println( "Ail : " + jardin.getPanier().get( "ail" ) + " graine(s)" );
		

	}

}

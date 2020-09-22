package terre;
import jardin.Jardin;
import java.util.Scanner;
public class Terre {

	public static void main(String[] args) {

		Jardin jardin = new Jardin(3,5);
		
		jardin.ajouterPanier( "Betteraves", 5 );
		jardin.ajouterPanier( "Carottes", 4 );
		jardin.ajouterPanier( "Tomates", 3 );
		jardin.ajouterPanier( "Ail", 2 );
		
		System.out.println(jardin.toString());
		
		Scanner scanner = new Scanner(System.in);
		
		try {

			System.out.println("1. Semer une graine");
			System.out.println("2. Récolter toutes les plantes qui sont matures");
			System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent)");
			System.out.println("4. Quitter l’application");
			int res = scanner.nextInt();

		} finally {
			
			scanner.close();
			
		}
		
		
	}

}

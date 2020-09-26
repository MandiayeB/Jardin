package terre;
import jardin.Jardin;
import java.util.Scanner;
public class Terre {

	public static void main(String[] args) {

		Jardin jardin = new Jardin(3,5);
		
		jardin.ajouterPanier( "Betterave", 5 );
		jardin.ajouterPanier( "Carotte", 4 );
		jardin.ajouterPanier( "Tomate", 3 );
		jardin.ajouterPanier( "Ail", 2 );
		
		Boolean bool = true;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println(jardin.toString());
			
			System.out.println("1. Semer une graine");
			System.out.println("2. Récolter toutes les plantes qui sont matures");
			System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent)");
			System.out.println("4. Quitter l’application");
			
			int res = scanner.nextInt();
			
			switch (res) {
			
				case 1:
					
					jardin.semer();
					break;
					
				case 2:
	
					jardin.recolter();
					break;
					
				case 3:
	
					jardin.saisonSuivante();
					break;
					
				case 4:
					
					scanner.close();
					bool = false;
					break;
			}
	
			
		} while ( bool );
		
		
	}

}

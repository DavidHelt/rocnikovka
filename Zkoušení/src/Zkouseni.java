import java.util.Scanner;

	public class Zkouseni {
		
		public static int runScanner() {
			Scanner scanner = new Scanner(System.in);
			int s = scanner.nextInt();
			return s;
			
		}
		
		public static void main(String[] args) {
			int pocetSpravnych = 0;
			System.out.println("Zkouseni z matematiky...");
			System.out.println("Zvolte zpusob zkouseni.");
			System.out.println("1 - Scitani, odcitani, nasobeni a deleni celych cisel");
			System.out.println("2 - Scitani, odcitani, nasobeni a deleni zlomku");
			System.out.println("3 - Prevody mezi ciselnymi soustavami (2, 10, 16)");
			int druh = runScanner();
//			System.out.println("0 - Pro predcasne ukonceni");
			
			System.out.println("Zvolte zpusob obtiznost.");
			System.out.println("1 - Cisla <-10, 10>");
			System.out.println("2 - Cisla <-100,100>");
			int obtiznost = runScanner();
			
			for (int i = 0; i < 10; i++) {
				int vysledek = Generovani_prikladu.generujPriklad(druh, obtiznost);
				System.out.println("Zadej vysledek");
				int odpoved = runScanner();
				if (vysledek == odpoved) {
					System.out.println("Spravna odpoved");
					pocetSpravnych++;
				} else {
					System.out.println("Spatna odpoved. Spravna odpoved byla: " + vysledek);
				}
			}
	
			for (int u = 0; u < 10; u++) {
				int vysledek2 = Generovani_zlomku.generujPriklad2(druh, obtiznost);
				System.out.println("Zadej vysledek");
				int odpoved2 = runScanner();
				if (vysledek2 == odpoved2) {
					System.out.println("Spravna odpoved");
					pocetSpravnych++;
				} else {
					System.out.println("Spatna odpoved. Spravna odpoved byla: " + vysledek2);
				}
			}
			
			System.out.println("Pocet spravnych odpovedi: " + pocetSpravnych);
		}
	}
	
	


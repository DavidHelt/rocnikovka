
public class Generovani_prikladu {

		public static int vypoctiPriklad(int num_1, int num_2, int operator)  {
			switch (operator) {
			case 1:
				return num_1 + num_2;
			case 2:
				return num_1 - num_2;
			case 3:
				return num_1 * num_2;
			case 4:
				return num_1 / num_2;
			}
			// TODO Handle this
			return 0;
		}
		
		private static int generujCislo(int min, int max) {
			return (int) Math.floor(Math.random() * (max - min + 1) + min);
		}
		
		public static String generujOperator(int operator) {
			switch (operator) {
			case 1:
				return "+";
			case 2:
				return "-";
			case 3:
				return "*";
			case 4:
				return "/";
			}
			return "";
		}
		
		public static int generujPriklad(int druh, int obtiznost) {
			int min = (int) (-10 * Math.pow(10, obtiznost - 1));
			int max = (int) (10 * Math.pow(10, obtiznost - 1));
			int operator = generujCislo (1, 4);
			switch (druh) {
			case 1:
				int num_1 = generujCislo(min, max);
				int num_2 = generujCislo(min, max);
				Priklad priklad = new Priklad(num_1, num_2, operator);
				System.out.println(priklad);
				return priklad.getResult();
			}
			return 0;
		}

	

		
		
		
		
		
		
	}




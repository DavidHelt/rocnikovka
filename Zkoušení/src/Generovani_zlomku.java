
public class Generovani_zlomku {

	public static int vypoctiZlomek(int citatel, int jmenovatel, int operatorz)  {
		switch (operatorz) {
		case 1:
			return citatel + jmenovatel;
		case 2:
			return citatel - jmenovatel;
		case 3:
			return citatel * jmenovatel;
		case 4:
			return citatel / jmenovatel;
		}
		return 0;
	}
	
	private static int generujZlomek(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	
	public static String generujOperatorz(int operatorz) {
		switch (operatorz) {
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
	
	
	public static int generujPriklad2(int druh, int obtiznost) {
		int min = (int) (-10 * Math.pow(10, obtiznost - 1));
		int max = (int) (10 * Math.pow(10, obtiznost - 1));
		int operatorz = generujZlomek (1, 4);
		switch (druh) {
		case 1:
			int citatel = generujZlomek(min, max);
			int jmenovatel = generujZlomek(min, max);
			Zlomek zlomek = new Zlomek(citatel, jmenovatel, operatorz);
			System.out.println(zlomek);
			return zlomek.getResult();
		}
		return 0;
	}

	
	}
	
	
	


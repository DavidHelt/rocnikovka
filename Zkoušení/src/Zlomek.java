public class Zlomek {

	private int citatel;
	private int jmenovatel;
	private int operatorz;
	private int result;
	private String operator2;
	


	public Zlomek (int citatel, int jmenovatel, int operatorz) {
		this.citatel = citatel;
		this.jmenovatel = jmenovatel;
		this.setOperatorz(operatorz);
		this.operator2 = Generovani_zlomku.generujOperatorz(operatorz);
		this.result = Generovani_zlomku.vypoctiZlomek(citatel, jmenovatel, operatorz);
		
	}

	public int getResult() {
		return result;
	}
	
	public int getOperatorz() {
		return operatorz;
	}
	public void setOperatorz(int operator) {
		this.operatorz = operator;
	}	
	
	@Override
	public String toString() {
		return String.format("%d %s %d = ???", this.citatel, this.operator2, this.jmenovatel);
	}
	
	}


public class Priklad {
	
		private int num_1;
		private int num_2;
		private int operator;
		private int result;
		private String operator_s;
		
		public Priklad (int num_1, int num_2, int operator) {
			this.num_1 = num_1;
			this.num_2 = num_2;
			this.setOperator(operator);
			this.operator_s = Generovani_prikladu.generujOperator(operator);
			this.result = Generovani_prikladu.vypoctiPriklad(num_1, num_2, operator);
		}
		
		public int getResult() {
			return result;
		}
		
		@Override
		public String toString() {
			return String.format("%d %s %d = ???", this.num_1, this.operator_s, this.num_2);
		}

		public int getOperator() {
			return operator;
		}

		public void setOperator(int operator) {
			this.operator = operator;
		}
	}


package operators;

public class Blackjack {

		public int play(int a, int b) {
			
			if (a <= 21 && b <= 21) {
				
				int diffA = 21 - a;
				int diffB = 21 - b;
				
				if (diffA <= diffB) {
					return a;
				} else {
					return b;
				}
				}
			} 	  else {
					return 0;
				
		}
}

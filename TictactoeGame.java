package Bridgelabz;
public class TictactoeGame {
	// Creating Method
	public static char board() 
	{
		int i;
		char[] element;
		element = new char[10];
		for (i = 1; i < 10; i++) {
			element[i] = '-';			
		}
		return element[i];

	}
		public static void main(String[] args) {
			System.out.println("TicTacToeGame");
			board(); {
			}
		}

}

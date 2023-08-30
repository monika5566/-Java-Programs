package game.pgm;
import java.util.Scanner;

;

class Guesser{
	int gNum;
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("guesser guesses a number");
		gNum = sc.nextInt();
		if(gNum>=1 && gNum<=10) {
			return gNum;
		}else {
			System.out.println("Please enter number between 1 to 10");
			return guessNum();
		}
		
	}
}
class Player{
	int pNum;
	int pridictNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("player pridicts a number");
		pNum = sc.nextInt();
		if(pNum>=1 && pNum<=10) {
			return pNum;
		}else {
			System.out.println("Please enter number between 1 to 10");
			return pridictNum();
		}
		
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		
	}
	
	void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.pridictNum();
		numFromPlayer2 = p2.pridictNum();
		numFromPlayer3 = p3.pridictNum();
		
	}
	void compare() {
		if(numFromGuesser ==numFromPlayer1 ) {
			System.out.println("Player 1 won the game");
		}
		if(numFromGuesser == numFromPlayer2) {
			System.out.println("Player 2 won the game");
		}
		if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		if(numFromGuesser!= numFromPlayer1 && numFromGuesser!= numFromPlayer2 &&
				numFromGuesser!= numFromPlayer3) {
			System.out.println("Game lost!!!!");
			
		}
	}
	
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to play again? (yes/no)");
		String playAgain = sc.nextLine();
		if(playAgain.equals("yes")) {
			main(args);
		}else {
			System.out.println("Thsnks for playing");
		}
			

	}

}



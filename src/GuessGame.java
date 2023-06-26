import java.util.*;
class Guesser{
	int guessingNumber;
	int guessTheNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Guess the number");
		guessingNumber= sc.nextInt();
		return guessingNumber;
	}
}
class Player{
	int guessingNumber;
	int guessTheNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("players kindly guees the number");
		guessingNumber= sc.nextInt();
		return guessingNumber;
	}
}
class Umpire{
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser=g.guessTheNumber();
	}
	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromP1=p1.guessTheNumber();
		numFromP2=p2.guessTheNumber();
		numFromP3=p3.guessTheNumber();
	}
	void compare() {
		if(numFromGuesser == numFromP1) {
			if(numFromGuesser == numFromP2 && numFromGuesser == numFromP3) {
				System.out.println("all three guess correctly game tied");
			}
			else if(numFromGuesser == numFromP2) {
				System.out.println("player1 and player2 guess correctly, game tied b/w p1 and p2");
			}
			else if(numFromGuesser == numFromP3) {
				System.out.println("player1 and player3 guess correctly, game tied b/w p1 and p3");
			}
			else {
				System.out.println("player1 won the game");
			}
			
		}
		else if(numFromGuesser == numFromP2) {
			if(numFromGuesser == numFromP3) {
				System.out.println("player2 and player2 guess correctly, game tied b/w p2 and p3");
			}
			else {
				System.out.println("player2 won the game");
			}
			
		}
		else if(numFromGuesser == numFromP3) {
			System.out.println("player3 won the game");
		}
		else {
			System.out.println("game lost try again");
		}
	}
	
}





















public class GuessGame {
	
	
	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	}

}

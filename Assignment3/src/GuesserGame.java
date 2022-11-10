import java.util.*;
class Guesser{
	int guessNum;
	
	int guessNumber(){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Guesser kindly guess the number");
		boolean flag=false;
		do{
			int Num=scan.nextInt();
			
			if(Num<10) {
				guessNum = Num;
				flag=true;
			}
			else {
				System.out.println("Enter a Valid number Less Than 10.");			
			}
		}while(flag==false); 
		
		return guessNum;
	}
	
}

class Player{
	int guessNum;
		
		int guessNumber() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Player kindly guess the number ");
			boolean flag=false;
			do{
				int Num=scan.nextInt();
				
				if(Num<10) {
					guessNum = Num;
					flag=true;
				}
				else {
					System.out.println("Enter a Valid number Less Than 10.");			
				}
			}while(flag==false); 
			
			return guessNum;
	}
	
}

class Umpire{
	int NumberGuessedFromGuesser, NumberGuessedFromPlayer1, NumberGuessedFromPlayer2, NumberGuessedFromPlayer3;
	
	void GuesserNumber(){
		Guesser guess = new Guesser();
		NumberGuessedFromGuesser = guess.guessNumber();
	}
	
	void PlayerGuessedNumber() {
		Player guessP1 = new Player();
		Player guessP2 = new Player();
		Player guessP3 = new Player();
		NumberGuessedFromPlayer1 = guessP1.guessNumber();
		NumberGuessedFromPlayer2 = guessP2.guessNumber();
		NumberGuessedFromPlayer3 = guessP3.guessNumber();
	}
	
	void compare(){
		if (NumberGuessedFromPlayer1 == NumberGuessedFromGuesser) {
			
			if (NumberGuessedFromPlayer2 == NumberGuessedFromPlayer1 && NumberGuessedFromPlayer3 == NumberGuessedFromPlayer1) {
				System.out.println("All Players won the match.");
			}
			
			else if(NumberGuessedFromPlayer2 == NumberGuessedFromPlayer1) {
				System.out.println("Player1 and Player2 won the match");
			}
			
			else if(NumberGuessedFromPlayer3 == NumberGuessedFromPlayer1) {
				System.out.println("Player1 and Player3 won the match");
			}
			
			else {
				System.out.println("Player1 won this Round");
		
			}
		}
		
		else if(NumberGuessedFromPlayer2 == NumberGuessedFromGuesser) {
			
			if(NumberGuessedFromPlayer3 == NumberGuessedFromPlayer2) {
				System.out.println("Player2 and Player3 won the match");
			}
			
			else {
				System.out.println("Player2 won this Round");
		
			}
		}
		
		else if(NumberGuessedFromPlayer3 == NumberGuessedFromGuesser) {
			System.out.println("Player3 won this Round");
		}
		
		else {
			System.out.println("GAME OVER!");
		}
	}
}	

public class GuesserGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Umpire ump = new Umpire();
		
		System.out.println("Wanna start the game? Type YES:y OR NO:n ");
		
		boolean flag=false;
		do {
			char start = sc.nextLine().toLowerCase().charAt(0);
			if(start==121) {
				ump.GuesserNumber();
				flag=true;
			}
			else if(start==110){
				System.out.println("Please Enter y to start the game.");
			}
			else {
				System.out.println("Enter a Valid character!");
			}
		}while(flag==false);
		
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Let Players to Guess the number??Type YES:y OR NO:n");
		do {
			char playertostart = sc.nextLine().toLowerCase().charAt(0);
			if(playertostart==121) {
				ump.PlayerGuessedNumber();
				flag=false;
			}
			else if(playertostart==110){
				System.out.println("Please Enter y to let players to guess......");
			}
			else {
				System.out.println("Enter a Valid character!");
			}
		}while(flag==true);
		
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Shall we Compare??Type YES:y OR NO:n");
		do {
			char startcompare = sc.nextLine().toLowerCase().charAt(0);
			if(startcompare==121) {
				ump.compare();
				flag=false;
			}
			else if(startcompare==110){
				System.out.println("Please Enter y to Compare......");
			}
			else {
				System.out.println("Enter a Valid character!");
			}
		}while(flag==true);
		
		
	}

}

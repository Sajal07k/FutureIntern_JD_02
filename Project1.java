import java.util.Random;
import java.util.Scanner;

public class Project1
{
	// Game1_RockPaperScissor
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("_______ROCK PAPER SCISSOR_______");
		System.out.println("Type 'rock', 'paper', or 'scissor' to play. Type 'quit' to stop the game.");
		String []str = {"rock","paper","scissor"};
		Random random = new Random();
		while(true)
		{
			String user = sc.nextLine();
			int computer = random.nextInt(3);
			if(user.equalsIgnoreCase("quit")){
				System.out.println("Game Over");
				break;
			}
			if((user.equalsIgnoreCase("rock") && str[computer].equalsIgnoreCase("scissor")) || 
			(user.equalsIgnoreCase("paper") && str[computer].equalsIgnoreCase("rock")) || 
                        (user.equalsIgnoreCase("scissor") && str[computer].equalsIgnoreCase("paper"))){
				System.out.println("You won");
			}
			else if(user.equals(str[computer])){
				System.out.println("Draw");
			}else{
				System.out.println("You lost");
			}
		}
		sc.close();
	}
}

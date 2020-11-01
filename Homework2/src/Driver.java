
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Library L = new Library();
		DiningHall DH = new DiningHall();
		PotionsClassroom PC = new PotionsClassroom();
		Entrance E = new Entrance();

		Scanner obj = new Scanner(System.in);

		System.out.println("\"Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to");
		System.out.println("magical Mischief-Makers are proud to present THE MARAUDER'S MAP\"");
		System.out.println("Say the magic phrase to reveal the map.");

		String cmd;
		cmd = obj.nextLine();
		while (!cmd.equalsIgnoreCase("I solemnly swear that I am up for no good")) {
			System.out.println("You did not say the correct phrase!");
			cmd = obj.nextLine();
		}
		Hermione HER = new Hermione(L);
		Harry HAR = new Harry(E);

		System.out.println(E);
		cmd = obj.nextLine();
		while (!cmd.equalsIgnoreCase("mischief managed")) {

			if (cmd.contains("North") || cmd.contains("north")) {
				HAR.setLocation(DH);
				System.out.println(DH);
			} else if (cmd.contains("East") || cmd.contains("east")) {
				HAR.setLocation(PC);
				System.out.println(PC);
			} else if (cmd.contains("west") || cmd.contains("West")) {
				HAR.setLocation(L);
				System.out.println(L);
			} else if (cmd.contains("exit") || cmd.contains("Exit")) {
				HAR.setLocation(E);
				System.out.println("Leaving the room...enter a new direction");
			} else {
				System.out.println("There is nothing to do here!!");
			}
			cmd = obj.nextLine();
		}
		System.out.println("Hiding map contents...end.");

	}
}

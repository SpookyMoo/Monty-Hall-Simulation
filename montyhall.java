
import java.lang.Math;
import java.util.Scanner;

public class montyhall {
	public static void main(String Args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of times to run simulation");
		int Amount = input.nextInt();

		int Switch = 0;
		int NoSwitch = 0;
		for (int i = 0; i < Amount; i++) {

			if (Math.floor(Math.random() * (4 - 2 + 1) + 1) == 1) {
				NoSwitch++;

			}

			if (Math.floor(Math.random() * (4 - 2 + 1) + 1) == 2 || Math.floor(Math.random() * (4 - 2 + 1) + 1) == 3) {
				Switch++;

			}

		}
		;
		System.out
				.println("If you were to switch you would have won a car " + Switch + " out of " + Amount + " times  ");
		System.out.println(
				"If you were to not switch you would have won a car " + NoSwitch + " out of " + Amount + " times ");

	}
}
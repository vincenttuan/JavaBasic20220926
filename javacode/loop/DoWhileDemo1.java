package loop;

import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		int ans = 53;
		int min = 0, max = 100;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.printf("請在 %d~%d 之間猜一數字: ", min, max);
			int userGuess = scanner.nextInt();
			if(userGuess < ans) {
				min = userGuess;
			} else if(userGuess > ans) {
				max = userGuess;
			} else {
				System.out.println("恭喜 ! 答對了 ~");
				break;
			}

		} while(true);


	}
}
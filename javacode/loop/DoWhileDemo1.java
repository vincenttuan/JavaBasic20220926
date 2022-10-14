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
			// 檢查 userGuess 是否合理 ?
			if(userGuess >= max || userGuess <= min) {
				System.out.println("數字範圍錯誤, 請重新猜~");
				continue;
			}

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
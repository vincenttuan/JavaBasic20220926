package loop;

import java.util.Scanner;
import java.util.Random;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(99) + 1;
		int min = 0, max = 100;
		do {
			// user 猜
			Scanner scanner = new Scanner(System.in);
			System.out.printf("請在 %d~%d 之間猜一數字: ", min, max);
			int userGuess = scanner.nextInt();
			// 檢查 userGuess 是否合理 ?
			if(userGuess >= max || userGuess <= min) {
				System.out.println("數字範圍錯誤, 請重新猜~");
				continue;
			}
			// 判斷 user 是否有猜中 ?
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
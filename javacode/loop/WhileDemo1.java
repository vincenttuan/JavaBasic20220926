package loop;

import java.util.Random; // 匯入隨機數資源

public class WhileDemo1 {
	public static void main(String[] args) {
		
		Random random = new Random(); // 建立一個隨機數物件

		while(true) {
			int num = random.nextInt(100); // 取一個 0~99 的隨機數
			System.out.println(num);
			if(num == 27) {
				break; // 跳離 while 迴圈
			}
		}

	}
}
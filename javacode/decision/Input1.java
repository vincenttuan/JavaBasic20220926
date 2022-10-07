package decision;

import java.util.Scanner;

public class Input1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 建立一個 Scanner 的物件
		System.out.print("請輸入半徑: ");
		int r = sc.nextInt(); // 將使用者所輸入的資料轉成 int 後再給 r 變數使用
		System.out.printf("使用者所輸入的半徑是: %d\n", r);
		
	}
}
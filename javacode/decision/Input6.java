package decision;

import java.util.Scanner;

public class Input6 {
	// 判斷輸入的數字是偶數還是奇數 ?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		int num = sc.nextInt();
		// case 1: 利用 if-else 判斷偶數還是奇數
		if(num % 2 == 0) {
			System.out.println("偶數");
		} else {
			System.out.println("奇數");
		}

		// case 2: 利用三元運算子(?:) 判斷偶數還是奇數
		System.out.println( (num % 2 == 0) ? "偶數" : "奇數" );

	}

}
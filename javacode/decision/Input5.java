package decision;

import java.util.Scanner;

public class Input5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高(cm): ");
		double h_cm = sc.nextDouble();
		System.out.print("請輸入體重(kg): ");
		double w_kg = sc.nextDouble();
		// 將身高轉換為公尺
		double h_m = h_cm / 100;
		// 計算 bmi
		double bmi = w_kg / Math.pow(h_m, 2);
		System.out.printf("BMI 值: %.2f\n", bmi);
		// 判讀 bmi
		System.out.print("判斷結果: ");
		if (bmi >= 23) {
			System.out.println("過胖");
		} else if (bmi < 18) {
			System.out.println("過瘦");
		} else {
			System.out.println("正常");
		}
			 
	}

}
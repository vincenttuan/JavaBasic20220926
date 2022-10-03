package exp;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("計算 BMI: ");
		double w = 60; // double 會自動補 0 --> 60.0
		double h = 170; // 170.0 
		// 將 h / 100 轉換為公尺
		h = h / 100;

		double bmi = w / (h*h);
		System.out.println(bmi);
		// 若只要印出小數點 2 位, 可以用 printf() 來達成
		System.out.printf("%.2f\n", bmi);
		// 若只要印出小數點 1 位
		System.out.printf("%.1f\n", bmi);
		// 想要印出 "bmi = 20.76"
		System.out.printf("bmi = %.2f\n", bmi);
		// 想要印出 "身高=170.0cm 體重=60.0kg BMI=20.76"
		System.out.printf("身高=%.1fm 體重=%.1fkg BMI=%.2f\n", h, w, bmi);

	}
}
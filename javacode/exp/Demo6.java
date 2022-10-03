package exp;

public class Demo6 {

	public static void main(String[] args) {
		int h = 170;
		int w = 60;
		// 印出 bmi = 20.76
		double m = h / 100.0;
		System.out.println(m);

		double bmi = w / (m*m);
		System.out.printf("%.2f\n", bmi);

		// 判斷 bmi 是否正常 ?
		// bmi 正常範圍在 18 <= bmi < 23 相當於 (18 <= bmi) && (bmi < 23)
		System.out.printf("bmi 是否正常? %b\n", ((18 <= bmi) && (bmi < 23)));
	}

}
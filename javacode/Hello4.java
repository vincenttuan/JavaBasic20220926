public class Hello4 {

	public static void main(String[] args) {
		// 數學運算子: + - * /
		var x = 10; // 定義一個 x 變數內容是 10
		System.out.println(x); // 印出變數內容

		var r = 15; // 定義一個半徑 r = 15
		var pi = 3.1415926; // 圓周率
		var area = r * r * pi; // 圓面積
		System.out.println(r);
		System.out.println(area);

		// 求球體積
		var volume = 4/3.0*pi*r*r*r;
		System.out.println(volume);
	}

}
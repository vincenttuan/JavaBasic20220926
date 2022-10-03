package exp;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("數學遞增運算子 ++");
		int x = 10;
		int y = ++x; // 前序遞增, x 先加 1 之後再指派給 y
		System.out.printf("x=%d y=%d\n", x, y);

		int a = 10;
		int b = a++; // 後序遞增, a 先將內容給 b, 之後 a 再加 1
		System.out.printf("a=%d b=%d\n", a, b);

		int k = 0;
		System.out.println(k++);
		System.out.println(k);

	}
}
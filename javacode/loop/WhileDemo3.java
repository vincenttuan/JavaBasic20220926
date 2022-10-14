package loop;

public class WhileDemo3 {

	public static void main(String[] args) {
		// 印出 1~10 並求出總和
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.printf("總和: %d\n", sum);
	}

}
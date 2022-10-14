package loop;

public class WhileDemo4 {
	public static void main(String[] args) {
		// "印出" 1~10 中的所有 3 的倍數, 並計算所有 3 的倍數的"總和"
		int i = 1;
		int sum = 0;
		while(i <= 10) {

			if(i % 3 == 0) { // i 過濾出是 3 的倍數
				System.out.println(i); // 印出
				sum += i; // 總和
			}

			i++;
		}
		System.out.printf("總和: %d\n", sum);
	}
}
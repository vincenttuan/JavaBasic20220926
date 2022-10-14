package loop;

public class WhileDemo2 {
	public static void main(String[] args) {
		// 利用 while-loop 印出 1~10 並計算總合
		int i = 1;
		int sum = 0;
		while(true) {
			System.out.println(i); // 印出 i
			sum = sum + i; // sum 進行累加
			i++; // i 加 1
			if(i > 10) { // 若 i > 10
				break; // 跳離迴圈
			}
		}	
		
		System.out.printf("總和 = %d\n", sum);
	}
}
package exp;

public class Demo5 {
	public static void main(String[] args) {
		int score = 80;
		// 請問 score 的分數是否及格 ?
		System.out.printf("%d 的分數是否及格? %b\n", score, (score >= 60));
		// 請問 score 是否是偶數 ?
		System.out.printf("%d 是否是偶數? %b\n", score, (score % 2 == 0));
		// 請問 score 是否同時是及格也是偶數 ?
		System.out.printf("%d 是否同時是及格也是偶數? %b\n", score, ((score >= 60) && (score % 2 == 0)));
	}
}
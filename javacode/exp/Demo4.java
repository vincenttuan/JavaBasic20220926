package exp;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("關係運算子");
		int score = 45; // 考試分數
		System.out.println(score >= 60);
		// 印出 "score: 75 是否及格: true"
		System.out.printf("score: %d 是否及格: %b\n", score, (score >= 60));

	}
}
package loop;

/*

印出
**********
**********
**********

*/
public class WhileDemo6 {
	public static void main(String[] args) {

		int x = 1;
		while(x <= 3) {
			//---------------------------------

			// 印出 10 個 (*) **********
			int y = 1;
			while(y <= 10) {
				System.out.print("*");
				y++;
			}
			System.out.println(); // 斷行(換行)

			//---------------------------------
			x++;
		}

		
		


	}
}
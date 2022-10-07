package decision;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入雞+兔的總隻數: ");
		int total = sc.nextInt();
		System.out.print("請輸入雞+兔的總腳數: ");
		int feet = sc.nextInt();
		int chicken = ((total * 4) - feet)/(4-2);
		int rabbit = total - chicken;
		System.out.printf("雞: %d 兔: %d\n", chicken, rabbit);
	}

}
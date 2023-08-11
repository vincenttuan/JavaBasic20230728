package day5;

import java.util.Scanner;
import java.util.Random;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		// 按下 1 可以得到一個幸運數字
		// 按下 0 離開
		System.out.println("程式開始");
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("按下 1 可以得到幸運數字, 按下 0 離開:");
			int input = sc.nextInt(); // 取得使用者所按下的數字
			if(input == 0) {
				break; // 跳離迴圈
			} else if(input == 1) {
				Random random = new Random();
				int luckyNumber = random.nextInt(100); // 取得 0~99 的隨機數
				System.out.printf("幸運數字: %d\n", luckyNumber);
			} else {
				System.out.println("輸入錯誤請重新輸入");
				continue;
			}

		} while(true);

		System.out.println("程式結束");
	}

}
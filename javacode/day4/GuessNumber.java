package day4;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int min = 0;
		int max = 100;
		//int ans = random.nextInt(99) + 1; // 1~99 之間的隨機數
		int ans = random.nextInt(max-min-1) + 1 + min;

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("User %d ~ %d 之間猜一數字:", min, max);
			int userGuess = sc.nextInt();
			// 判斷 user 所輸入的是否合法?
			if(userGuess <= min || userGuess >= max) {
				System.out.printf("User 所輸入的數字 %d 不在 %d ~ %d 之間,請重新輸入\n", userGuess, min, max);
				continue;
			}

			// 判斷 user 是否猜對?
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.println("恭喜 User 答對了");
				break;
			}

			// pc 猜 ---------------------------------------------------------------------------------------
			int pcGuess = random.nextInt(max-min-1) + 1 + min;
			System.out.printf("PC %d ~ %d 之間猜一數字:%d\n", min, max, pcGuess);
			// 判斷 pc 是否猜對
			if(pcGuess > ans) {
				max = pcGuess;
			} else if(pcGuess < ans) {
				min = pcGuess;
			} else {
				System.out.println("恭喜 PC 答對了");
				break;
			}

		}

		System.out.println("Game Over");
	}

}
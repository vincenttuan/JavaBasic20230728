package day4;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int ans = 21;
		int min = 0;
		int max = 100;

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("%d ~ %d 之間猜一數字:", min, max);
			int userGuess = sc.nextInt();
			// 判斷 user 所輸入的是否合法?
			if(userGuess <= min || userGuess >= max) {
				System.out.printf("您所輸入的數字 %d 不在 %d ~ %d 之間,請重新輸入\n", userGuess, min, max);
				continue;
			}

			// 判斷 user 是否猜對?
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.println("恭喜答對了");
				break;
			}

		}

		System.out.println("Game Over");
	}

}
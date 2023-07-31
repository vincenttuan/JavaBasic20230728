package day2;

import java.util.Scanner;

// 計算運費
// 目標：根據包裹的重量計算運費。
// 重量小於1公斤的運費是5元，
// 重量在1到3公斤之間的運費是10元，
// 重量在3到5公斤之間的運費是15元，
// 重量超過5公斤的運費是20元。

public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入包裹重量(公斤):");
		double weight = scanner.nextDouble();

		// 運費
		int cost = 0;
		if (weight > 5) {
			cost = 20;
		} else if(weight > 3) {
			cost = 15;
		} else if(weight > 1) {
			cost = 10;
		} else {
			cost = 1;
		}

		System.out.printf("包裹 %.1f 公斤的運費是 %d\n", weight, cost);
	}
}
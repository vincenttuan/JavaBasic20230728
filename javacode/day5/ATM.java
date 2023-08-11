package day5;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		int pin = 1234;
		int balance = 10000; // 帳戶餘額

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入密碼:");
			int userPin = sc.nextInt();
			// 判斷 pin
			if(pin != userPin) {
				System.out.println("密碼錯誤請重新輸入");
				continue;
			}
			System.out.print("請輸入提款金額:");
			int userAmount = sc.nextInt();
			// 判斷餘額是否充足
			if(balance < userAmount) {
				System.out.println("帳戶餘額不足");
				continue;
			}
			// 進行扣款
			balance = balance - userAmount;
			System.out.printf("提款 $%d 成功, 帳戶餘額 $%d\n", userAmount, balance);
			// 是否要繼續提款
			System.out.print("是否要繼續提款(1:繼續 0:離開):");
			int check = sc.nextInt();
			if(check == 0) {
				break;
			}

		} while(true);

		System.out.println("離開 ATM");
	}
}











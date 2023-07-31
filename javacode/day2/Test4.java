package day2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// 監聽/掃描鍵盤的工具
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身高:");
		double h = scanner.nextDouble(); // 將使用者所輸入的資料轉成 double
		System.out.print("請輸入體重:");
		double w = scanner.nextDouble(); // 將使用者所輸入的資料轉成 double

		h = h / 100;

		double bmi = w / (h*h);
		System.out.printf("%.2f\n", bmi);

		if (bmi >= 23) 
		{
			System.out.println("過重");	
		} 
		else if (bmi < 18) 
		{
			System.out.println("過輕");	
		}
		else 
		{
			System.out.println("正常");		
		}


	}

}
package day2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數:");
		int score = scanner.nextInt();
		System.out.printf("分數 %d\n", score);
		// 判斷 grade
		char grade;
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("Grade %c\n", grade);
	}

}
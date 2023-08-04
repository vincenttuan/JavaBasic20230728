package day3;

public class Test7 {
	public static void main(String[] args) {
		// ?: 三元運算子
		int score = 45;
		// 判斷分數是否及格 I?
		System.out.println( score >= 60 ? "及格" : "不及格" );
		// 判斷分數是否及格 II?
		String result = (score >= 60) ? "及格" : "不及格";
		System.out.println(result);

		// ?: 三元運算子(嵌套版)
		// bmi <= 18 "過輕""
		// bmi > 23 "過重""
		// 其餘 "正常""
		double bmi = 21.3;
		String bmiResult = (bmi <= 18) ? "過輕" : (bmi > 23) ? "過重" : "正常";
		


	}
}
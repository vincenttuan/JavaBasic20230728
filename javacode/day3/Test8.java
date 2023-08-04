package day3;

public class Test8 {

	public static void main(String[] args) {
		int score = 75;
		// 等級區分
		// 90分以上為"A", 80分以上為"B", 70分以上為"C", 60分以上為"D", 59分以下為"F"
		// 請問 score 分數的等級
		// 限用 ?:
		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
		System.out.println(score);
		System.out.println(grade);

	}

}
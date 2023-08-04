package day3;

public class Test6 {

	public static void main(String[] args) {
		
		int score = -75;
		// 判斷 score 是否在合法區間(0~100)
		if(score < 0 || score > 100) {
			System.out.println("成績錯誤");
			return; // 方法結束
		}

		System.out.println(score);
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}


	}

}
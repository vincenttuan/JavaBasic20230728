package day4;

public class Test3 {

	public static void main(String[] args) {
		int score = 75;
		// 90~100 -> A, Excellent!
		// 80~89  -> B, Well done
		// 70~79  -> C, Well done
		// 60~69  -> D, You passed
		// 0~59   -> F, Better try again
		
		if(score < 0 || score > 100) {
			System.out.println("score error");
			return; // 方法結束
		}
		
		switch (score/10) {
			case 10:
			case 9:
				System.out.println("A, Excellent!");
				break;
			case 8:
				System.out.println("B, Well done");
				break;				
			case 7:
				System.out.println("C, Well done");
				break;
			case 6:
				System.out.println("D, You passed");
				break;
			default:
				System.out.println("F, Better try again");
				
		}
		

	}

}
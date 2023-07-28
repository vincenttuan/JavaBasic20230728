public class Hello7 {
	public static void main(String[] args) {
		// 華氏
		double f = 45.5;
		
		// 請問攝氏 = ?
		// 華氏要換算成攝氏時，要先減32後，再乘以5/9。
		// 攝氏要換算成華氏時，要先乘以9/5，再加上32。
		double c = (f - 32) * (5.0/9);
		
		// 印出攝氏幾度(小數點一位)
		System.out.printf("%.1f\n", c);


	}
}
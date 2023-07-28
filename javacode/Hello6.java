public class Hello6 {

	public static void main(String[] args) {
		// 計算 bmi
		double h = 170.2/100.0;
		double w = 60.4;
		
		double bmi = w / (h*h);
		System.out.println(bmi);

		// 格式化 printf()
		// 格式化整數 %d, 格式化浮點數 %f
		System.out.printf("%f\n", bmi);
		System.out.printf("%.1f\n", bmi);
		System.out.printf("%.2f\n", bmi);
		System.out.printf("%.3f\n", bmi);
	}

}
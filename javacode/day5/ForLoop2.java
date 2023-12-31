package day5;

/*
請用 for loop 寫出 2024 ~ 2050 的閏年
閏年的判斷規則如下：
1. 如果一年能被4整除且不能被100整除，那麼這一年就是閏年。
2. 但是，能被400整除的年份也是閏年。
*/

public class ForLoop2 {

	public static void main(String[] args) {
		
		for(int year=2024;year<=2050;year++) {

			if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) { // 閏年的判定
				System.out.println(year);
			}

		}

	}

}
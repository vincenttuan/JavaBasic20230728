package day3;
/*
題目:
小七飲料特價
飲料一瓶 20 元
買 n 送 m
請問買 22 瓶需要多少元 ?
*/
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		//-- 商品優惠說明 -------------------------------------------------------
		int pricePerBottle = 20; // 飲料一瓶 20 元
		int n = 5;
		int m = 2;
		System.out.printf("飲料一瓶 $%d 元, 買 %d 送 %d\n", pricePerBottle, n, m);

		//-- 購買瓶數 -----------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入要購買的瓶數:");
		int bottlesToBuy = sc.nextInt();  // 要買 ? 瓶
		
		//-- 運算邏輯 -----------------------------------------------------------
		// 1. 分組
		int groups = bottlesToBuy / (n+m);
		// 2. 每一組要付的價格之總和
		int groupsToPayFor = groups * (pricePerBottle * n); 
		// 3. 檢查是否有餘數 ? 再乘上每一瓶的價格
		int remainingToPayFor = (bottlesToBuy % (n+m)) * pricePerBottle;
		int totalPrice = groupsToPayFor + remainingToPayFor;
		
		//-- 結帳 --------------------------------------------------------------
		System.out.printf("結帳 $%d\n", totalPrice);

	}
}
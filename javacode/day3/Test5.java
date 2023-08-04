package day3;

/*
題目:
全家飲料特價
飲料一瓶 20 元
第二件 6 折
請問買 4 瓶需要多少元 ?
*/
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int pricePerBottle = 20; // 每瓶飲料的價格
        double discount = 0.6; // 第二件的折扣

        System.out.printf("飲料一瓶 $%d 元, 第二件 %.0f 折\n", pricePerBottle, (discount*10));

        Scanner sc = new Scanner(System.in);
		System.out.print("請輸入要購買的瓶數:");
		int bottlesToBuy = sc.nextInt();  // 要買 ? 瓶
        
        int groups = bottlesToBuy / 2;
        int groupsToPayFor = (int)(groups * (pricePerBottle * (1+discount))); 

        int remainingToPayFor = (bottlesToBuy % 2) * pricePerBottle;
        int totalPrice = groupsToPayFor + remainingToPayFor;
        System.out.printf("結帳 $%d\n", totalPrice);
	}

}
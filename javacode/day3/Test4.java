package day3;
/*
題目:
小七飲料特價
飲料一瓶 20 元
買 3 送 1
請問買 22 瓶需要多少元 ?
*/
public class Test4 {
	public static void main(String[] args) {
		int bottlesToBuy = 22;  // 要買 22 瓶
		int pricePerBottle = 20; // 飲料一瓶 20 元
		
		// 1. 分組
		int groups = bottlesToBuy / 4;
		// 2. 每一組要付的價格之總和
		int groupsToPayFor = groups * (pricePerBottle * 3); 
		// 3. 檢查是否有餘數 ? 再乘上每一瓶的價格
		int remainingToPayFor = (bottlesToBuy % 4) * pricePerBottle;

		int totalPrice = groupsToPayFor + remainingToPayFor;

		System.out.println(totalPrice);

	}
}
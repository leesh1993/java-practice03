package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];
			
		for(int i = 0; i < goods.length; i++) {
			String info = scanner.nextLine();
			String[] data = info.split(" ");
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int count = Integer.parseInt(data[2]);
			
			goods[i] = new Goods(name, price, count);
			
		}
				
		for(int i = 0; i < goods.length; i++) {	
			System.out.println(goods[i].getGoodsName()+"(가격:"+goods[i].getGoodsPrice()+"원)이 " + goods[i].getGoodsCount() + "개 입고 되었습니다.");
		}
		
		scanner.close();
	}
}

package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] Goods = new String[COUNT_GOODS];
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			String info = scanner.nextLine();

			String[] data = info.split(" ");
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int count = Integer.parseInt(data[2]);
			Goods[i] = name+"(가격:"+price+"원)이" + count + "개 입고 되었습니다." ;
			//System.out.println(name + " : " + price + " : " + count);
		}
		
		for(int i = 0; i < Goods.length; i++) {
			System.out.println(Goods[i]);
		}
		scanner.close();
	}
}

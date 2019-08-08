package prob02;

public class Goods {
	
	private String[] goods;
	
	public Goods(int count){
		goods = new String[count];
	}
	
	public String[] getGoods() {
		return goods;
	}

	public void setGoods(String[] goods) {
		this.goods = goods;
	}
	
}

package prob02;

public class Goods {
	
	private String goodsName;
	private int goodsPrice;
	private int goodsCount;
	

	public Goods(String goodsName, int goodsPrice, int goodsCount ) {
		this.goodsName  = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsCount = goodsCount;
	}
	
	
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(int goodsCount) {
		this.goodsCount = goodsCount;
	}
	
}

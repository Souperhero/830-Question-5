import java.util.ArrayList;



public class Cookies {

	public Cookie() {
	Cookie myGoods = new Cookie("Oatmeal Cookie");
	}

	public void setCPrice(int price) {
	CPrice = price;
	}

	public int getCPrice() {
		System.out.println("Oatmeal Cookie price is :" + CPrice)
	}

	public String getDescription() {
		description = "This is an Oatmeal Cookie";
		System.out.println(description);
	}

	public String getSellByDate() {
		sellBy = "Sell this product by 10/18/2020";
		System.out.println(sellBy);
	}

	public class CookieDesc() {
		private String description;
		private int price;
		private String sellBy;
	}

	private CookieData(String description, int price, String sellBy) {
		this.description = description;
		this.price = 7;
		this.sellBy = sellBy
	}
}

public class CinnamonRolls {

	public CinnamonRoll() {
	Cookie myGoods = new CinnamonRoll("Fresh CinnamonRoll");
	}

	public void setCRPrice(int price) {
	CRPrice = price;
	}

	private int getCRPrice() {
		System.out.println("Fresh CinnamonRoll price is :" + CRPrice)
	}

		public String getDescription() {
		description = "This is a warm Cinnamon Roll, baked Fresh";
		System.out.println(description);
	}

	public String getSellByDate() {
		sellBy = "Sell this product by 10/1/2019";
		System.out.println(sellBy);
	}

	ppublic class CinnamonRollDesc() {
		private String description;
		private int price;
		private String sellBy;
	}

	private CinnamonRollData(String description, int price, String sellBy) {
		this.description = description;
		this.price = 13;
		this.sellBy = sellBy
	}
}

public class Brownie {

	public Brownie() {
	Cookie myGoods = new CinnamonRoll("Chocolate Chip Brownie");

	}

	public void setBPrice(int price) {
	CRPrice = price;
	}

	public int getBPrice() {
		System.out.println("Chocolate Chip Brownie price is :" + BPrice)
	}

			public String getDescription() {
		description = "This Brownie is so delicious it melts in your mouth";
		System.out.println(description);
	}

	public String getSellByDate() {
		sellBy = "Sell this product by 11/19/2020";
		System.out.println(sellBy);
	}

	ppublic class BrownieDesc() {
		private String description;
		private int price;
		private String sellBy;
	}

	private BrownieData(String description, int price, String sellBy) {
		this.description = description;
		this.price = 7;
		this.sellBy = sellBy
	}	
}

public class AddToList {

	public static void main(String[] s) {

		BakedGoods f1 = new Cookie();
		BakedGoods f2 = new CinnamonRoll();
		BakedGoods f2 = new Brownie();

		ArrayList<BakedGoods> foodList = new ArrayList<BakedGoods>();
		BakedGoodsList.add(f1);
		BakedGoodsList.add(f2);
		BakedGoodsList.add(f3);
	}
}
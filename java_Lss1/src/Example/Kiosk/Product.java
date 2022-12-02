package Example.Kiosk;

import lombok.Data;

@Data
public class Product {
	private String category, product;
	private int quantity, buyPrice, salePrice;
	
	public Product(String category, String product, int quantity, int buyPrice, int salePrice) {
		this.category = category;
		this.product = product;
		this.quantity = quantity;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
	}
	
	public Product(String category, String product) {
		this.category = category;
		this.product = product;
	}
	
}

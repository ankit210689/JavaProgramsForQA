package javatraining;

public class Clothing {
	
	private String description;
	private double price;
	private String size="M";
	
	//5-1 Encapsulation using Getters and setters
	
	private final double MIN_PRICE=10.0;
	private final double MIN_TAX=.2;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public double getPrice() {
		return price + (price * MIN_TAX);
	}
	
	public void setPrice(double Price) {
		
		this.price=(price > MIN_PRICE)? price: MIN_PRICE;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size=size;
	}

	
	}



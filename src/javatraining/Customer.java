package javatraining;

public class Customer {

	
	private String name;
	private String size;
	
	//Exercise 5-1(Encapsulate all variables)
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size=size;
	}
	
	//Exercise 5-2
	public void setSize(int measurement) {
		switch (measurement) {
		case 1,2,3:
			setSize("S");
		break;
		case 4,5,6:
			setSize("M");
		break;
		case 7,8,9:
			setSize("L");
		break;
		default:
			setSize("XL");
			
		}

	}
	}


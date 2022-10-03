package javatraining;

public class Shopapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0.2;
		double total=0.0;
		@SuppressWarnings("unused")
		int measurement=3;
	
		
		System.out.println("Welcome to Duke Choice Shop!");
		
		Customer c1=new Customer();
		
		c1.setName("Pinky");
		c1.setSize("S");
		
		//Exercise 4-1:Using switch statements
		
				
		//Exercise 3-2
		
		//initializing variables item1 and item2 of class Clothing
		Clothing item1= new Clothing();
		Clothing item2=new Clothing();
		
		Clothing[] items= {item1,item2, new Clothing(), new Clothing()};//Exercise 4-2 and 4-4
		
		//passing parameters to variable attributes description, price, size for both items
		
		item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		item1.setSize("M");
		
		item2.setDescription("Orange T-shirt");
		item2.setPrice(10.5);
		item2.setSize("S");
		
		//Exercise 4-4
		items[2].setDescription ("Green Scarf");
		items[2].setPrice (5.0);
		items[2].setSize ("S");
		
		items[3].setDescription ("Blue T-shirt");
		items[3].setPrice (10.5);
		items[3].setSize ("S");
		
		//Print details of both items
		
		//System.out.println("Item 1"+","+item1.description +","+ item1.price +","+ item1.size);
		//System.out.println("Item 2"+","+item2.description +","+ item2.price +","+ item2.size);
		
		//Calculate total amount for 1 jacket and 2 shirts
		
		//total=(item1.price+item2.price*2)*(1 + tax);
		int measurement1 = 3;
		
		c1.setSize(measurement1 );
		
		System.out.println("Customer is "+c1.getName() + "," + c1.getSize());
		
		
		
		//Exercise 4-3 and 4-4
		for (Clothing item:items) {
			if (c1.getSize().equals(item.getSize())) {
				//total=total+item.getPrice();
				System.out.println("Item "+","+item.getDescription() +","+ item.getPrice() +","+ item.getSize());
				
				total=total + total*tax;    //Exercise 4-3
				if (total>15) {break;}//4-4
			}
			
		}
		
		
		//Print total
		
		System.out.println("Total = "+total);
		
		
		
				
	
	}

}

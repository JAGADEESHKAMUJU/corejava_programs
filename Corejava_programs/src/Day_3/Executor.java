package Day_3;

public class Executor {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(110);
		c1.setName("gg");
		c1.setAddress("c");
		
		System.out.println("customer id is"+c1.getId()+"customer name: "+c1.getName()+"customer address: "+c1.getAddress());
		
		Customer c2=new Customer();        
		c2.setId(110);
		c2.setName("gg");
		c2.setAddress("c");
		
		
		 
		Customer c3=new Customer();  // invoke Explicit default constructor
		System.out.println(c3);
		
		
		Customer c4=new Customer (114, "dhanu","yanam"); // invoke parameterized constructor
		System.out.println(c4);
		}

}

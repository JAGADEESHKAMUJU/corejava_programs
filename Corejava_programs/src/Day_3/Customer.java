// PROGRAM TO DEMONSTRATION FOR ENTITY 
package Day_3;

public class Customer {
	private int id;
	private String name;
	private String address;
	//default constructor
	 public Customer()
	 {
      this.id=01;
      this.name="Unkanown";
      this.address="Yanam";
     }
	 
	 // Parmeterized constructor
	 public Customer(int id,String name, String address)
	 {
		    this.id=id;
			this.name=name;
			this.address=address;
		}
	public int getid() {
			return id;
			
	}
	
    public void setid(int id) {
			this.id = id;
	} 


    public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}

package settermethod;


public class PersonUsingSetter {
	String name;
	String age;
	Address Address;
	public PersonUsingSetter()
	{
		
	}
	PersonUsingSetter(String name,String age,Address Address)
	{
		this.name=name;
		this.age=age;
		this.Address=Address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public void Display()
	{
		System.out.println(name+" "+age+" ");
		System.out.println(Address.street+" "+Address.city);
	}
}

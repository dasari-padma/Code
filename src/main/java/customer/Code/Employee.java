package customer.Code;

public class Employee implements Comparable<Employee>
{
	
	int cid;
	String name;
	int purchaseAmount;
	int age;
	
	
	public Employee(int cid, String name, int purchaseAmount, int age) 
	{
		super();
		this.cid = cid;
		this.name = name;
		this.purchaseAmount = purchaseAmount;
		this.age = age;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPurchaseAmount() {
		return purchaseAmount;
	}


	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Employee st)
	{
		if(name==st.name)
			return 0;
		else if(name.compareTo(st.name)<0)
			return 1;
		else 
			return -1;
	}
	
	
	
	
}

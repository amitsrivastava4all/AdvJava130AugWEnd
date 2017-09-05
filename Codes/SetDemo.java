import java.util.HashSet;

class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private double balance;
	Customer(int id , String name, double balance){
		this.id = id;
		this.name= name;
		this.balance = balance;
	}
	
	@Override
	public int hashCode(){
		return name.length();
	}
	@Override
	public boolean equals(Object object){
		
		if(this==object){
			return true;
		}
		if(object instanceof Customer){
			Customer customer = (Customer) object; // Downcasting
			if(customer.id ==this.id && 
					customer.name.equals(this.name) 
					&& customer.balance == this.balance){
				return true;
			}
		}
		return false ;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public int compareTo(Customer object){
		return this.name.compareTo(object.name);
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "\n]";
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Customer> customerSet = new TreeSet<>();
		//TreeSet<Customer> customerSet = new TreeSet<>((first,second)->((Integer)first.getId()).compareTo(second.getId()));
		HashSet<Customer> customerSet = new HashSet<>();
		customerSet.add(new Customer(1002,"Shyam",29999));
		customerSet.add(new Customer(1001,"Ram",9999));
		customerSet.add(new Customer(1002,"Shyam",29999));
		customerSet.add(new Customer(1001,"Ram",9999));
		customerSet.add(new Customer(1000,"Ramesh",29999));
		System.out.println(customerSet);

	}

}

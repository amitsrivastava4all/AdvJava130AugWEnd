import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Emp{
	private int id;
	private String name;
	private double salary;
	Emp(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString(){
		return "Id "+id+" NAme "+name +" Salary "+salary;
	}
}
public class TraverseWay {

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		ArrayList<Emp> empList = new ArrayList<>();
		for(int i= 1; i<=5; i++){
			empList.add(new Emp(100+i,"Ram"+i,1000*i));
		}
		// Traverse
		// 1st Way
		/*for(int i= 0;i<empList.size() ; i++){
			Emp obj = empList.get(i);
			System.out.println(obj);
		}*/
		// 2nd Way
		Iterator<Emp> it = empList.iterator();
		while(it.hasNext()){
			Emp currentEmp = it.next();
			System.out.println(currentEmp);
			//System.out.println(currentEmp);
			//it.remove();
		}
		System.out.println(empList);
		// 3rd way
		ListIterator<Emp> lt = empList.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
		
		// 4th Way
		for(Emp emp : empList){
			System.out.println(emp);
		}
		
		
		//"amit".toUpperCase().toLowerCase()
		// 5th way
		empList.forEach((e)->System.out.println(e));
		double totalSalary = empList.stream().
				filter((e)->e.getSalary()>=3000)
				.mapToDouble(w->w.getSalary()).sum();
		
		double totalSalary2 = empList.parallelStream().
				filter((e)->e.getSalary()>=3000)
				.mapToDouble(w->w.getSalary()).sum();
		
		System.out.println("Sum is "+totalSalary+" "+totalSalary2);
		
		
		
		
	}

}

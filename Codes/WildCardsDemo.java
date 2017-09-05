import java.util.ArrayList;
class P{
	
}
class A extends P
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
 class D
 {
	 
 }
public class WildCardsDemo {
	static void print(ArrayList<?> list){
	//static void print(ArrayList<? super A> aList){
	//static void print(ArrayList<? extends A> aList){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj[] = new A[3];
//		obj[0] = new A();
//		obj[1] = new B();
		ArrayList<B> bList = new ArrayList<>();
		print(bList);
		ArrayList<C> cList = new ArrayList<>();
		print(cList);
		ArrayList<A> aList = new ArrayList<>();
		print(aList);
		ArrayList<P> pList = new ArrayList<>();
		print(pList);
		//ArrayList<D> dList = new ArrayList<>();
		//print(dList);
		//obj[2] = new D();
	}

}

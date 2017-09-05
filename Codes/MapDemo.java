import java.util.ArrayList;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> phoneMap = new HashMap<>();
		phoneMap.put("amit", 2222);
		phoneMap.put("ram", 2222);
		phoneMap.put("mike", 3333);
		phoneMap.put("amit", 3333);
		System.out.println(phoneMap);
		System.out.println(phoneMap.get("ram"));
		
		phoneMap.remove("mike");
		
		
		// V2
		HashMap<String,ArrayList<Integer>> pm = new HashMap<>();
		ArrayList<Integer> p = new ArrayList<>();
		p.add(2222);p.add(6222);p.add(5222);p.add(4222);
		pm.put("amit",p);
		System.out.println(pm.get("amit"));
		p = new ArrayList<>();
		p.add(2222);p.add(7222);p.add(3222);p.add(4222);
		pm.put("ram", p);
		System.out.println(pm);
		

	}

}

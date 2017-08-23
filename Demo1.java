import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		int m = 1000;
		Integer m2 = m;
		int mm = m2;
		/*
		 * N Songs, Unique, Sorted (Asc)
		 */
		HashMap<String,Integer> temp  = new HashMap<>();
		temp.put("delhi", 30);
		temp.put("mumbai", 38);
		temp.put("kolkata", 35);
		temp.put("shimla", 20);
		temp.put("shimla", 25);
		System.out.println(temp);
		System.out.println(temp.get("delhi"));
		
		ArrayList l = new ArrayList();
		HashSet<Integer> ts = new HashSet<>();
		ts.add(10);
		ts.add(1);
		ts.add(5);
		ts.add(9);
		ts.add(11);
		ts.add(15);
		ts.add(63);
		ts.add(13);
		ts.add(43);
		ts.add(33);
		ts.add(23);
		ts.add(13);
		ts.add(10);
		System.out.println(ts);
		/*TreeSet<String> songs = new TreeSet<>();
		songs.add("It's My Life");
		songs.add("Bang Bang");
		songs.add("It's My Life");
		songs.add("Bang Bang");
		songs.add("It's My Life");
		System.out.println(songs);
		*/
	}

}

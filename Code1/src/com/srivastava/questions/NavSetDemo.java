package com.srivastava.questions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class Stack<T,E extends Serializable>{
	E data;
	ArrayList<T> dataList = new ArrayList<>();
	public void push(T data){
		dataList.add(data);
	}
	public T peep(){
		/*for(int j = dataList.size()-1; j>=0; j--){
			System.out.println(dataList.get(j));
		}*/
		return dataList.get(dataList.size()-1);
	}
}
public class NavSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer,String> st = new Stack();
		Stack<String,Long> str = new Stack();
		
		NavigableSet<Integer> nav = new TreeSet<>();
		nav.add(10);
		nav.add(5);
		nav.add(1);
		nav.add(20);
		nav.add(6);
		nav.add(7);
		System.out.println(nav.lower(7)); //<
		System.out.println(nav.floor(7)); //<=
		System.out.println(nav.higher(7));  //>
		System.out.println(nav.ceiling(7)); //>=
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println("1st index "+l.get(1));
		
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("amit", 3333);
		map.put("ram", 2333);
		map.put("shyam", 1333);
		map.put("tim", 333);
		Set<String> keys = map.keySet();
		Iterator<String> keyIt = keys.iterator();
		System.out.println("MAP IS :::");
		while(keyIt.hasNext()){
			String currentKey = keyIt.next();
			System.out.println("Key "+currentKey+" and Value is "+map.get(currentKey));
		}
		System.out.println("****************************");
		for(Map.Entry<String,Integer> keyValue : map.entrySet()){
			System.out.println(keyValue.getKey()+" "+keyValue.getValue());
		}
		
		// Concurrent Collection
		//CopyOnWriteArrayList<Integer> i = new CopyOnWriteArrayList<>();
		ArrayList<Integer> i = new ArrayList<>();
		i.add(10);
		i.add(20);
		for(int j : i){
			i.add(10+j);
		}
		System.out.println(i);
		//List<Integer> j = Collections.synchronizedList(i);
		synchronized(i){
			
		}
		// Synchronized Collection
		
		

	}

}

package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo {
public static void main(String[] args) {
	
	ArrayList<String> tasks= new ArrayList<String>();
	
	tasks.add("practice code");
	tasks.add("exercise");
	tasks.add("sleep");
	tasks.add("eat");
	
	System.out.println(tasks);
//	System.out.println("---------1--------------");
	for(String a:tasks) {
		System.out.println(a);
	}

	System.out.println("---------3--------------");
	Iterator<String> it= tasks.iterator();
	
	while(it.hasNext()) {
	 
	
		
		String result=it.next();
		
	  System.out.println(result);
	  
		}
	}
	
}
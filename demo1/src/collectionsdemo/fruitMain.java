package collectionsdemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class fruitMain {

	
	public static void main(String[] args) {
		
     Set<fruit> fruitlist= new HashSet<fruit>();
   //  Set<fruit> fruitlist= new LinkedHashSet<fruit>();
		Set<String> name= new TreeSet<String>();
		name.add("sachin");
		name.add("poul");
		name.add("sarayn");
		name.add("zansulu");
		
		for(String b:name) {
			System.out.println(b);
		}
     
	fruit f1= new fruit("mango", 40);
	fruit f2= new fruit("banana", 50);
	fruit f3= new fruit("Apple", 40);
	fruit f4= new fruit("mango", 40);
	
	Collections.sort(fruitlist,new SortFruits());
	
	
fruitlist.add(f1);
fruitlist.add(f2);
fruitlist.add(f3);
fruitlist.add(f4);
	
	
	//for( fruit a:fruitlist) {
	//	System.out.println(a);
	//}

}}

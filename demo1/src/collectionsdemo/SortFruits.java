package collectionsdemo;

import java.util.Comparator;

public class SortFruits implements Comparator<fruit> {

	@Override
	public int compare(fruit o1, fruit o2) {
		int  x= (o1.fruit_name).compareTo(o2.fruit_name); 
		return x;
	}

	

}

package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String>obj = new ArrayList<String>();
		obj.add("one");
		obj.add("Two");
		obj.add("Three");
		obj.add("four");
		obj.add("Five");
		System.out.println("the elements are:" +obj);
		obj.add(0,"Zero");
		obj.remove(4);
		System.out.println("current elements are:" +obj);
		 for(String string : obj){
		 	System.out.println(string);

		 }
		 System.out.println("while loop");
		 int count = 0;
		 while (obj.size()>count){
		 	System.out.println(obj.get(count));
		 	count++;
		 }




	}

}

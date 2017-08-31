package datastructure;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */



				Queue<String> queue = new LinkedList<String>();

				queue.add("one");
				queue.add("Two");
				queue.add("Three");
				queue.add("Four");
				queue.add("Five");


				System.out.println(queue.peek());
				System.out.println(queue.remove());

//		for(String city:queue){
//			System.out.println(city);
//		}

	}

}






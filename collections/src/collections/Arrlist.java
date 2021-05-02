package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		a1.add(0,1);
		a1.add(3);
		a1.add(5);
		a1.set(2,7);
		System.out.println(a1);
		a1.remove(3);
		Iterator<Integer>i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		System.out.println(a1.add(9));
		System.out.println("=============");
		for(int j=0;j<a1.size();j++)
		{
			System.out.println(a1.get(j)+" ");
			
		}

	}

}
/*ArrayList provides us with dynamic arrays in Java.
 *  Though, it may be slower than standard arrays but 
 *  can be helpful in programs where lots of manipulation 
 *  in the array is needed. The size of an ArrayList 
 *  is increased automatically if the collection 
 *  grows or shrinks if the objects are removed from the 
 *  collection. 
 *  Java ArrayList allows us to randomly access the list.
 *   ArrayList can not be used for primitive types, like int, char, etc. 
 *   We will need a wrapper class for such cases
 *   */

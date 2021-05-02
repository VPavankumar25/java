package collections;
import java.util.*;
public class vect {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(null);
		v.add(45);
		v.add(12);
		v.add(null);
		v.add(43);
		Iterator<Integer>i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		System.out.println("---------------");
		v.remove(2);
		for(int j=0;j<v.size();j++)
		{
			System.out.println(v.get(j)+" ");
		}
	}

}
/*
 A vector provides us with dynamic arrays in Java. 
 Though, it may be slower than standard arrays but
 can be helpful in programs where lots of manipulation
 in the array is needed. This is identical to ArrayList
 in terms of implementation. 
 However, the primary difference between a vector
  and an ArrayList is that a Vector is synchronized 
  and an ArrayList is non-synchronized
     */

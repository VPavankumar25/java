package collections;
import java.util.*;
public class linList {
	public static void main(String[] args)
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(3);
		l.add(34);
		l.addFirst(2);
		l.addLast(99);
		//l.remove(3);
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		//System.out.println(l.set(0, 77));
			//In linked list set and iterator cant be used
		//if we use set here(0,77) we will get first element in LinkedList
		}
}
/*LinkedList class is an implementation of the 
 * LinkedList data structure which is a 
 * linear data structure where the elements are
 *  not stored in contiguous locations and 
 *  every element is a separate object with a 
 *  data part and address part. The elements are linked 
 
 * using pointers and addresses. Each element is known as a node
 */
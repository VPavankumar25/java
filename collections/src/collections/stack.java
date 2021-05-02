package collections;
import java.util.*;
public class stack {
	public static void main(String[] args)
	{
		Stack<String> s=new Stack<String>();
		s.push("First");
		s.push("second");
		s.push("third");
		Iterator<String> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		System.out.println("==========");
		System.out.println(s.pop());
		System.out.println("==========");
		System.out.println(s.peek());
		System.out.println("==========");
		System.out.println(s.empty());
		System.out.println("==========");
		System.out.println(s.search("First"));
		
	}
}
/*
Stack class models and implements the Stack data structure. 
The class is based on the basic principle of last-in-first-out.
 In addition to the basic push and pop operations, 
 the class provides three more functions of empty, 
 search and peek
*/
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class list {
	
public static void main(String[] args) {
	list obj=new list ();
	System.out.println("=========Array list===========");
	obj.Arraylist();
	System.out.println("=========linked list===========");
	obj.Linkedlist();
	}

public void Arraylist() {
	//list
	List<Object> list1 =new ArrayList<>();
	list1.add('a');	
	list1.add('b');	
	list1.add('c');	
	list1.add(10);	
	list1.add(20);	
	list1.add(30);	
	list1.add("aman");	
	list1.add(null);	
	list1.add(2.3f);	
	list1.add(null);	
	list1.add("aman1");	
/*	
	list1.add(6, 78);
	list1.addFirst('p');
	list1.addLast('q');
	System.out.println(list1.indexOf('b'));
	list1.remove(0);
	list1.remove(null);
	list1.set(0, "Aman");
*/	

	Iterator<Object> L1=list1.iterator();
	while(L1.hasNext()) {
		System.out.println(L1.next());	
	}
	
	System.out.println(list1.size());

/*	
	System.out.println(list1.get(0));
	System.out.println(list1.get(1));
	System.out.println(list1.get(2));
	System.out.println(list1.get(3));
	System.out.println(list1.get(4));
	System.out.println(list1.get(5));
	System.out.println(list1.get(6));
	System.out.println(list1.get(7));
	System.out.println(list1.get(8));
	System.out.println(list1.get(9));
	System.out.println(list1.get(10));
	System.out.println(list1.get(11));
*/
	
}

public void Linkedlist() {
	List<Object> list2 =new LinkedList<>();
	
	list2.add('p');	
	list2.add('q');	
	list2.add('r');	
	list2.add(null);	
	list2.add("aman");	
	list2.add(34.5f);	
	list2.add("tariq");	
	list2.add(true);	
	list2.add(12);	
	list2.add(34);
/*	
	list2.add(6, 8);
	list2.addFirst('y');
	list2.addLast('t');
	System.out.println(list2.indexOf('q'));
	list2.remove(5);
	list2.remove(null);
	list2.set(0, "Aman");
*/	 
	Iterator<Object> L2= list2.iterator();
	while(L2.hasNext()) {
		System.out.println(L2.next());
	}
	
	System.out.println(list2.size());

/*	
	System.out.println(list2.get(0));
	System.out.println(list2.get(1));
	System.out.println(list2.get(2));
	System.out.println(list2.get(3));
	System.out.println(list2.get(4));
	System.out.println(list2.get(5));
	System.out.println(list2.get(6));
	System.out.println(list2.get(7));
	System.out.println(list2.get(8));
	System.out.println(list2.get(9));
	System.out.println(list2.get(10));
	//System.out.println(list2.get(11));
*/	

 }
}
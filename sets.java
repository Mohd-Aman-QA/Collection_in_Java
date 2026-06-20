package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {

	
		
		public static void main(String[] args) {
			sets obj=new sets();
			System.out.println("=========Hashset==========");
			obj.hashset();
			System.out.println("=========linkedHashset==========");
			obj.linkedhashset();
			System.out.println("=========Treeset==========");
			obj.treeset();
		}
		
		public void hashset() {
			Set<Object> set1 =new HashSet<>();
			set1.add("aman");
			set1.add("aman");
			set1.add(null);
			set1.add(null);
			set1.add(1);
			set1.add(2);
			set1.add(3);	
			set1.add('a');
			set1.add('b');
			set1.add('c');
			
			set1.contains("aman");
			System.out.println(set1.size());
			
			Iterator<Object> itr=set1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
	   public void linkedhashset() {
			Set<Object> set2 =new LinkedHashSet<>();
			set2.add("aman");
			set2.add("aman");
			set2.add(null); 
			set2.add(null);
			set2.add(1);
			set2.add(2);
			set2.add(3);	
			set2.add('a');
			set2.add('b');
			set2.add('c');
			
			
			System.out.println(set2.size());
			
			set2.contains("aman");

			Iterator<Object> itr=set2.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	  public void treeset() {
		  Set<Object> set3 =new TreeSet<>();
			set3.add("aman");
			set3.add("aman1");
			set3.add("aman2");
			set3.add("aman3");
			set3.add("aman4");
			set3.add("aman5");
/*   	    set3.add(null); 	
			set3.add(1);
			set3.add(2);			
			set3.add('a');
			set3.add('b');	
*/		
			
			set3.remove("aman3");
			set3.add("tariq");
			System.out.println(set3.size());
			Iterator<Object> itr=set3.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		  
	}
	}

	
	


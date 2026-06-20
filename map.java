package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class map {

	
 public static void main(String[] args) {
	 map obj=new map();
	 System.out.println("=========Hashmap=========");
	 obj.hashmap();
	 System.out.println("=========linked hashmap=========");
	 obj.linkedhashmap();
	 System.out.println("=========Treemap=========");
	 obj.treemap();
	}
	
	public void hashmap() {
		Map<Object,Object> map1 =new HashMap<>();
		map1.put(null, 4);
		map1.put(null, 4);
		map1.put('a', null);
		map1.put(3, "aman");
		map1.put(4, 56.7f);
		map1.put(5, "dmn");
		map1.put('a', null);
		map1.put(1, null);
		map1.put(2, 5);
		map1.put(6, 6.7f);
		
/*		
		for(Object key:map1.keySet()) {
			Object value=map1.get(key);
			System.out.println(key+","+value);
		}
*/		
		
	
		Iterator<Map.Entry<Object, Object>> itr= map1.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Object, Object> entry= itr.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			
			System.out.println(key+","+value);
		}
		
	}
	
  
   

   public void linkedhashmap() {
	   Map<Object,Object> map2=new LinkedHashMap<>();
		map2.put(null, 4);
		map2.put(null, 4);
		map2.put('a', null);
		map2.put(3, "aman");
		map2.put(4, 56.7f);
		map2.put(5, "dmn");
		map2.put('a', null);
		map2.put(1, null);
		map2.put(2, 5);
		map2.put(6, 6.7f);
		
/*
		System.out.println(map2.size());
		System.out.println(map2.replace('a', 89));
		map2.remove(1, null);
		System.out.println(map2.containsValue("dmn"));
		System.out.println(map2.containsKey("tariq"));
		System.out.println(map2.get(3));
		System.out.println(map2.keySet());
*/	
	
		Iterator<Map.Entry<Object, Object>> itr= map2.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Object, Object> entry= itr.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			
			System.out.println(key+","+value);
		}
		
	}

  public void treemap() {
	  Map<Object,Object> map3=new TreeMap<>();
		map3.put(1, "aman");
		map3.put(2,"aman");
		map3.put(3, "aman");
		map3.put(4, "aman");
		map3.put(5, "aman");
		map3.put(6, "dmn");
		map3.put(7, "aman");
		map3.put(8, null);
		map3.put(9,"aman");
		
/*	
		map3.remove(1, "aman");
		System.out.println(map3.size());
		
		System.out.println(map3.containsValue(null));
		System.out.println(map3.containsKey(7));
		System.out.println(map3.get(3));
*/
	
		Iterator<Map.Entry<Object, Object>> itr= map3.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Object, Object> entry= itr.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			
			System.out.println(key+","+value);
		}
}
}

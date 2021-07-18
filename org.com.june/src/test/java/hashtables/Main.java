package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.testng.annotations.Test;

public class Main {

//	@Test
	public void test1() {
		
		SimpleHashTable simpleHashTable = new SimpleHashTable(10);
		
		simpleHashTable.put("123", "johny");
		simpleHashTable.put("1251", "rohny");
		simpleHashTable.put("12711", "tony");
		simpleHashTable.put("128221", "monu");
		simpleHashTable.put("128222", "monus");
		simpleHashTable.put("128223", "monus1");
		simpleHashTable.put("128224", "monus2");
		simpleHashTable.put("128225", "monus2");
		
		simpleHashTable.printHashTable();
		System.out.println();
		System.out.println(simpleHashTable.getData("128224"));
		System.out.println();
		System.out.println("Removed "+ simpleHashTable.remove("1251"));
		System.out.println();
		simpleHashTable.printHashTable();
		System.out.println();
		System.out.println(simpleHashTable.getData("1"));		
	}
	
//	@Test
	public void test2() {
		
		ChainHashTable simpleHashTable = new ChainHashTable(10);
		
		simpleHashTable.put("123", "johny");
		simpleHashTable.put("1251", "rohny");
		simpleHashTable.put("12711", "tony");
		simpleHashTable.put("128221", "monu");
		simpleHashTable.put("128222", "monus");
		simpleHashTable.put("128223", "monus1");
		simpleHashTable.put("128224", "monus2");
		simpleHashTable.put("128225", "monus2");
		
		simpleHashTable.printHashTable();
        System.out.println();
		System.out.println("Removed "+ simpleHashTable.remove("1251"));
		System.out.println();
		simpleHashTable.printHashTable();
	}
	
//	@Test
	public void test3() {
        List list = new ArrayList();
  		list.add(new StoredEmployees("123", "ronaldo"));
  		list.add(new StoredEmployees("124", "rooney"));
  		list.add(new StoredEmployees("125", "messi"));
 		list.add(new StoredEmployees("126", "ramos"));
 		list.add(new StoredEmployees("126", "neymar"));
 		list.add(new StoredEmployees("123", "kaka"));
 		
 		list.forEach(e -> System.out.println(e));
 		
 		System.out.println();
 		System.out.println();
 		
 		
 		Map<Object, Object> map = new HashMap<Object, Object>();
 		
 		ListIterator itr = list.listIterator();
 		while(itr.hasNext()) {
 			StoredEmployees emp = (StoredEmployees) itr.next();
 			if( map.put(emp.key, emp.employee) != null) {
 				System.out.println("key --> "+emp.key+" value -> "+emp.employee); 				
 			}
 		}
 		
 		
	}
}

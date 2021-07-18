package hashtables;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainHashTable {

    private LinkedList<StoredEmployees>[] hashtable;
	
	public ChainHashTable(int size) {
		hashtable = new LinkedList[size];
		
		for(int i = 0;i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployees>();
		}
	}
	
	private int hashkey(String key) {
//		return key.length() % hashtable.length;
		
		return Math.abs(key.hashCode() % hashtable.length);
	}
	
	public void put(String key, Object object) {
		int index = hashkey(key);
		hashtable[index].add(new StoredEmployees(key, object));
	}
	
	public Object remove(String key) {
        int index = hashkey(key);
		
		ListIterator<StoredEmployees> itr = hashtable[index].listIterator();
		
		StoredEmployees employee = null;
		while(itr.hasNext()) {
			employee = itr.next();
			if(employee.key.equals(key)) {
				break;
			}
		}
		
		if(employee == null && !employee.key.equals(key)) {
			return null;
		}else {
			hashtable[index].remove(employee);
			return employee.employee;
		}
		
	}
	
	public Object getData(String key) {
		int index = hashkey(key);
		
		ListIterator<StoredEmployees> itr = hashtable[index].listIterator();
		while(itr.hasNext()) {
			StoredEmployees employee = itr.next();
			if(employee.key.equals(key)) {
				return employee.employee;
			}
		}
		return null;	
	}
	
	public void getKey(String Key) {
		
	}
	
	public void printHashTable() {
		for(int i=0;i<hashtable.length;i++) {
			if(hashtable[i].isEmpty()) {
				System.out.println("position "+i+" : empty");
			}else {
				ListIterator<StoredEmployees> itr = hashtable[i].listIterator();	
				while(itr.hasNext()) {
					System.out.print("position "+i+" : ");
					StoredEmployees employee = itr.next();
					System.out.println("employee hashkey -->  " + i + " name --> "+employee.employee);
				}		
				
			}
		}
	}
}

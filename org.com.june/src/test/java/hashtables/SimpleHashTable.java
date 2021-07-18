package hashtables;

import java.util.Arrays;

public class SimpleHashTable {

	private StoredEmployees[] hashtable;
	
	public SimpleHashTable(int size) {
		hashtable = new StoredEmployees[size];
	}
	
	public void put(String key, Object object) {
		int index = hashkey(key);
		
		while(isOccupied(index)== true && index < hashtable.length-1) {
			index++;
		}
		
		if(hashtable[index] != null) {
			index = 0;
		}
		
		while(isOccupied(index)== true && index < hashtable.length-1) {
			index++;
		}
		
		if(hashtable[index] != null) {
			System.out.println("hash table is full");
		}else {
			hashtable[index] = new StoredEmployees(key, object);		
		}
	
	}
	
	public boolean isOccupied(int index) {
		
		if(hashtable[index] != null) {
			return true;
		}else {
			return false;
		}
	}
	
	private int hashkey(String key) {
		return key.length() % hashtable.length;
	}
	
	public int getKey(String key) {
		int index = hashkey(key);
		
		if(hashtable[index] != null && hashtable[index].key.equals(key)) {
			return index;
		}else {
			
			while(hashtable[index] != null && !hashtable[index].key.equals(key) && index < hashtable.length) {
				index++;
				
			}
			if(hashtable[index] != null && !hashtable[index].key.equals(key)) {
				index = 0;
			}
			while(hashtable[index] != null && !hashtable[index].key.equals(key) && index < hashtable.length) {
				index++;
			}
		}
		
		if(hashtable[index] != null && hashtable[index].key.equals(key)) {
			return index;	
		}else {
			return -1;
		}
		
	}
	
	public Object remove(String key) {
		int hashedKey = getKey(key);
		
		if(hashedKey == -1) {
			return null;
		}else {
			Object employee = hashtable[hashedKey].employee;
			hashtable[hashedKey].employee = null;
			return employee;
		}
	}
	
	public Object getData(String key) {
		
		int hashkey = getKey(key);
		if(hashkey == -1) {
			return null;
		}else {
			return hashtable[hashkey].employee;		
		}
	}
	
	public void printHashTable() {
		for(int i=0;i<hashtable.length;i++) {
			if(hashtable[i] == null) {
				System.out.println("null");
			}else {
				System.out.println("hashedkey "+i+"-->"+hashtable[i].employee);	
			}
		}
	}
	
}

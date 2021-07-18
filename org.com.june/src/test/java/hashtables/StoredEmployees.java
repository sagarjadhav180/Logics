package hashtables;

public class StoredEmployees {
	
	@Override
	public String toString() {
		return "StoredEmployees [key=" + key + ", employee=" + employee + "]";
	}

	public Object key;
	public Object employee;
	
	public StoredEmployees(Object key, Object employee) {
		this.key = key;
		this.employee = employee;
	}

}

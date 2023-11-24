package assignments;

public class Employee {

	int eid;
	int did;
	int salary;
	
	public Employee(int eid, int did, int salary) {
		super();
		this.eid = eid;
		this.did = did;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", did=" + did + ", salary=" + salary + "]";
	}
	
}
	
	
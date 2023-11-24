package assignments;

import java.util.Arrays;

public class TestEmployee {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(1, 10, 1000), new Employee(2, 10, 2000), new Employee(3, 20, 3000),
				new Employee(4, 20, 4000) };

		System.out.println(Arrays.toString(employees));

		for (Employee employee : employees) {
			
			int avgSalary = getAvgSalary(employee.did , employees);
			
			if (employee.salary > avgSalary)
				System.out.println(employee);

		}
	}

	static int getAvgSalary(int did , Employee[] employees) {

		int sum = 0;
		
		for (Employee employee : employees) {
			if (employee.did == did)
				sum = sum + employee.salary;
			
		}

		int avgSalary = sum / 2;
		return avgSalary;
	}
}

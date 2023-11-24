package assignments;

public class TestStudent {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.rno = 1;
		student1.name = "rakesh";

		Phone[] phones1 = { new Phone(98989898L, 10000), new Phone(98989899L, 20000) };

		student1.phones = phones1;

		Student student2 = new Student();
		student2.rno = 2;
		student2.name = "ramesh";

		Phone[] phones2 = { new Phone(98989897L, 5000), new Phone(98989895L, 30000) };

		student2.phones = phones2;

		Student[] students = { student1, student2 };

		int max = 0;
		Student maxStudent = null;

		for (Student student : students) {
			int totalPrice = getTotalPrice(student.phones);
			if (totalPrice > max) {
				max = totalPrice;
				maxStudent = student;
			}
		}

		System.out.println(max);
		System.out.println(maxStudent);
	}

	static int getTotalPrice(Phone[] phones) {
		int sum = 0;

		for (Phone phone : phones) {
			sum = sum + phone.price;
		}

		return sum;
	}
}

package logical;

public class AdditionEx {

	static int c;

	static int addtion(int a, int b) {
		return c = a + b;

	}

	public static void main(String[] args) {
		AdditionEx additionEx=new AdditionEx();
		int add=additionEx.addtion(10, 20);
		System.out.println("total = " + add);
		
	}
}
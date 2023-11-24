package logicalex;

public class ReverseString {

	public static void main(String[] args) {


		String s = "JAVA";
		char[] a =  s.toCharArray();

		// J A V A
		// 0 1 2 3
		
		for(int index=a.length-1 ; index>=0 ; index-- ) {

			//if(index%2==1) {
				System.out.println(a[index]);
			}
		}


	}
//}

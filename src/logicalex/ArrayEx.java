package logicalex;

public class ArrayEx {

	public static void main(String[] args) {

                // 1  2  3  4 --- Length
		int[] a = {10,20,30,40};
		
	            // 0  1   2  3 	--- Index
		    
		System.out.println(a.length);
		
		for(int index=a.length-1 ; index>=0 ; index--) {
			
			if(index%2==1)
			{
				System.out.println(a[index]);
			}
		}
	}
}


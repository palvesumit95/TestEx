package logical;

public class SeriesEx2 {

	public static void main(String[] args) {

		// Q :- 1 2 4 6 7 18 10 54
		
		int no1=1;//4
		int no2=2;//6
		
		System.out.print(no1 + " " +no2 +" ");
		
		for(int i=1 ; i<=6 ; i++) {
			
			if(i % 2 == 0) {
				no2=no2*3;
				System.out.print(no2+" ");
			}
			
			else {
				no1=no1+3;
			System.out.print(no1+" ");
			
			}
		}
		
		
		
	}
}

package logical;

public class PrimeNoEx {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=10 ; i++) {
			int n=i;
			int count=0;
			
			for(int j=1 ; j<=n ; j++) {
				if (n%j==0) {
					count++;
				}
			}
			if(count==2)
				System.out.println(n +" " + "is Prime Number");
			else
				System.out.println(n +" " +  "Is Not a Prime Number");
		}
		
		
	}

}

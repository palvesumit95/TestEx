package logicalex;

public class ReverseAlternateString {

	public static void main(String[] args) {

		String s = "SUMIT";

		char[] ch = s.toCharArray();


		// S U M I T
		// 0 1 2 3 4


		for(int index=ch.length-1 ; index>=0 ; index--)
		{

			if(index%2==1)

			{
				System.out.println(ch[index]);	
			}

		}



// Without Char Array :- 

		for(int index=s.length()-1 ; index>=0 ; index--)
		{

			if(index%2==1)

			{
				System.out.println(s.charAt(index));	
			}

		}

	}
}

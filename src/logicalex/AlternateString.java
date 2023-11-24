package logicalex;

public class AlternateString {

	public static void main(String[] args) {

		String s = "India Is Best";


		char[] ch = s.toCharArray();

		for(int index=ch.length-1 ; index>=0 ; index--)
		{

			if(index%2==1)
			{

				System.out.println(ch[index]);

			}
		}

		// without char []		

		for(int index=s.length()-1 ; index>=0 ; index--)
		{

			if(index%2==1)
			{
				System.out.println(s.charAt(index));
			}

		}



		// StringBuffer Having direct reverse methods


		StringBuffer sb = new StringBuffer("India  Is Good");
		sb.reverse();
		System.out.println(sb);

	}

}

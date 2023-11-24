package logicalex;

import java.util.Arrays;

public class FrequencyRange {

	public static void main(String[] args) {

		int[] a = {1 , 5 ,4 , 11 , 10 , 6 , 7 , 3,8};

		//count = 1-4
		//count = 5-8
		//count = 9-12

		int count1=0;
		int count2=0;
		int count3=0;



		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i]>=1 && a[i]<=4)

				count1++;

			else if(a[i]>=5 && a[i]<=8)
				count2++;

			else
				count3++;
		}

		System.out.println("1-4 count is = " + count1 );
		System.out.println("5-8 count is = " + count2);
		System.out.println("9-12 count is = " + count3);



		System.out.println();

		// Frequency Range and print numbers

		int[] b= {1 , 5 ,4 , 11 , 10 , 6 , 7 , 3,8};

		int count4=0 , count5=0 , count6=0;

		int[][] k = new int[3][4];
		int l=0;
		int m=0;
		int n=0;


		for(int i=0 ; i<b.length ; i++)
		{
			if(b[i]>=1 && b[i]<=4)
			{
				k[0][l]=b[i];
				l++;

			}

			else if(b[i]>=5 && b[i]<=8)
			{
				k[1][m] = b[i];
				m++;
			}
			else
			{
				k[2][n] = b[i];
				n++;
			}
		}

		System.out.println(Arrays.toString(k[0]));

		System.out.println(Arrays.toString(k[0])+"  "+ l);
		System.out.println(Arrays.toString(k[1])+"  "+ m);
		System.out.println(Arrays.toString(k[2])+"  "+n);

	}
}



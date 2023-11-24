package logical;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) 
	{
		int a[],n,i,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter "+n+" elements : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Given array elements are : ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		// 4 5 3 2 1
		for(i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println("\n Ascending array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\n Descending array : ");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}		
	}

}

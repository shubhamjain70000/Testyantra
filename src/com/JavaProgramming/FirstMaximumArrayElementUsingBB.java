package com.JavaProgramming;

public class FirstMaximumArrayElementUsingBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {45,10,12,18,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("First maximum array Element: "+a[a.length-1]);
		System.out.println("First Minimum array Element: "+a[0]);
		System.out.println("Second maximum array Element: "+a[a.length-2]);
		System.out.println("Second Minimum array element: "+a[1]);

	}

}

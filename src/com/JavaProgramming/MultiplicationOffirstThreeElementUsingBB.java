package com.JavaProgramming;

public class MultiplicationOffirstThreeElementUsingBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,3,2,1};
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
		int fact=1;
		int count=3;
		for(int i=1;i<=count;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}

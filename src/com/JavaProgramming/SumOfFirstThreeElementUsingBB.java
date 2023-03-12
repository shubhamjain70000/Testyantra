package com.JavaProgramming;

public class SumOfFirstThreeElementUsingBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {7,18,45,12,10};
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
		int sum=0;
		int count=3;
		for(int k=0;k<count;k++)
		{
			sum=sum+a[k];
		}
		System.out.println(sum);

	}

}

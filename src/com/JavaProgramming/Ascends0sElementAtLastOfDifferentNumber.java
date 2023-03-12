package com.JavaProgramming;

public class Ascends0sElementAtLastOfDifferentNumber {

	public static void main(String[] args) {
		int a[]= {7,0,4,8,0,0};
		int b[]=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[m]=a[i];
				m++;
			}
			else if(!(a[i]==0))
			{
				b[n]=a[i];
				n--;
			}
		}
		for(int k=0;k<b.length;k++)
		{
			System.out.println(b[k]);
		}

	}

}

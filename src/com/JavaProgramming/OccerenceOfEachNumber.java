package com.JavaProgramming;

import java.util.LinkedHashSet;

public class OccerenceOfEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {6,5,2,6,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(inte==a[i])
				{
					count++;
				}
				
			}
			System.out.println(inte+" occure "+count+" times");
		}
		

	}

}

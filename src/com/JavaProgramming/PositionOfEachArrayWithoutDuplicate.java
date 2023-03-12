package com.JavaProgramming;

import java.util.LinkedHashSet;

public class PositionOfEachArrayWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,5,1,1,6,7,8,6};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(inte==a[i])
				{
					System.out.println(inte+" position is "+(i+1));
					break;
				}
			}
		}

	}

}

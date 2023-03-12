package com.JavaProgramming;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {9,2,5,1,9,1};
//		HashSet<Integer> set=new HashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			set.add(a[i]);
//		}
//		for(Integer inte:set)
//		{
//			System.out.println(inte+" ");
//		}
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			System.out.println(inte+" ");
		}

	}

}

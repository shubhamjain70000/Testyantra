package com.JavaProgramming;

public class AdditionOftwoarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,6,7,7,8,5};
		int length=b.length;
		if(a.length>b.length) {
			length=a.length;
		}
		for(int i=0;i<b.length;i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
			}catch(Exception e) {
				if(a.length>b.length) {
					System.out.print(a[i]+" ");
				}else {
					System.out.print(" "+b[i]);
				}
			}
		}

	}

}

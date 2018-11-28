import java.io.*;
import java.util.*;

class mult
{
	public static void main(String args[])
	{
		int n=0;int i=0;int c=0;
//to find the sum of all the multiples of 3 or 5 below 1000
System.out.println("enter no upto which");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<n;i++)
	{if((i%3==0)||(i%5==0))
		c+=i;
	}
		System.out.println("sum of nos multiples of 3 or 5 upto"+n+"is"+c);
}}	
	
	
	
		
	
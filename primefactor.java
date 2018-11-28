import java.io.*;
import java.util.*;

class primefactor
{
	public static void main(String args[])
	{
		long n=0;
System.out.println("enter no upto which prime factor");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(long i=2;i<=n;i++)
	{
		if(n%i==0){
			n=n/i;
	System.out.println("numbers"+n);}
}}}
		
	
	
	
		
	
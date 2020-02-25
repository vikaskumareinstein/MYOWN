import java.io.*;

class Fibon
{
	public static void main(String args[])
	{int c=0;int d=0;
		
	int a=0,b=1;
	for(int i=0;;i++)
	{
		c=a+b;
		a=b;
		b=c;
		if(c%2==0)
			d+=c;
		if(c>=4000000)
			break;
	}
	System.out.println("sum"+d);
	}
		
}
//vikas project is very good.
		
		
	
	
		
	

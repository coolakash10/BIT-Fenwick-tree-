/*********************************************************************************************************************
     **
     **  Binary Index Tree (Fenwick Tree) Algorithm
     **  Array is used to store tree
	 **  Tree is start from index 1
     **  Input in the form of array
     **  Output is sum between [i,j]
     
     **  Written By:    Akash Vishwas Londhe
     **
*********************************************************************************************************************/

//import package
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    static long a[];
    
    //add element in BIT
    public static void addFenwick(int i,long val)
    {
        
        while(i<a.length)
        {
            a[i]+=val;
            i+=(i&-i);
        }
    }
    
    //query to find sum upto index k in BIT
    public static long query(int k)
    {
        long sum=0;
        while(k>0)
        {
            sum+=a[k];
            k-=(k&-k);
        }
        return sum;
    }
    
    //query to find sum between index i to k
    public static long queryFenwick(int i,int j)
    {
        return query(j)-query(i-1);
    }
    
    //main function
	public static void main (String[] args) throws java.lang.Exception
	{
	   	//size of input array
		int n=10; 
		
		//size of BIT (n+1) i.e index 1
		a=new long[n+1];
		
		String[]s={"3" , "2" , "4" , "0" , "42" , "33" , "-1" , "-2" ,"4" , "4"};
		
		for(int i=1;i<=n;i++)
		{
		    long z=Long.parseLong(s[i-1]);
		    addFenwick(i,z);
		}
		
		 //queries:
		 System.out.println( "Sum of elements from 3 to 5 is :" + queryFenwick(3,5) );
		 addFenwick(5,-2);
		 System.out.println( "Sum of elements from 3 to 5 is :" + queryFenwick(3,5) );
		 addFenwick(6,7);
		 System.out.println( "Sum of elements from 4 to 7 is :" + queryFenwick(4,7));
		 
	}
}
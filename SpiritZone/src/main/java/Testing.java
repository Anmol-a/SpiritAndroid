import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;

import com.spiritzone.StorePassWord;

import sun.awt.SunHints.Value;

public class Testing {
	StorePassWord storedPassword;
	
	
	public static void main(String[] args) throws Exception
	{
//		int r,sum=0;
//		int x = 547;
//		int temp =x;
//
//		while(x>0)
//		{
//			r = x%10;
//			sum = (sum*10)+r;
//			x = x/10;
//		}
//		if(sum == temp)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("not");
//		}
		
		
//		
//		int x = 10;
//		int t1=0,t2=1;
//		int sum,i=1;
//		
//		
//		while (i<10)
//		{
//			System.out.println(t1+" ");
//			sum = t1+t2;
//			t1=t2;
//			t2=sum;
//			i++;
//		}
		
		
//		ArrayList<Integer> Alist  = new ArrayList<Integer>();
//		Alist.add(10);
//		Alist.add(20);
//		Alist.add(30);
//		Alist.add(40);
//		Alist.add(40);
//		Alist.add(50);
//		Alist.add(60);
//		
//		
//		Iterator I = Alist.iterator();
//		while(I.hasNext())
//		{
//
//			System.out.println(I.next());
//		}
//	}

		
//		HashMap<String, Integer> iden = new HashMap<String, Integer>();
//		iden.put("Anmol", 21);
//		iden.put("Bhikari", 16);
//		iden.put("Mummy", 45);
//		iden.put("Papa", 51);
//		
//		
//		Set<String> Key = iden.keySet();
//		
//		for(String Value:Key)
//		{
//			System.out.println("Name "+Value+"  Age "+iden.get(Value));
//		}
		
		
		
//		int[] ten = {1,2,3,4,5,4,6,6,7,9,9};
//		
//		 Arrays.sort(ten);
//		 
//		 for(int x = 0;x<ten.length-1;x++)
//		 {
//
//			 if(ten[x] != ten[x+1])
//			 {
//				 System.out.println(ten[x]);
//			 }
//			 else
//			 {
//				 System.out.println("Dup "+ ten[x+1]);
//			 }
//		 }
		
		
		
//	HashMap<String, Integer> Age = new  HashMap<String, Integer>();
//	Age.put("Anmol", 21);
//	Age.put("jay", 22);
//	Age.put("Yuo", 23);
//	Age.put("Anu", 24);
//
//
//	for(Entry<String, Integer> Age1  : Age.entrySet())
//	{
//	String Name = Age1.getKey();
//	int Value = Age1.getValue();
//	
//	System.out.println("In for Loop Name is  "+Name +" Value "+Value);
//	}
	
		
		
		
		
//	String Original , Reverse="";
//	Original = "Anmol";
//	
//	int length = Original.length();
//	
//	for(int i= length-1;i>=0;i--)
//	{
//		Reverse = Reverse + Original.charAt(i);
//	}
//	
//	
//	if(Original.equalsIgnoreCase(Reverse))
//	{		
//		System.out.println("Palindrome");
//	}
//	
//	else
//	{
//		System.out.println("Not a Palindrome");
//	}
	
		
		
		
		int x[] = {10,23,32,1,22,3,4,5,555,111};
		
		int one ,two = 0 ;
		
		for(int i =0;i<x.length-1;i++)
		{
			one = x[i];
			for(int j =0;j<x.length-1;j++)
			{
				if(one > x[j])
				{
					two=x[j];
				}
				else
				{
					two = one;
				}
			}
			
			
		}
		System.out.println(two);
			
	
	}
}

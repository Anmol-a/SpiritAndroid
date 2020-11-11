import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

import com.spiritzone.StorePassWord;

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
		
		
		
		String a = "Anmol";
		char[] y = a.toCharArray();
		
		for(int x =0;x<y.length;x++)
		{
		System.out.println(y[x]);
		}
		
		
		
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.tools.ant.taskdefs.condition.Or;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;

import com.spiritzone.StorePassWord;

import sun.awt.SunHints.Value;

public class Testing {
	StorePassWord storedPassword;
	
	
	public static void main(String[] args) throws Exception
	{
		
		String one = "OrderID is 27889 and status is Canceled  ";
		String str = one.replaceAll("\\s+$", "");
		String lastWord = str.substring(str.lastIndexOf(" ")+1);
		
		System.out.println(lastWord);
		
		
	}
}

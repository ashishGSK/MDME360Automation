package Driver;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {
	ArrayList<String> l= new ArrayList<String>();
	
@Test(dataProvider="getData")
public void tt(String a,String b,String c)
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	
	
	
	
}


@DataProvider
public String[][] getData()
{
	l.add("asd");
	l.add("as1");
	l.add("as2");
	int a=l.size();
	String[][] ab=new String[1][a];
	for(int i=0;i<a;i++)
	{
		ab[0][i]=l.get(i);
	}
	//ab[0][0]="abc";
	//ab[0][1]="abc";
	//ab[0][2]="abw";
	return ab;
}
}

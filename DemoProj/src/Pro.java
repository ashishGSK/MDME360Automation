import org.testng.annotations.Test;

public class Pro {
@Test(priority=1)
public void a()
{
	System.out.println("a");
}
@Test
public void b()
{
	System.out.println("b");
}
@Test(priority=-1)
public void c()
{
	System.out.println("c");
}
	

@Test(priority=0)
public void d()
{
	System.out.println("d");
}
}

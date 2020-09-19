package TestNGExamples;

import org.testng.annotations.Test;

public class DemoTest {
@Test(priority=4)
public void alpha()
{
	System.out.println("alpha");
	}
@Test(priority=2)
public void beta()
{
	System.out.println("beta");
	}
@Test(priority=1)
public void gamma()
{
	System.out.println("gama");
	}
@Test(priority=3)
public void alpha1()
{
	System.out.println("alpha1");
	}
@Test
public void sigma()
{
	System.out.println("sigma");
	}
}

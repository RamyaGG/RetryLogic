package mytests;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * How to execute failed test cases in Selenium WebDriver using IRetryAnalyzer in TestNG.

I'm sure, you are facing random failure during an automated test run. These failures might not necessarily be because of product bugs. 

These failure can be because of following reasons:

+Random browser issues 
+Browser becoming unresponsive
+Random machine issues
+Server issues like unexpected delay in the response from server
+Application not responding properly
+Application is very slow
+Network is very slow, hence app is very slow
+Ajax Component could not be loaded properly
+HTML DOM is slow


There are two ways to implement retry logic using TestNG Listener:
1. By specifying retryAnalyzer value in the @Test annotation
2. By adding Retry analyser during run time by implementing IAnnotationTransformer interfaces 
*/

public class MyTest {
	
	@Test // (retryAnalyzer = analyser.RetryAnalyser.class) we can use this also
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
 
	@Test  //(retryAnalyzer = analyser.RetryAnalyser.class) method 1
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3()
	{
	Assert.assertEquals(true, true);
	}

}

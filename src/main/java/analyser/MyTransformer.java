package analyser;

import java.lang.reflect.*;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

//Runtime 

public class MyTransformer implements IAnnotationTransformer { 
	//IAnnotationTransformer is a TestNg listner which is used for retry
	//TestNg listner are totally build upon Reflection API in java

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) { // transform is coming from IAnnotationTransformer
		
		annotation.setRetryAnalyzer(RetryAnalyser.class);
		
	}
}

//lets say there 100 testcases out 100 70 got passed. remaing 30 got failed
//so this transform method will listen to those 30 testcases . 
//since we have count as 3 it will exceute each 30 test case 3 times


package analyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{
	
	int counter = 0;
	int retryLimit = 3;
	
	public boolean retry(ITestResult result) { //retry is a method in IRetryAnalyser. Overridden method
		
		if(counter < retryLimit) {
			counter ++;
			return true;
			
		}
		
			return false;
	   }
		
	}



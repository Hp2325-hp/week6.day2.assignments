package week6.day2.assignments.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	int retrycount=0;
	public boolean retry(ITestResult result) {
		if(retrycount<=4)
		{
			retrycount++;
			return true;
		}
		return false;
	}

}

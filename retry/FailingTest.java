package week6.day2.assignments.retry;

import org.testng.annotations.Test;

public class FailingTest {

	@Test(timeOut=500,retryAnalyzer = RetryFailedTests.class)
	public void failTest() throws InterruptedException {
		int random=(int)(Math.random()*1000);
		System.out.println(random);
		System.out.println("Hi This may fails");
		Thread.sleep(random);
	}

}

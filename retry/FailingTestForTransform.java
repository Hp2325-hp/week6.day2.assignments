package week6.day2.assignments.retry;

import org.testng.annotations.Test;

public class FailingTestForTransform {
	
	@Test(groups= {"groupsmethod"})
	public void createLead(){
		
		System.out.println("Hi This Create Lead may fails");
		
		throw new RuntimeException();
		
	}
	
	
	@Test()
	public void editLead()
	{
		System.out.println("Hi This Edit Lead may fails");
		
		throw new RuntimeException();
	}
	
	@Test(groups= {"groupsmethod"})
	public void groups()
	{
		System.out.println("This is groups method");
	}
	
}

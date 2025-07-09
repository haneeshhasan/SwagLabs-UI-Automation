package Session46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {

	
	 public void onTestStart(ITestResult result) {

		 System.out.println("Test Started");
		 }
	 
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Success");
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test Failed");
	  }
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test Skipped");
		  }
	  
	  
	   public void onFinish(ITestContext context) {
		   System.out.println("Test Execution Finished");
	   }
	   
	   public void onStart(ITestContext context) {
System.out.println("Test Execution started");
	   }
}

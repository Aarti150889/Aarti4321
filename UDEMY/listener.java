package UDEMY;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		
	    System.out.println("start");	  }
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		  }
	 public void onTestFailure(ITestResult result) {
		    // not implemented
		  }
	 public void onTestSkipped(ITestResult result) {
		    // not implemented
		  }



}

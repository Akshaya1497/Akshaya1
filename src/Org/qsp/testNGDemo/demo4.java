package Org.qsp.testNGDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class demo4 implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
	   System.out.print(context.getEndDate());
	   System.out.print(context.getPassedTests());
	   System.out.print(context.getFailedTests());
	   System.out.print(context.getSkippedTests());
	}
	@Override
	public void onStart(ITestContext context) {
	   System.out.print(context.getStartDate());
	   System.out.print(context.getAllTestMethods());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.print(result.getStatus());
		 System.out.print(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.print(result.getStatus());
		 System.out.print(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.print(result.getStatus());
		 System.out.print(result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 System.out.print(result.getStatus());
		 System.out.print(result.getTestName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.print(result.getStatus());
		 System.out.print(result.getName());
	}

	
}

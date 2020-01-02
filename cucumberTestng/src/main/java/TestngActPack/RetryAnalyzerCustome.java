package TestngActPack;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerCustome implements IRetryAnalyzer {

	int count = 1;
	
	int maxcount=3;
	
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if (count<maxcount)
		{
			System.out.println("retrying"+count+" --time");
			
			count++;
			return true;
		}
		
		
		
		return false;
	}

}

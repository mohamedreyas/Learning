package Testng;

import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import junit.framework.Assert;

public class ClassD {
	
	@Test
	public void Tc1() {
		System.out.println("Tc1");

	}
	
	@Test(retryAnalyzer=Rerun.class)
	public void Tc2() {
		System.out.println("Tc2");
		Assert.assertTrue(false);

	}
	@Test(retryAnalyzer=Rerun.class)
	public void Tc3() {
		System.out.println("Tc3");
		Assert.assertTrue(false);

	}
	
	
	@Test
	private void df() {
	System.out.println("123");	
	}
	
	
	private void sysout() {
		// TODO Auto-generated method stub

	}
	

}

package Testng;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups="smoke")
	public void Tc1() {
		System.out.println("Tc1"+Thread.currentThread().getId());

	}
	
	@Test(groups="regression")
	public void Tc2() {
		System.out.println("Tc2"+Thread.currentThread().getId());

	}
	@Test(groups="smoke")
	public void Tc3() {
		System.out.println("Tc3"+Thread.currentThread().getId());

	}

}

package Testng;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test(groups="scanity")
	public void Tc11() {
		System.out.println("Tc11"+Thread.currentThread().getId());

	}
	
	@Test(groups="regression")
	public void Tc22() {
		System.out.println("Tc22"+Thread.currentThread().getId());

	}
	@Test(groups="smoke")
	public void Tc33() {
		System.out.println("Tc33"+Thread.currentThread().getId());

	}

}

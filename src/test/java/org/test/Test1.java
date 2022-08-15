package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeClass
	private void start() {
System.out.println("start");
	}
	
	@AfterClass
	private void end() {
System.out.println("end");
	}
	@BeforeMethod
	private void open() {
System.out.println("open");
	}
	@AfterMethod
	private void close() {
System.out.println("close");
	}
	@Test
	private void tc1() {
System.out.println("TEST1");

	}
	@Test
	private void tc2() {
System.out.println("TEST2");
	}
	@Test
	private void tc3() {
System.out.println("TEST3");
	}

}

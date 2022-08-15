package org.junit;

import org.utilities.BaseClass;

public class JUnit extends BaseClass{
@BeforeClass
public static void bfClass() {

	System.out.println("Started");
}
@AfterClass
public static void afClass() {

	System.out.println("End");
}
@BeforeClass
public static void bf() {

	launchChrome();
	
}

@AfterClass
public static void af() {

	winClose();
}
@Test
public void tc1() {

	loadUrl("https://www.facebook.com");
}

}

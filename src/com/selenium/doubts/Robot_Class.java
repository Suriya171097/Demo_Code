package com.selenium.doubts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot_Class {

	public static void robot() throws Throwable {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
	}

}

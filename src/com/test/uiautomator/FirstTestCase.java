package com.test.uiautomator;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class FirstTestCase extends UiAutomatorTestCase {
	
	public void testingCalculator() throws UiObjectNotFoundException { 
		getUiDevice().pressHome();
		
		UiObject Applications = new UiObject(new UiSelector().description("Apps"));
		Applications.clickAndWaitForNewWindow();
		
		UiObject apps = new UiObject(new UiSelector().text("Apps"));
		apps.click();
		
		UiScrollable ListOfapplications = new UiScrollable(new UiSelector().enabled(true));
		
		UiObject Calculator = ListOfapplications.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()),"Calculator");
		Calculator.clickAndWaitForNewWindow();
		
		UiObject seven = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit7"));
		seven.click();
		
		UiObject plus = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/plus"));
		plus.click();
		
		UiObject one = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/digit1"));
		one.click();
		
		UiObject result = new UiObject(new UiSelector().resourceId("com.android.calculator2:id/equal"));
		result.click();
		
		getUiDevice().pressBack();
		
	}

}

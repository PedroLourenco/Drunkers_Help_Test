package com.drunkers_help_test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.webkit.WebView.FindListener;
import android.widget.EditText;
import android.widget.SearchView;

import com.drunkers_help.R;
import com.drunkers_helper.activity.AddBeerActivity;
import com.drunkers_helper.activity.MainActivity;
import com.robotium.solo.Solo;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;
	private Activity activity; 
	
	public MainActivityTest() {
		super(MainActivity.class);

	}
	
	
	
	@Override
	public void setUp() throws Exception {
		//setUp() is run before a test case is started. 
		//This is where the solo object is created.
		 activity = this.getActivity(); 
		solo = new Solo(getInstrumentation(), this.getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		//tearDown() is run after a test case has finished. 
		//finishOpenedActivities() will finish all the activities that have been opened during the test execution.
		solo.finishOpenedActivities();
		System.out.println("There are " + this.countTestCases() + "test cases"); 
	
	}
	
	
	public void testResetCounter(){
		  
		solo.clickOnView(solo.getCurrentActivity().findViewById(R.id.btnResetCounter));
		 	 
		solo.clickOnView(solo.getCurrentActivity().findViewById(R.id.btnResetCounter));
		
		 assertTrue(solo.waitForText("Counter was reset!"));
		 
	}

	
	/*public void testAddBeer(){
		
		
		
		solo.clickOnView(getActivity().findViewById(R.id.SubMenu_overflow));
		
		 solo.sleep(1000);
		//assertTrue("did not get PrefsActivity", solo.waitForActivity("Add Beer"));
		getInstrumentation().invokeMenuActionSync(solo.getCurrentActivity(), R.id.menu_addBeer, 0);
		
		 solo.sleep(1000);
		
		solo.assertCurrentActivity("Expected Add Beer activity", AddBeerActivity.class);
				
		solo.enterText((EditText) solo.getView(R.id.newBeer), "Cergallll");
		 
		 solo.sleep(1000);
		 
		solo.clickOnView(solo.getCurrentActivity().findViewById(R.id.menu_addBeer));
		
		 solo.sleep(1000);
		 
		 solo.assertCurrentActivity("Expected Main Activity activity", MainActivity.class);
		 
		 
		 solo.sleep(3000);
		solo.clickOnView(solo.getCurrentActivity().findViewById(R.id.menu_search));
		 solo.sleep(3000);
		 
		 solo.enterText((SearchView) solo.getView(R.id.menu_search), "Cergallll");
		 
		 solo.sleep(3000);
		 //solo.searchText("Cergallll");
		 //solo.sendKey(Solo.ENTER);
		 
		 //solo.clickOnView(getActivity().findViewById(R.id.menu_addBeer));
		//solo.clickon
		//solo.clickOnMenuItem("Add Beer");
		//solo.clickOnMenuItem("Options");
		//solo.sleep(1000); // give it time to change activity
		//solo.clickOnView(getActivity().findViewById(R.id.menu_addBeer));
		//solo.clickOnMenuItem("Drunker\'s Helper",true);
		 
		
	}
	
	*/
	

}

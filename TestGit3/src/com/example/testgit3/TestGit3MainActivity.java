package com.example.testgit3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestGit3MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_git3_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test_git3_main, menu);
		return true;
	}

}

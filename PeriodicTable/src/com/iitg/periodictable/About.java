package com.iitg.periodictable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		finish();
		Intent pt = new Intent(this, PeriodicTable.class);
		startActivity(pt);
	}
}

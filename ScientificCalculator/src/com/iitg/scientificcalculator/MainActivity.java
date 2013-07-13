package com.iitg.scientificcalculator;

import com.iitg.scientificcalculator.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;
import android.content.Intent;

public class MainActivity extends ListActivity {
	
	String options[]={"Calculator", "Interest Calculator"};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.about:
			Intent i = new Intent("com.iitg.scientificcalculator.ABOUT");
			startActivity(i);
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
			switch(position){
				case 0:
					Intent basic = new Intent(this,Basic.class);
					startActivity(basic);
					break;
				case 1:
					Intent interest = new Intent(this,InterestCalculator.class);
					startActivity(interest);
					break;
			}
	}
}

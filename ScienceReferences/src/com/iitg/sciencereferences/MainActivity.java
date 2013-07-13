package com.iitg.sciencereferences;

import com.iitg.sciencereferences.*;

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

	String options[] = {"Physics Formulas", "Chemistry Formulas", "Phy-Chem Constants"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, options));
	}

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
			Intent i = new Intent("com.iitg.sciencereferences.ABOUT");
			startActivity(i);
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		switch (position) {
		case 0:
			Intent phy = new Intent(this, Physics.class);
			startActivity(phy);
			break;
		case 1:
			Intent chem = new Intent(this, Chemistry.class);
			startActivity(chem);
			break;
		case 2:
			Intent interest = new Intent(this, Phy_Chem.class);
			startActivity(interest);
			break;
		}
	}
}

package com.iitg.scientificcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class History extends Activity {

	Button bHistory;
	EditText tvHistory;
	String history="";
	
	String back = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history);
		
		bHistory = (Button)findViewById(R.id.bHide);
		tvHistory = (EditText)findViewById(R.id.tvHistory);
		
		Bundle get = getIntent().getExtras();
		history = get.getString("hist");
		try{
			back = get.getString("1");
		} catch (Exception e) {
			// Do nothing.
		}
		if(history.length()==0)
			tvHistory.setText("No Calculation Recorded");
		else tvHistory.setText(history);
	}
	
	public void whenClick(View v){
		if(back.equalsIgnoreCase(("other"))){
			Intent calcO = new Intent(this,Other.class);
			Bundle passbackO = new Bundle();
			passbackO.putString("hist", history);
			calcO.putExtras(passbackO);
			finish();
			startActivity(calcO);
		}
		else if(back.equalsIgnoreCase("basic")){
			Intent calc = new Intent(this,Basic.class);
			Bundle passback = new Bundle();
			passback.putString("hist", history);
			calc.putExtras(passback);
			finish();
			startActivity(calc);
		}
	}
}

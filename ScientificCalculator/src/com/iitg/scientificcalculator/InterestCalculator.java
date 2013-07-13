package com.iitg.scientificcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InterestCalculator extends Activity {

	Button si, ci, diff, clear;
	EditText principal, year, rate;
	TextView tv;
	
	String p="" , n="" ,r="" ;
	Double res = new Double(0);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interest_calculator);
		initialise();
	}

	public void whenClick(View v) {
		switch (v.getId()) {
			case R.id.si:
				try{
					p = principal.getText().toString();
					n = year.getText().toString();
					r = rate.getText().toString();
					Double res = new Double(0);
					res = Double.parseDouble(p)*Double.parseDouble(n)*Double.parseDouble(r);
					res = res/100;
					tv.setText("SI = " + res.toString());
				} catch (Exception e) {
					tv.setText("Fill all the fields ");
				}
				break;
	
			case R.id.ci:
				try{
					p = principal.getText().toString();
					n = year.getText().toString();
					r = rate.getText().toString();
					Double dp = Double.parseDouble(p);
					Double dn = Double.parseDouble(n);
					Double dr = Double.parseDouble(r);
					Double amt = Math.pow((1+(dr/100)), dn);
					amt = amt*dp ;
					res = amt-dp;
					tv.setText("CI = " + res.toString());
				} catch (Exception e) {
					tv.setText("Fill all the fields ");
				}
				break;
	
			case R.id.diff:
				try{
					p = principal.getText().toString();
					n = year.getText().toString();
					r = rate.getText().toString();
					Double dp1 = Double.parseDouble(p);
					Double dn1 = Double.parseDouble(n);
					Double dr1 = Double.parseDouble(r);
					Double amt1 = Math.pow((1+dr1/100), dn1);
					amt1 = amt1*dp1 - dp1;
					res = (dp1*dn1*dr1)/100;
					res = amt1 - res;
					tv.setText("CI - SI = " + res.toString());
				} catch (Exception e) {
					tv.setText("Fill all the fields ");
				}
				break;
	
			case R.id.clear:
					principal.setText("");
					year.setText("");
					rate.setText("");
					tv.setText("");
				break;
		}
	}

	public void initialise() {
			si = (Button) findViewById(R.id.si);
			ci = (Button) findViewById(R.id.ci);
			diff = (Button) findViewById(R.id.diff);
			clear = (Button) findViewById(R.id.clear);
	
			principal = (EditText) findViewById(R.id.principal);
			year = (EditText) findViewById(R.id.year);
			rate = (EditText) findViewById(R.id.rate);
			
			tv = (TextView)findViewById(R.id.tv);
	}
}

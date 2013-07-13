package com.iitg.scientificcalculator;

import java.math.BigDecimal;
import java.math.MathContext;

import com.iitg.scientificcalculator.*;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Advanced extends Activity {
	Button bsinh,bcosh,btanh,bmr,bms,bmminus,bmplus,btan,bcos,bsin,blog,bln,be,bmod,bpi,bper,b1byx,bnsqrt,b3sqrt,bsqrt,bfact,bxn,bx2,bx3,bmc;
	EditText tvAdv;
	Button modeB, modeA, modeO;
	
	private Double mem = (double) 0;
	String disp = "";
	String history="";

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.basicmenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.clearHistory:
				history = "";
			break;
		}
		return false;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_advanced);
		initialise();
		
		try{
			Bundle get = getIntent().getExtras();
			disp = get.getString("infix");
			if(disp.equalsIgnoreCase("wrong format")){
				tvAdv.setText("");
				disp="";
			}
			else tvAdv.setText(disp);
			try{
				mem = get.getDouble("mem");
			} catch (Exception e) {
				// Do nothing.
			}
			try{
				history=get.getString("hist");
			} catch (Exception e) {
				// Do nothing.
			}
		} catch (Exception e) {
			// Do nothing.
		}
	}
	
	public void whenClick(View v){
		switch(v.getId()){
		case R.id.bsinh:;
			disp+="sinh(";
			tvAdv.setText(disp);	
			break;
		case R.id.bcosh:
			disp+="cosh(";
			tvAdv.setText(disp);	
			break;
		case R.id.btanh:
			disp+="tanh(";
			tvAdv.setText(disp);	
			break;		
		case R.id.bmr:
				disp += mem.toString();
				tvAdv.setText(disp);
			break;
		case R.id.bms:
			try{
				mem=Double.parseDouble(tvAdv.getText().toString());
				Toast t = Toast.makeText(this, "Value " + mem.toString() + " is stored in memory ", Toast.LENGTH_SHORT);
				t.show();
			} catch (Exception e) {
				tvAdv.setText("Only numbers can be store in memory!");
			}
			break;
		case R.id.bmc:
				mem = (double) 0;
				Toast t = Toast.makeText(this, "Memory cleared", Toast.LENGTH_SHORT);
				t.show();
			break;	
		case R.id.btan:
			disp+="tan(";
			tvAdv.setText(disp);	
			break;	
		case R.id.bcos:
			disp+="cos(";
			tvAdv.setText(disp);	
			break;
		case R.id.bsin:
			disp+="sin(";
			tvAdv.setText(disp);	
			break;
		case R.id.bmminus:
			try{
				Double x=new Double(tvAdv.getText().toString());
				mem = mem-x;
				Toast t2 = Toast.makeText(this, "Value " + x.toString() + " is substracted from memory ", Toast.LENGTH_SHORT);
				t2.show();
			} catch (Exception e) {
				tvAdv.setText("Compute Expression and then substract!");
			}
			break;
		case R.id.bmplus:
			try{
				Double x=new Double(tvAdv.getText().toString());
				mem = mem+x;
				Toast t1 = Toast.makeText(this, "Value " + x.toString() + " is added to memory ", Toast.LENGTH_SHORT);
				t1.show();
			} catch (Exception e) {
				tvAdv.setText("Compute Expression and then add!");
			}
			break;
		case R.id.bpi:
				disp+=Math.PI;
				tvAdv.setText(disp);
			break;
		case R.id.bmod:
				disp+="mod(";
				tvAdv.setText(disp);
			break;
		case R.id.be:
				disp+=Math.E;
				tvAdv.setText(disp);
			break;
		case R.id.bln:
			disp+="ln(";
			tvAdv.setText(disp);
			break;	
		case R.id.blog:
			disp+="log(";
			tvAdv.setText(disp);
			break;	
		case R.id.bsqrt:
			disp+="sqrt(";
			tvAdv.setText(disp);
			break;
		case R.id.b3sqrt:
			disp+="cuberoot(";
			tvAdv.setText(disp);
			break;
		case R.id.bnsqrt:
			disp+="nroot(";
			tvAdv.setText(disp);
			break;			
		case R.id.b1byx:
				disp+="reciproc(";
				tvAdv.setText(disp);
			break;
		case R.id.bpercentage:
				disp+="%";
				tvAdv.setText(disp);
			break;
		case R.id.bx2:
			disp+="^2";
			tvAdv.setText(disp);
			break;
		case R.id.bx3:
			disp+="^3";
			tvAdv.setText(disp);
			break;
		case R.id.bxn:
			disp+="^(";
			tvAdv.setText(disp);
			break;
		case R.id.bfact:
			disp+="!";
			tvAdv.setText(disp);	
			break;

		// Mode change
		// ==============================================================
		case R.id.modeB:
			Intent basic = new Intent(this,Basic.class);
			Bundle passtoBasic = new Bundle();
			passtoBasic.putString("mod", tvAdv.getText().toString());
			passtoBasic.putDouble("mem", mem);
			passtoBasic.putString("hist", history);
			basic.putExtras(passtoBasic);
			finish();
			startActivity(basic);
			break;
			
		case R.id.modeO:
			Intent other = new Intent(this,Other.class);
			Bundle passtoOther = new Bundle();
			passtoOther.putString("hist", history);
			other.putExtras(passtoOther);
			finish();
			startActivity(other);
			break;	
		
		// ===============================================================	
		}

	}
	
	private void initialise() {
		bsinh = (Button)findViewById(R.id.bsinh);
		bcosh = (Button)findViewById(R.id.bcosh);
		btanh = (Button)findViewById(R.id.btanh);
		bmr = (Button)findViewById(R.id.bmr); 
		bms = (Button)findViewById(R.id.bms);
		bmminus = (Button)findViewById(R.id.bmminus); 
		bmplus = (Button)findViewById(R.id.bmplus);
		btan = (Button)findViewById(R.id.btan);
		bcos = (Button)findViewById(R.id.bcos);
		bsin = (Button)findViewById(R.id.bsin);
		blog = (Button)findViewById(R.id.blog);
		bln = (Button)findViewById(R.id.bln);
		be = (Button)findViewById(R.id.be);
		bmod = (Button)findViewById(R.id.bmod);
		bpi = (Button)findViewById(R.id.bpi);
		bper = (Button)findViewById(R.id.bpercentage);
		b1byx = (Button)findViewById(R.id.b1byx);
		bnsqrt = (Button)findViewById(R.id.bnsqrt);
		b3sqrt = (Button)findViewById(R.id.b3sqrt);
		bsqrt = (Button)findViewById(R.id.bsqrt);
		bmc = (Button)findViewById(R.id.bmc);
		bfact = (Button)findViewById(R.id.bfact);
		bxn = (Button)findViewById(R.id.bxn);
		bx3 = (Button)findViewById(R.id.bx3);
		bx2 = (Button)findViewById(R.id.bx2);
		
		tvAdv=(EditText)findViewById(R.id.tvAdv);
		
		modeB = (Button) findViewById(R.id.modeB);
		modeA = (Button) findViewById(R.id.modeA);
		modeO = (Button) findViewById(R.id.modeO);
		
		modeA.setText(Html.fromHtml("<u>Adv</u>"));
	}
}

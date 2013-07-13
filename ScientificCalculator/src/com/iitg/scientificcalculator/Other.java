package com.iitg.scientificcalculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;

import org.*;

import com.iitg.scientificcalculator.*;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Other extends Activity {

	Button bCOther, bHypo, bRand, benter, bnpr, bncr, blog2, bBMI,bx1, bx2, b2u, b3u, basin, bacos, batan, bequal, bOHistory;
	EditText tvOther,tvOther1;
	Button modeB, modeA, modeO;
	
	String history = "";
	
	String n1="" ,n2="", n3="", n4="", n5="", n6="", n7="", n8="", n9="", n10="", n11="", n12="";
	int Hypo=0, ax=0, per=0, com=0, ax2=0, u2=0, u3=0, bmi=0, asin=0, acos=0, atan=0, log=0, rand=0;
	
	
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
		setContentView(R.layout.activity_other);
		initialise();	
	
		try{
				Bundle get = getIntent().getExtras();
				history = get.getString("hist");
			} catch (Exception e) {
				// Do nothing.
			}
		
		blog2.setText(Html.fromHtml("log<sub>2</sub>"));
		tvOther1.setEnabled(false);
		tvOther.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
	}
	
	public void whenClick(View v){
		switch(v.getId()){
		case R.id.bBMI:
				tvOther1.setText("(Weight (kg), Height in m) = (");
				tvOther.setText("");
				bmi=1;
			break;	
		case R.id.blogBase2:
				tvOther1.setText(Html.fromHtml("log<sub>2</sub> ("));
				tvOther.setText("");
				log=1;
			break;
		case R.id.basin:
				tvOther1.setText("asin(");
				tvOther.setText("");
				asin=1;
			break;	
		case R.id.bacos:
				tvOther1.setText("acos(");
				tvOther.setText("");
				acos=1;
			break;
		case R.id.batan:
				tvOther1.setText("atan(");
				tvOther.setText("");
				atan=1;
			break;
		case R.id.bHypo:
			tvOther1.setText("(a, b) = (");
			tvOther.setText("");
			Hypo=1;
			break;
		case R.id.bRand:
			tvOther1.setText("Random no. between [0,n) \n n = ");
			tvOther.setText("");
			rand=1;
			break;
		case R.id.bncr:
			tvOther1.setText("(n, r) = (");
			tvOther.setText("");
			com=1;
			break;
		case R.id.bnpr:
			tvOther1.setText("(n, r) = (");
			tvOther.setText("");
			per=1;
			break;
		case R.id.bx1:
			tvOther1.setText("(a, b, d) = (");
			tvOther.setText("");
			ax=1;
			break;	
		case R.id.bx2:
			tvOther1.setText("(a, b, c, d) = (");
			tvOther.setText("");
			ax2=1;
			break;
		case R.id.b2u:
			tvOther1.setText("ax + by = e,  cx + dy = f \n" +"(a, b, e, c, d, f) = (");
			tvOther.setText("");
			u2=1;
			break;
		case R.id.b3u:
			tvOther1.setTextSize(15);
			tvOther1.setText("ax+by+cz = d,  ex+fy+gz = h,  px+qy+rz = s \n" +"(a, b, c, d, e, f, g, h, p, q, r, s) = (");
			tvOther.setText("");
			u3=1;
			break;
			
		case R.id.benter:
				tvOther1.setText(tvOther1.getText().toString() + tvOther.getText().toString() + ", ");
				if(per==1){
					n1 = tvOther.getText().toString();
					tvOther.setText("");
					per=1;
				}
				else if(com==1){
					n1 = tvOther.getText().toString();
					tvOther.setText("");
					com=1;
				}
				else if(Hypo==1){
					n1 = tvOther.getText().toString();
					tvOther.setText("");
					Hypo=1;
				}
				else if(bmi==1){
					n1 = tvOther.getText().toString();
					tvOther.setText("");
					bmi=1;
				}
				else if(u3==1 || u3==2 || u3==3 ||u3==4 || u3==5 || u3==6 || u3==7 || u3==8 || u3==9 || u3==10 || u3==11){
					if(u3==1){
						n1 = tvOther.getText().toString();
						tvOther.setText("");
						u3=2;
					}
					else if(u3==2){
						n2 = tvOther.getText().toString();
						tvOther.setText("");
						u3=3;
					}
					else if(u3==3){
						n3 = tvOther.getText().toString();
						tvOther.setText("");
						u3=4;
					}
					else if(u3==4){
						n4 = tvOther.getText().toString();
						tvOther.setText("");
						u3=5;
					}
					else if(u3==5){
						n5 = tvOther.getText().toString();
						tvOther.setText("");
						u3=6;
					}
					else if(u3==6){
						n6 = tvOther.getText().toString();
						tvOther.setText("");
						u3=7;
					}
					else if(u3==7){
						n7 = tvOther.getText().toString();
						tvOther.setText("");
						u3=8;
					}
					else if(u3==8){
						n8 = tvOther.getText().toString();
						tvOther.setText("");
						u3=9;
					}
					else if(u3==9){
						n9 = tvOther.getText().toString();
						tvOther.setText("");
						u3=10;
					}
					else if(u3==10){
						n10 = tvOther.getText().toString();
						tvOther.setText("");
						u3=11;
					}
					else if(u3==11){
						n11 = tvOther.getText().toString();
						tvOther.setText("");
						u3=1;
					}
				}
				else if(u2==1 || u2==2 || u2==3 || u2==4 || u2==5){
					if(u2==1){
						n1 = tvOther.getText().toString();
						tvOther.setText("");
						u2=2;
					}
					else if(u2==2){
						n2 = tvOther.getText().toString();
						tvOther.setText("");
						u2=3;
					}
					else if(u2==3){
						n3 = tvOther.getText().toString();
						tvOther.setText("");
						u2=4;
					}
					else if(u2==4){
						n4 = tvOther.getText().toString();
						tvOther.setText("");
						u2=5;
					}
					else if(u2==5){
						n5 = tvOther.getText().toString();
						tvOther.setText("");
						u2=1;
					}
				}
				else if(ax==1||ax==2){
					if(ax==1){
						n1 = tvOther.getText().toString();
						tvOther.setText("");
						ax=2;
					}
					else if(ax==2){
						n2 = tvOther.getText().toString();
						tvOther.setText("");
						ax=1;
					}
				}
				else if(ax2==1 || ax2==2 || ax2==3){
					if(ax2==1){
						n1 = tvOther.getText().toString();
						tvOther.setText("");
						ax2=2;
					}
					else if(ax2==2){
						n2 = tvOther.getText().toString();
						tvOther.setText("");
						ax2=3;
					}
					else if(ax2==3){
						n3 = tvOther.getText().toString();
						tvOther.setText("");
						ax2=1;
					}
				}
			break;
			
		case R.id.bequal:
			try{
				if(rand==1){
				rand=0;
				int negative = 0;	
				n1 = tvOther.getText().toString();
					if(n1.charAt(0)=='-'){
						n1 = n1.substring(1, n1.length());
						negative = 1;
					}	
					Random r = new Random();
					Integer result = r.nextInt((Integer.parseInt(n1)));
					if(negative==0){
						tvOther1.setText("Random no. [0," + n1 + ") = " + result);
						history += "Random no. [0," + n1 + ") = " + result + "\n\n";
					}
					else{
						tvOther1.setText("Random no. [0," + "-" + n1 + ") = -" + result);
						history += "Random no. [0," + "-" + n1 + ") = -" + result + "\n\n";
					}
					tvOther.setText("");					
				}
				else if(log==1){
					n1 = tvOther.getText().toString();
					Double base2 = Math.log10(Double.parseDouble(n1))/Math.log10(2.0);
					tvOther1.setText(Html.fromHtml("log<sub>2</sub>(" + n1 + ") = " + base2.toString()));
					tvOther.setText("");
					log=0;
					history += Html.fromHtml("log (base 2) ");
					history += "(" + n1 + ") = " + base2.toString() + "\n\n";
				}
				else if(asin==1){
					n1 = tvOther.getText().toString();
					Double ans = Math.asin(Double.parseDouble(n1));
					tvOther1.setText("asin(" + n1 + ") = " + ans);
					tvOther.setText("");
					asin=0;
					history += "asin(" + n1 + ") = " + ans + "\n\n";
				}
				else if(acos==1){
					n1 = tvOther.getText().toString();
					Double ans = Math.acos(Double.parseDouble(n1));
					tvOther1.setText("acos(" + n1 + ") = " + ans);
					tvOther.setText("");
					acos=0;
					history += "acos(" + n1 + ") = " + ans + "\n\n";
				}
				else if(atan==1){
					n1 = tvOther.getText().toString();
					Double ans = Math.atan(Double.parseDouble(n1));
					tvOther1.setText("atan(" + n1 + ") = " + ans);
					tvOther.setText("");
					atan=0;
					history += "atan(" + n1 + ") = " + ans + "\n\n";
				}
				else if(bmi==1){
					bmi=0;
					n2 = tvOther.getText().toString();
					Double bmi = Double.parseDouble(n1)/Math.pow(Double.parseDouble(n2),2);
					tvOther1.setText("(Weight (kg), Height in m) = (" + n1 + ", " + n2 +")\n BMI = " + bmi);
					tvOther.setText("");
				
					history += "(Weight (kg), Height in m) = (" + n1 + ", " + n2 + ")\nBMI = " + bmi + "\n\n";
					
					if(bmi<=15){
						Toast t = Toast.makeText(this, "You are Very Severely Underweight", Toast.LENGTH_LONG);
						t.show();
					}
					else if(bmi>15 && bmi <= 16){
						Toast t = Toast.makeText(this, "You are Severely Underweight", Toast.LENGTH_LONG);
						t.show();
					}
					else if(bmi>16 && bmi <=18.5){
						Toast t = Toast.makeText(this, "You are Underweight", Toast.LENGTH_LONG);
						t.show();
					}
					else if(bmi>18.5 && bmi <=25){
						Toast t = Toast.makeText(this, "You are Normal (Healthy weight)", Toast.LENGTH_LONG);
						t.show();
					}	
					else if(bmi>25 && bmi <=30){
						Toast t = Toast.makeText(this, "You are Overweight", Toast.LENGTH_LONG);
						t.show();
					}
					else if(bmi>30 && bmi <=35){
						Toast t = Toast.makeText(this, "You are in Obsese Class I (Moderately Obese)", Toast.LENGTH_LONG);
						t.show();
					}
					else if(bmi>35 && bmi <=40){
						Toast t = Toast.makeText(this, "You are in Obese Class II (Severely Obese)", Toast.LENGTH_LONG);
						t.show();
					}
					else if(bmi>40){
						Toast t = Toast.makeText(this, "You are in Obese Class III (Very Severely Obese)", Toast.LENGTH_LONG);
						t.show();
					}
				}
				else if(u3==1){
					n12 = tvOther.getText().toString();			
					Double a = Double.parseDouble(n1);
					Double b = Double.parseDouble(n2);
					Double c = Double.parseDouble(n3);
					Double d = Double.parseDouble(n4);
					
					Double e = Double.parseDouble(n5);
					Double f = Double.parseDouble(n6);
					Double g = Double.parseDouble(n7);
					Double h = Double.parseDouble(n8);
					
					Double i = Double.parseDouble(n9);
					Double j = Double.parseDouble(n10);
					Double k = Double.parseDouble(n11);
					Double l = Double.parseDouble(n12);
					
					Double delta = (a*f*k)+(b*g*i)+(c*e*j)-(c*f*i)-(a*g*j)-(b*e*k);
					
					Double xnum = (d*f*k)+(b*g*l)+(c*h*j)-(c*f*l)-(d*g*j)-(b*h*k);
					Double xans = xnum/delta;
					
					Double ynum = (a*h*k)+(d*g*i)+(c*e*l)-(c*h*i)-(a*g*l)-(d*e*k);
					Double yans = (ynum/delta);
					
					Double znum = (a*f*l)+(b*h*i)+(d*e*j)-(d*f*i)-(a*h*j)-(b*e*l);
					Double zans = znum/delta;
					tvOther1.setTextSize(20);
					tvOther1.setText(n1 + "x+" + n2 + "y+" + n3 + "z = " + n4 + ", " + n5 + "x+" + n6 + "y+" + n7 + "z = " + n8 + ", " + n9 + "x+" +
							n10 + "y+" + n11 + "z = " + n12 + "\nx = " + xans + ", y = " + yans + ", z = " + zans);  
					tvOther.setText("");
					
					history += n1 + "x+" + n2 + "y+" + n3 + "z = " + n4 + ", " + n5 + "x+" + n6 + "y+" + n7 + "z = " + n8 + ", " + n9 + "x+" +
					n10 + "y+" + n11 + "z = " + n12 + "\nx = " + xans + "\ny = " + yans + "\nz = " + zans + "\n\n";
					
					u3=0;
				}
				else if(u2==1){
					n6 = tvOther.getText().toString();			
					Double a = Double.parseDouble(n1);
					Double b = Double.parseDouble(n2);
					Double e = Double.parseDouble(n3);
					Double c = Double.parseDouble(n4);
					Double d = Double.parseDouble(n5);
					Double f = Double.parseDouble(n6);
					Double y = (a*f-c*e)/(a*d-c*b);
					Double x = (e-b*y)/a;				
					tvOther1.setText(n1 + "x + " + n2 + "y = " + n3 + ", " + n4 + "x + " + n5 + "y = " + n6 + "\n x = " + x + ", y = " + y);  
					tvOther.setText("");
					
					history += n1 + "x + " + n2 + "y = " + n3 + ", " + n4 + "x + " + n5 + "y = " + n6 + "\nx = " + x + "\ny = " + y + "\n\n";
					
					u2=0;
				}
				else if(Hypo==1){
					n2 = tvOther.getText().toString();
					Double result = Math.hypot(Double.parseDouble(n1), Double.parseDouble(n2));
					tvOther1.setText("Hypotenuse for a=" + n1 + ", b=" + n2 + " is =" + result.toString());
					tvOther.setText("");
					
					history += "Hypotenuse for a=" + n1 + ", b=" + n2 + " \n=" + result.toString() + "\n\n";
					
					Hypo=0;
				}
				else if(ax==1){
					n3 = tvOther.getText().toString();
					Double result = (Double.parseDouble(n3) - Double.parseDouble(n2))/Double.parseDouble(n1);
					tvOther1.setText(n1 + "x + " + n2 + " = " + n3 + "\n x=" + result.toString());
					tvOther.setText("");
					
					history += n1 + "x + " + n2 + " = " + n3 + "\nx = " + result.toString() + "\n\n";
					
					ax=0;
				}
				else if(ax2==1){
					n4 = tvOther.getText().toString();
					Double a = Double.parseDouble(n1);
					Double b = Double.parseDouble(n2);
					Double c = Double.parseDouble(n3);
					Double d = Double.parseDouble(n4);		
					Double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a *(c-d))) / 2*a;
					Double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a *(c-d))) / 2*a;
					tvOther1.setText(n1 + "x² + " + n2 + "x + " + n3 + " = " + n4 + "\n Roots = " + root1 + ", " + root2);
					tvOther.setText("");	
					
					history += n1 + "x² + " + n2 + "x + " + n3 + " = " + n4 + "\nRoots = " + root1 + ", " + root2 + "\n\n";
					
					ax2=0;
				}
				else if(per==1){
					per=0;
					n2 = tvOther.getText().toString();
					if(Integer.parseInt(n1)<Integer.parseInt(n2)){
						tvOther1.setText("Wrong Format");
						tvOther.setText("");
					}
					else{
						BigInteger no1 = new BigInteger(n1);
						Integer nminusr = Integer.parseInt(n1)-Integer.parseInt(n2);
						BigInteger no2 = new BigInteger(nminusr.toString());
						no1 = factorial(no1);
						no2 = factorial(no2);
						int scale = 2;
						BigDecimal num1 = new BigDecimal(no1);
						BigDecimal num2 = new BigDecimal(no2);
						BigDecimal res = new BigDecimal(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());
						tvOther1.setText(n1 + 'P' + n2 + "\n=" + res.toString());
						tvOther.setText("");
						
						history += n1 + 'P' + n2 + "\n=" + res.toString() + "\n\n";
					}
				}
				else if(com==1){
					com=0;
					n2 = tvOther.getText().toString();
					if(Integer.parseInt(n1)<Integer.parseInt(n2)){
						tvOther1.setText("Wrong Format");
						tvOther.setText("");
					}
					else {
						BigInteger no1 = new BigInteger(n1);
						BigInteger no3 = new BigInteger(n2);
						Integer nminusr = Integer.parseInt(n1)-Integer.parseInt(n2);
						BigInteger no2 = new BigInteger(nminusr.toString());
						no1 = factorial(no1);
						no2 = factorial(no2);
						no3 = factorial(no3);
						int scale = 2;
						BigDecimal num1 = new BigDecimal(no1);
						BigDecimal num2 = new BigDecimal(no2);
						BigDecimal num3 = new BigDecimal(no3);
						num1 = new BigDecimal(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());
						num1 = new BigDecimal(num1.divide(num3, scale, RoundingMode.HALF_UP).toString());
						tvOther1.setText(n1 + 'C' + n2 + "\n=" + num1.toString());
						tvOther.setText("");
						
						history += n1 + 'C' + n2 + "\n=" + num1.toString() + "\n\n";
					}
				}
			} catch (Exception e) {
				tvOther1.setText("Wrong Format");
				tvOther.setText("");
			}
			break;
			
		
		case R.id.bCOther:
			tvOther1.setText("");
			tvOther.setText("");
			break;
			
		//-------------------------------------------------------
		case R.id.modeB:
				Intent basic = new Intent(this,Basic.class);
				Bundle passtoBasic = new Bundle();
				passtoBasic.putString("hist", history);
				basic.putExtras(passtoBasic);
				finish();
				startActivity(basic);
			break;
		case R.id.modeA:
				Intent advanced = new Intent(this,Advanced.class);
				Bundle passtoAdv = new Bundle();
				passtoAdv.putString("hist", history);
				advanced.putExtras(passtoAdv);
				finish();
				startActivity(advanced);	
			break;
			
		case R.id.bOHistory:	
			Intent historyintent = new Intent(this, History.class);
			Bundle passtoHistory = new Bundle();
			passtoHistory.putString("hist", history);
			passtoHistory.putString("1","other");
			historyintent.putExtras(passtoHistory);
			finish();
			startActivity(historyintent);
			break;
		//-------------------------------------------------------
		}
	}
	
	
	public static BigInteger factorial(BigInteger n) {
	    BigInteger result = BigInteger.ONE;
	    while (!n.equals(BigInteger.ZERO)) {
	        result = result.multiply(n);
	        n = n.subtract(BigInteger.ONE);
	    }
	    return result;
	}
	
	private void initialise() {
		bCOther = (Button) findViewById(R.id.bCOther);
		bHypo = (Button) findViewById(R.id.bHypo);
		bRand = (Button) findViewById(R.id.bRand);
		benter = (Button) findViewById(R.id.benter);
		bnpr = (Button) findViewById(R.id.bnpr);
		bncr = (Button) findViewById(R.id.bncr);
		blog2 = (Button) findViewById(R.id.blogBase2);
		bBMI = (Button) findViewById(R.id.bBMI);
		bx1 = (Button) findViewById(R.id.bx1);
		bx2 = (Button) findViewById(R.id.bx2);
		b2u = (Button) findViewById(R.id.b2u);
		b3u = (Button) findViewById(R.id.b3u);
		basin = (Button) findViewById(R.id.basin);
		bacos = (Button) findViewById(R.id.bacos);
		batan = (Button) findViewById(R.id.batan);
		bequal = (Button) findViewById(R.id.bequal);

		tvOther = (EditText) findViewById(R.id.tvOther);
		tvOther1 = (EditText) findViewById(R.id.tvOther1);
		
		bOHistory = (Button)findViewById(R.id.bOHistory);
		
		modeB = (Button) findViewById(R.id.modeB);
		modeA = (Button) findViewById(R.id.modeA);
		modeO = (Button) findViewById(R.id.modeO);
		
		modeO.setText(Html.fromHtml("<u>Other</u>"));
	}
	
}

package com.iitg.scientificcalculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import com.iitg.scientificcalculator.*;

import android.R.bool;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.text.Html;
import android.text.InputFilter.LengthFilter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Basic extends Activity {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, bequal, bCl, bC,
			bplus, bminus, bx, bdiv, bopen, bclose;
	Button modeB, modeA, modeO;
	EditText tvBasic, tvBasic1;

	private Double mem = (double) 0;
	private String disp = "";
	private String inDigit = "";

	String history = "";
	
	int set = 0;
	
	
	public Boolean newCalculation(){
		String inf = tvBasic1.getText().toString();
		if(inf.length()>0){
			// Case '-' only in tvBasic1
			if(inf.charAt(0)=='-' && inf.length()==1)
				return false;
			
			// Case any -ve decimal number.
			if(inf.charAt(0)=='-' && inf.length()>1){
				for(int i = 1 ; i < inf.length() ; i++){
					if((inf.charAt(i)>=48 && inf.charAt(i)<=57) || inf.charAt(i)=='.'){				
					} 
					else return false;	
				}
				disp = "";
				return true;
			}
			
			// Case any +ve decimal number.
			for(int i = 0 ; i < inf.length() ; i++){
				if((inf.charAt(i)>=48 && inf.charAt(i)<=57) || inf.charAt(i)=='.'){				
				} 
				else return false;
			} 
			disp = "";
			return true;
		}
		return false;
	}
	
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
		setContentView(R.layout.activity_basic);
		initialise();

		tvBasic1.setEnabled(false);

		try {
			Bundle get = getIntent().getExtras();
			try {
				history = get.getString("hist");
				if (history.equalsIgnoreCase("null"))
					history = "";
			} catch (Exception e) {
				history = "";
			}
			try {
				tvBasic1.setText(get.getString("mod"));
				disp = "";
			} catch (Exception e) {
				// DO nothing.
			}
			try {
				mem = get.getDouble("mem");
			} catch (Exception e) {
				// Do nothing.
			}
		} catch (Exception e) {
			// tvBasic1.setText("Problem with Memory ! Restart the app !");
		}

	}

	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.b1:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "1";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b2:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "2";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b3:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "3";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b4:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "4";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b5:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "5";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b6:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "6";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b7:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "7";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b8:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "8";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b9:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "9";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.b0:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = "0";
			if(!disp.equals("0"))
				disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.bdot:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format") || newCalculation())
				tvBasic1.setText("");
			inDigit = ".";
			disp += inDigit;
			tvBasic.setText(disp);
			break;

		case R.id.bequal:
			try {
				String inf = "";
				String posf = "";
				Integer size = tvBasic1.getText().toString().length()
						+ tvBasic.getText().toString().length();
				inf = tvBasic1.getText().toString()
						+ tvBasic.getText().toString();

				// To check if open and close brackets are equal.
				int no_zero = 0;
				for(int i = 0 ; i < inf.length() ; i++) {
					if(inf.charAt(i)=='(')
						no_zero++;
					if(inf.charAt(i)==')')
						no_zero--;
				}
				if(no_zero!=0)
					tvBasic1.setText("Wrong Format");
				if(no_zero!=0)
					break;
				
				
				for (int m = 0; m < inf.length() - 1; m++) {
					if (inf.charAt(m) == '('
							&& (inf.charAt(m + 1) == '-' || inf.charAt(m + 1) == '+')) {
						int j1 = m + 2;
						while ((inf.charAt(j1) >= 48 && inf.charAt(j1) <= 57)
								|| inf.charAt(j1) == '.') {
							j1++;
						}
						String n1 = inf.substring(0, m + 1);
						String n2 = "0";
						String n3 = inf.substring(m + 1, j1);
						;
						String n4 = inf.substring(j1, inf.length());

						inf = n1 + n2 + n3 + n4;
						m = j1;
					}
				}

				if (inf.charAt(0) == '-')
					inf = "0" + inf;
				if (inf.charAt(0) == '+')
					inf = "0" + inf;
				size = inf.length();

				class dstack {
					BigDecimal[] arr = new BigDecimal[50];
					int top;

					public dstack() {
						top = -1;
					}

					void insert(BigDecimal ch) {
						arr[++top] = ch;
					}

					BigDecimal del() {
						int temp = top;
						top--;
						return arr[temp];
					}

					boolean isempty() {
						return (top == -1);
					}

					BigDecimal returntop() {
						return arr[top];
					}
				}
				;

				class stack {
					char arr[] = new char[50];
					int top;

					public stack() {
						top = -1;
					}

					void insert(char ch) {
						arr[++top] = ch;
					}

					char del() {
						int temp = top;
						top--;
						return arr[temp];
					}

					boolean isempty() {
						return (top == -1);
					}

					char returntop() {
						return arr[top];
					}
				}
				;

				// Infix to Postfix evaluation.
				stack s = new stack();
				int j = 0;
				for (int i = 0; i < size; i++) {
					if ((inf.charAt(i) >= 48 && inf.charAt(i) <= 57)|| inf.charAt(i) == '.') {
						posf += inf.charAt(i);
						if (i < size - 1) {
							if ((inf.charAt(i + 1) < 48 || inf.charAt(i + 1) > 57) && inf.charAt(i + 1) != '.') {
								posf += ' ';
							}
						} 
						else if (i == size - 1)
							posf += ' ';
					} 
					else if (inf.charAt(i) == '(') {
						s.insert(inf.charAt(i));
					} 
					else if (inf.charAt(i) == ')') {
						while (s.returntop() != '(')
							posf += s.del();
						s.del();
					} 
					else {
						if (inf.charAt(i) == '+' || inf.charAt(i) == '-') {
							while (!s.isempty() && s.returntop() != '(')
								posf += s.del();
							s.insert(inf.charAt(i));
						} 
						else if (inf.charAt(i) == 'm' && inf.charAt(i + 1) == 'o' && inf.charAt(i + 2) == 'd') {
							while (!s.isempty() && s.returntop() != '('
									&& s.returntop() != '+' && s.returntop() != '-')
								posf += s.del();
							s.insert(inf.charAt(i));
							i = i + 2;
						} 
						else if (inf.charAt(i) == 'x' || inf.charAt(i) == '/') {
							while (!s.isempty() && s.returntop() != '(' && s.returntop() != '+' && s.returntop() != '-')
								posf += s.del();
							s.insert(inf.charAt(i));
						}
						else if (inf.charAt(i) == '^') {
							while (!s.isempty() && s.returntop() != '(' && s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/')
								posf += s.del();
							s.insert(inf.charAt(i));
						} 
						else if (inf.charAt(i) == '%') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
						} 
						else if (inf.charAt(i) == '!') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
						} 
						else if (inf.charAt(i) == 's'&& inf.charAt(i + 1) == 'q'&& inf.charAt(i + 2) == 'r'&& inf.charAt(i + 3) == 't') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 3;
						} 
						else if (inf.charAt(i) == 'n'&& inf.charAt(i + 1) == 'r'&& inf.charAt(i + 2) == 'o'&& inf.charAt(i + 3) == 'o'&& inf.charAt(i + 4) == 't') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 4;
						}
						else if (inf.charAt(i) == 'c'&& inf.charAt(i + 1) == 'u'&& inf.charAt(i + 2) == 'b'&& inf.charAt(i + 3) == 'e'&& inf.charAt(i + 4) == 'r'&& inf.charAt(i + 5) == 'o'&& inf.charAt(i + 6) == 'o'&& inf.charAt(i + 7) == 't') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 7;
						} 
						else if (inf.charAt(i) == 'r'&& inf.charAt(i + 1) == 'e'&& inf.charAt(i + 2) == 'c'&& inf.charAt(i + 3) == 'i'&& inf.charAt(i + 4) == 'p'&& inf.charAt(i + 5) == 'r'&& inf.charAt(i + 6) == 'o'&& inf.charAt(i + 7) == 'c') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 4));
							i = i + 7;
						} 
						else if (inf.charAt(i) == 's'&& inf.charAt(i + 1) == 'i'&& inf.charAt(i + 2) == 'n'&& inf.charAt(i + 3) == 'h') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 3;
						} 
						else if (inf.charAt(i) == 'c'&& inf.charAt(i + 1) == 'o'&& inf.charAt(i + 2) == 's'&& inf.charAt(i + 3) == 'h') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 3;
						} 
						else if (inf.charAt(i) == 't'&& inf.charAt(i + 1) == 'a'&& inf.charAt(i + 2) == 'n'&& inf.charAt(i + 3) == 'h') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 3;
						}
						else if (inf.charAt(i) == 's'&& inf.charAt(i + 1) == 'i'&& inf.charAt(i + 2) == 'n') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
							i = i + 2;
						} 
						else if (inf.charAt(i) == 'c'&& inf.charAt(i + 1) == 'o'&& inf.charAt(i + 2) == 's') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
							i = i + 2;
						} 
						else if (inf.charAt(i) == 't'&& inf.charAt(i + 1) == 'a'&& inf.charAt(i + 2) == 'n') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
							i = i + 2;
						} 
						else if (inf.charAt(i) == 'l'&& inf.charAt(i + 1) == 'o'&& inf.charAt(i + 2) == 'g') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
							i = i + 2;
						} 
						else if (inf.charAt(i) == 'l'&& inf.charAt(i + 1) == 'n') {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i + 1));
							i = i + 1;
						}
						else {
							while (!s.isempty() && s.returntop() != '('&& s.returntop() != '+'&& s.returntop() != '-'&& s.returntop() != 'x'&& s.returntop() != '/'&& s.returntop() != '^')
								posf += s.del();
							s.insert(inf.charAt(i));
						}
					}
				}
				while (!s.isempty())
					posf += s.del();

				// Un-comment the next line to see the postfix expression in history.
				//history += posf + "\n";
				
				// Getting answer from the postfix.
				size = posf.length();
				dstack s1 = new dstack();
				BigDecimal x1, x2, ch;
				int j1;
				for (int i = 0; i < size; i++) {
					if (posf.charAt(i) == ' ') {
						continue;
					} 
					else if ((posf.charAt(i) >= 48 && posf.charAt(i) <= 57)|| posf.charAt(i) == '.') {
						j1 = i;
						while (posf.charAt(j1) != ' ') {
							j1++;
						}
						String no = posf.substring(i, j1);
						ch = new BigDecimal(no);
						i = j1 - 1;
						s1.insert(ch);
					} 
					else {
						if (posf.charAt(i) == '+') {
							x1 = s1.del();
							x2 = s1.del();
							ch = x2.add(x1);
							s1.insert(ch);
						} 
						else if (posf.charAt(i) == '-') {
							x1 = s1.del();
							x2 = s1.del();
							ch = x2.subtract(x1);
							s1.insert(ch);
						}
						else if (posf.charAt(i) == 'x') {
							x1 = s1.del();
							x2 = s1.del();
							ch = x2.multiply(x1);
							s1.insert(ch);
						}
						else if (posf.charAt(i) == '/') {
								x1 = s1.del();
								x2 = s1.del();
								ch = x2.divide(x1, 20, RoundingMode.DOWN);
							s1.insert(ch);
						} 
						else if (posf.charAt(i) == '^') {
							x1 = s1.del();
							x2 = s1.del();
							Double p = x1.doubleValue();
							Double q = x2.doubleValue();
							Double r = Math.pow(q, p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For sqrt
						else if (posf.charAt(i) == 'q') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.pow(p, 0.5);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For sin
						else if (posf.charAt(i) == 's') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.sin(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For cos
						else if (posf.charAt(i) == 'c') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.cos(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For tan
						else if (posf.charAt(i) == 't') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.tan(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For sinh
						else if (posf.charAt(i) == 'i') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.sinh(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// Fro cosh
						else if (posf.charAt(i) == 'o') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.cosh(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For tanh
						else if (posf.charAt(i) == 'a') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.tanh(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For log
						else if (posf.charAt(i) == 'l') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.log10(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For ln
						else if (posf.charAt(i) == 'n') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.log(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For cuberoot
						else if (posf.charAt(i) == 'u') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = Math.cbrt(p);
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For nroot
						else if (posf.charAt(i) == 'r') {
							x1 = s1.del();
							x2 = s1.del();
							int scale = 20;
							BigDecimal num3 = new BigDecimal("1");
							x1 = new BigDecimal(num3.divide(x1, scale, RoundingMode.DOWN).toString());
							String inStr = x1.toString();
							Double result = Math.pow(
									Double.parseDouble(x2.toString()),
									Double.parseDouble(inStr));
							ch = new BigDecimal(result.toString());
							s1.insert(ch);
						} 
						// For factorial
						else if (posf.charAt(i) == '!') {
							int ctr = 1;
							int t = 1;
							String z = s1.del().toString();
							t = z.length();
							for (j = 0; j < z.length(); j++) {
								if (z.charAt(j) == '.') {
									t = j;
									for (int k = j + 1; k < z.length(); k++) {
										if (z.charAt(k) == '0')
											ctr = ctr;
										else
											ctr--;
									}
								}
							}
							if (ctr == 1) {
								String y = "";
								if (t == 0)
									y += "0";
								else
									y += z.substring(0, t);
								BigInteger no = new BigInteger(y);
								no = factorial(no);
								s1.insert(new BigDecimal(no.toString()));
							}
						}
						// For reciprocal
						else if (posf.charAt(i) == 'p') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = 1 / p;
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For mod
						else if (posf.charAt(i) == 'm') {
							x1 = s1.del();
							x2 = s1.del();
							Double p = x1.doubleValue();
							Double q = x2.doubleValue();
							Double r = q % p;
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
						// For %
						else if (posf.charAt(i) == '%') {
							x1 = s1.del();
							Double p = x1.doubleValue();
							Double r = p / 100;
							String k = r.toString();
							ch = new BigDecimal(k);
							s1.insert(ch);
						}
					}
				}

				x1 = s1.del();
				if (s1.isempty()) {
					String res = x1.toString();
					
					// For approximation of answer.
					BigDecimal r = new BigDecimal(res);
					BigDecimal one = new BigDecimal("1");
					r = r.divide(one, 6, RoundingMode.UP);
					res = r.toString();
							
					int dot=0, nine=0, zero=0;
					for(int i=0;i<res.length();i++){
						if(res.charAt(i)=='.'){
							dot = i;
							for(int k=i+1;k<res.length();k++){
								if(res.charAt(k)=='9')
									nine++;
								else if(res.charAt(k)=='0')
									zero++;
								else break;
							}
						} 
					}					
					if(nine>=5 && dot>=1){
						res = res.substring(0, dot);
						Double x = Double.parseDouble(res) + 1;
						res = x.toString();
					}
					else if(zero>=5 && dot>=1){
						res = res.substring(0, dot+2);
						if(res.equals("-0.0")){
							res = "0.0";
						}
					}
					
					history += tvBasic1.getText().toString() + tvBasic.getText().toString() + "\n=" + res.toString() + "\n\n";
					tvBasic1.setText(res);
					tvBasic.setText("");
				} else {
					tvBasic1.setText("Wrong Format");
				}
			} catch (Exception e) {
				tvBasic1.setText("Wrong Format");
				tvBasic.setText("");
				disp = "";
			}
			break;

		case R.id.bCl:
			try {
				String x = tvBasic.getText().toString().substring(0, tvBasic.getText().toString().length() - 1);
				tvBasic.setText(x);
				disp = x;
			} catch (Exception e) {
				if (tvBasic1.getText().toString().length() >= 1) {
					String y = tvBasic1.getText().toString().substring(0,tvBasic1.getText().toString().length() - 1);
					tvBasic1.setText(y);
					disp = "";
				} else {
					tvBasic1.setText("");
					tvBasic.setText("");
				}
			}
			break;

		case R.id.bC:
				disp = "";
				tvBasic1.setText("");
				tvBasic.setText("");
			break;

		case R.id.bplus:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format"))
				tvBasic1.setText("");
			inDigit = "+";
			disp = tvBasic1.getText().toString() + tvBasic.getText().toString() + inDigit;
			tvBasic1.setText(disp);
			tvBasic.setText("");
			disp = "";
			tvBasic.setTextSize(35);
			break;

		case R.id.bminus:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format"))
				tvBasic1.setText("");
			inDigit = "-";
			disp = tvBasic1.getText().toString() + tvBasic.getText().toString() + inDigit;
			tvBasic1.setText(disp);
			tvBasic.setText("");
			disp = "";
			tvBasic.setTextSize(35);
			break;

		case R.id.bx:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format"))
				tvBasic1.setText("");
			inDigit = "x";
			disp = tvBasic1.getText().toString() + tvBasic.getText().toString() + inDigit;
			tvBasic1.setText(disp);
			tvBasic.setText("");
			disp = "";
			tvBasic.setTextSize(35);
			break;

		case R.id.bdiv:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format"))
				tvBasic1.setText("");
			inDigit = "/";
			disp = tvBasic1.getText().toString() + tvBasic.getText().toString() + inDigit;
			tvBasic1.setText(disp);
			tvBasic.setText("");
			disp = "";
			tvBasic.setTextSize(35);
			break;

		case R.id.bopen:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format"))
				tvBasic1.setText("");
			inDigit = "(";
			disp = tvBasic1.getText().toString() + tvBasic.getText().toString() + inDigit;
			tvBasic1.setText(disp);
			tvBasic.setText("");
			disp = "";
			tvBasic.setTextSize(35);
			break;

		case R.id.bclose:
			if(tvBasic1.getText().toString().equalsIgnoreCase("wrong format"))
				tvBasic1.setText("");
			inDigit = ")";
			disp = tvBasic1.getText().toString() + tvBasic.getText().toString() + inDigit;
			tvBasic1.setText(disp);
			tvBasic.setText("");
			disp = "";
			tvBasic.setTextSize(35);
			break;
			
		// Mode changing.	
		//========================================================	
		case R.id.modeA:
			// Switching to the advanced mode.
			String in = "";
			in = tvBasic1.getText().toString() + tvBasic.getText().toString();
			Intent adv = new Intent(this, Advanced.class);
			Bundle passtoAdv = new Bundle();
			passtoAdv.putString("infix", in);
			passtoAdv.putDouble("mem", mem);
			passtoAdv.putString("hist", history);
			adv.putExtras(passtoAdv);
			finish();
			startActivity(adv);
			break;

		case R.id.modeO:
			// Switching to the other mode.
			Intent other = new Intent(this, Other.class);
			Bundle passtoOther = new Bundle();
			passtoOther.putString("hist", history);
			other.putExtras(passtoOther);
			finish();
			startActivity(other);
			break;
			
		case R.id.bHistory:
			// Showing the history.
			Intent historyintent = new Intent(this, History.class);
			Bundle passtoHistory = new Bundle();
			passtoHistory.putString("hist", history);
			passtoHistory.putString("1", "basic");
			historyintent.putExtras(passtoHistory);
			finish();
			startActivity(historyintent);
			break;
		//========================================================
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

	public void initialise() {
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		b0 = (Button) findViewById(R.id.b0);
		bdot = (Button) findViewById(R.id.bdot);
		bequal = (Button) findViewById(R.id.bequal);
		bCl = (Button) findViewById(R.id.bCl);
		bC = (Button) findViewById(R.id.bC);
		bplus = (Button) findViewById(R.id.bplus);
		bminus = (Button) findViewById(R.id.bminus);
		bx = (Button) findViewById(R.id.bx);
		bdiv = (Button) findViewById(R.id.bdiv);
		bopen = (Button) findViewById(R.id.bopen);
		bclose = (Button) findViewById(R.id.bclose);
		
		modeB = (Button) findViewById(R.id.modeB);
		modeA = (Button) findViewById(R.id.modeA);
		modeO = (Button) findViewById(R.id.modeO);
		
		modeB.setText(Html.fromHtml("<u>Basic</u>"));

		tvBasic = (EditText) findViewById(R.id.tvBasic);
		tvBasic1 = (EditText) findViewById(R.id.tvBasic1);
	}
}

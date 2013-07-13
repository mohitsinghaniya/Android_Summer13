package com.iitg.unitconverter;

import com.iitg.unitconverter.*;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Converter extends Activity{	
	
	String[] type = new String[] {"Length", "Mass", "Power", "Pressure", "Temperature", "Time", "Velocity", "Volume","Area","Fuel Conversion","Digital Storage","Number System","Angle"};
	String[] length = new String[] {"Centimetres","Metres","Kilometres","Inches","Feet","Yards","Miles","Nautical Miles"};
	String[] mass = new String[] {"Milligram","Grammes","Kilogrammes","Metric tons","Ounces","Pounds","Stones"};
	String[] power = new String[] {"Watts","Kilowatts","Horsepower"};
	String[] pressure = new String[] {"Atmospheres","Bars","Pascals","mm Hg"};
	String[] temp = new String[] {"Celsius","Fahrenheit","Kelvin"};
	String[] time = new String[] {"Seconds","Minutes","Hours","Days","Weeks"};
	String[] velocity = new String[] {"Kilometres/hour","Metres/sec","Miles/hour","Feet/sec","Knots"};
	String[] volume = new String[] {"Millilitres","Litres","Cubic mm","Cubic cm","Cubic metres","Cubic inches","Cubic feet","Gallons(US)","Gallons(UK)","Pint(US)","Pint(UK)","Barrels"};
	String[] area = new String[] {"Square metre","Square km","Square inch","Square foot","Square yard","Square mile","Hectare","Acre"};
	String[] fuelcon = new String[] {"MPG(US)","MPG(UK)","Km/liter","Liter/100km"};
	String[] digital = new String[] {"Bit","Byte","Kilobit","Kilobyte","Megabit","Megabyte","Gigabit","Gigabyte","Terabit","Terabyte","Petabit","Petabyte"};
	String [] NumberSystem = new String[] {"Decimal","Binary","Octal","Hexadecimal"};
	String [] Angle = new String[] {"Degree","Radian"};
	
	int ilength=0, imass=0, ipower=0, ipressure=0, itemp=0, itime=0, ivelocity=0, ivolume=0, iarea=0, idigital=0, ifuelcon=0, inumber=0, iangle=0 ;
	
	TextView disp;
	EditText amount;
	Button bconvert;
	Spinner typeSpinner, fromSpinner, toSpinner;
	
	String from="", to="", input="";
	
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
			Intent i = new Intent("com.iitg.unitconverter.ABOUT");
			startActivity(i);
			break;
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_converter);
		initialise();
        
        typeSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
	        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {               
	        	try{
	        		set(position);
	        	} catch (Exception e) {
	        		disp.setText("Please re-start the App !");
				}
	        }
	        public void onNothingSelected(AdapterView<?> parent) {
        }});

        fromSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
	        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {   
	        	try{
		        	if(ilength==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = length[position];
		        	}
		        	else if(imass==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = mass[position];
		        	}
		        	else if(ipower==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = power[position];
		        	}
		        	else if(ipressure==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = pressure[position];
		        	}
		        	else if(itemp==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = temp[position];
		        	}
		        	else if(itime==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = time[position];
		        	}
		        	else if(ivelocity==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = velocity[position];
		        	}
		        	else if(ivolume==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = volume[position];
		        	}
		         	else if(iarea==1){
		         		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = area[position];
		        	}
		        	else if(ifuelcon==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = fuelcon[position];
		        	}
		        	else if(idigital==1){
		        		amount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
		        		from = digital[position];
		        	}
		        	else if(inumber==1){
		        		from = NumberSystem[position];
		        		if(from.equals("Hexadecimal"))
		        			amount.setInputType(InputType.TYPE_CLASS_TEXT);
		        		else amount.setInputType(InputType.TYPE_CLASS_NUMBER);
		        	}
		        	else if(iangle==1){
		        		from = Angle[position];
		        	}
	        	} catch (Exception e) {
	        		disp.setText("Select a from Item !");
				}
	        }
	        public void onNothingSelected(AdapterView<?> parent) {
        }});
        
        toSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
	        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {  
	        	try{
		        	if(ilength==1){
		        		to = length[position];
		        	}
		        	else if(imass==1){
		        		to = mass[position];
		        	}
		        	else if(ipower==1){
		        		to = power[position];
		        	}
		        	else if(ipressure==1){
		        		to = pressure[position];
		        	}
		        	else if(itemp==1){
		        		to = temp[position];
		        	}
		        	else if(itime==1){
		        		to = time[position];
		        	}
		        	else if(ivelocity==1){
		        		to = velocity[position];
		        	}
		        	else if(ivolume==1){
		        		to = volume[position];
		        	}
		        	else if(iarea==1){
		        		to = area[position];
		        	}
		        	else if(ifuelcon==1){
		        		to = fuelcon[position];
		        	}
		        	else if(idigital==1){
		        		to = digital[position];
		        	}
		        	else if(inumber==1){
		        		to = NumberSystem[position];
		        	}
		        	else if(iangle==1){
		        		to = Angle[position];
		        	}
	        	} catch (Exception e) {
	        		disp.setText("Select a to Item !");
				}
	        }
	        public void onNothingSelected(AdapterView<?> parent) {
        }});
        
        bconvert.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ilength==1){
						Double r = lengthfns();
						disp.setText(r.toString());
					}
					else if(imass==1){
						Double r = massfns();
						disp.setText(r.toString());
					}
					else if(ipower==1){
						Double r = powerfns();
						disp.setText(r.toString());
					}
					else if(ipressure==1){
						Double r = pressurefns();
						disp.setText(r.toString());
					}
					else if(itemp==1){
						Double r = tempfns();
						disp.setText(r.toString());
					}
					else if(itime==1){
						Double r = timefns();
						disp.setText(r.toString());
					}
					else if(ivelocity==1){
						Double r = velocityfns();
						disp.setText(r.toString());
					}
					else if(ivolume==1){
						Double r = volumefns();
						disp.setText(r.toString());
					}
					else if(iarea==1){
						Double r = areafns();
						disp.setText(r.toString());
					}
					else if(ifuelcon==1){
						Double r = fuelfns();
						disp.setText(r.toString());
					}
					else if(idigital==1){
						Double r = digitalfns();
						disp.setText(r.toString());
					}
					else if(inumber==1){
						String r = numberfns();
						disp.setText(r);
					}
					else if(iangle==1){
						Double r = anglefns();
						disp.setText(r.toString());
					}
					
				} catch (Exception e) {
					disp.setText("Enter the amount !");
				}
			}
		});
	}
	
	public String numberfns(){
		try{
			input = amount.getText().toString();
			String res="";
			//------------------------------------------------------------
				if(from.equals("Decimal") && to.equals("Decimal"))
					return input;
				if(from.equals("Decimal") && to.equals("Binary")){
					res = Integer.toBinaryString(Integer.parseInt(input));
					return res; 
				}
				if(from.equals("Decimal") && to.equals("Octal")){
					res = Integer.toOctalString(Integer.parseInt(input));
					return res;  
				}
				if(from.equals("Decimal") && to.equals("Hexadecimal")){
					res = Integer.toHexString(Integer.parseInt(input));
					return res;  
				}
			//------------------------------------------------------------
				if(from.equals("Binary") && to.equals("Decimal")){
					Integer i = Integer.parseInt(input, 2);
					return (i.toString());
				}
				if(from.equals("Binary") && to.equals("Binary")){
					return input;
				}
				if(from.equals("Binary") && to.equals("Octal")){
					res = Integer.toOctalString(Integer.parseInt(input, 2));
					return res;
				}
				if(from.equals("Binary") && to.equals("Hexadecimal")){
					res = Integer.toHexString(Integer.parseInt(input, 2));
					return res;
				}
			//------------------------------------------------------------
				if(from.equals("Octal") && to.equals("Decimal")){
					Integer i = Integer.parseInt(input, 8);
					return (i.toString());
				}
				if(from.equals("Octal") && to.equals("Binary")){
					res = Integer.toBinaryString(Integer.parseInt(input, 8));
					return res;  
				}
				if(from.equals("Octal") && to.equals("Octal")){
					return input; 
				}
				if(from.equals("Octal") && to.equals("Hexadecimal")){
					res = Integer.toHexString(Integer.parseInt(input, 8));
					return res; 
				}
			//------------------------------------------------------------
				if(from.equals("Hexadecimal") && to.equals("Decimal")){
					Integer i = Integer.parseInt(input, 16);
					return (i.toString());
				}
				if(from.equals("Hexadecimal") && to.equals("Binary")){
					res = Integer.toBinaryString(Integer.parseInt(input, 16));
					return res;  
				}
				if(from.equals("Hexadecimal") && to.equals("Octal")){
					res = Integer.toOctalString(Integer.parseInt(input, 16));
					return res; 
				}
				if(from.equals("Hexadecimal") && to.equals("Hexadecimal")){
					return input;
				}
			//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return "Number not defined for the number system !";			
	}
	
	public double anglefns(){
		try{
			input = amount.getText().toString();
			Double no = Double.parseDouble(input);
			//------------------------------------------------------------
				if(from.equals("Degree") && to.equals("Degree"))
					return no;
				if(from.equals("Degree") && to.equals("Radian"))
					return Math.toRadians(no);
			//------------------------------------------------------------
				if(from.equals("Radian") && to.equals("Degree"))
					return Math.toDegrees(no);
				if(from.equals("Radian") && to.equals("Radian"))
					return no;
			//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double digitalfns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Bit") && to.equals("Bit"))
				return no;
			if(from.equals("Bit") && to.equals("Byte"))
				return no*0.125;
			if(from.equals("Bit") && to.equals("Kilobit"))
				return no/1024;
			if(from.equals("Bit") && to.equals("Kilobyte"))
				return no/(1024*8);
			if(from.equals("Bit") && to.equals("Megabit"))
				return no/(1024*1024);
			if(from.equals("Bit") && to.equals("Megabyte"))
				return no/(1024*1024*8);
			if(from.equals("Bit") && to.equals("Gigabit"))
				return no/(1024*1024*1024);
			if(from.equals("Bit") && to.equals("Gigabyte"))
				return no/(1024*1024*1024*8);
			if(from.equals("Bit") && to.equals("Terabit"))
				return no/(1024*1024*1024*1024);
			if(from.equals("Bit") && to.equals("Terabyte"))
				return no/(1024*1024*1024*1024*8);
			if(from.equals("Bit") && to.equals("Petabit"))
				return no/(1024*1024*1024*1024*1024);
			if(from.equals("Bit") && to.equals("Petabyte"))
				return no/(1024*1024*1024*1024*1024*8);
		//------------------------------------------------------------
			if(from.equals("Byte") && to.equals("Bit"))
				return no*8;
			if(from.equals("Byte") && to.equals("Byte"))
				return no;
			if(from.equals("Byte") && to.equals("Kilobit"))
				return no*8/1024;
			if(from.equals("Byte") && to.equals("Kilobyte"))
				return no/1024;
			if(from.equals("Byte") && to.equals("Megabit"))
				return no*8/(1024*1024);
			if(from.equals("Byte") && to.equals("Megabyte"))
				return no/(1024*1024);
			if(from.equals("Byte") && to.equals("Gigabit"))
				return no*8/(1024*1024*1024);
			if(from.equals("Byte") && to.equals("Gigabyte"))
				return no/(1024*1024*1024);
			if(from.equals("Byte") && to.equals("Terabit"))
				return no*8/(1024*1024*1024*1024);
			if(from.equals("Byte") && to.equals("Terabyte"))
				return no/(1024*1024*1024*1024);
			if(from.equals("Byte") && to.equals("Petabit"))
				return no*8/(1024*1024*1024*1024*1024);
			if(from.equals("Byte") && to.equals("Petabyte"))
				return no/(1024*1024*1024*1024*1024);
		//------------------------------------------------------------
			if(from.equals("Kilobit") && to.equals("Bit"))
				return no*1024;
			if(from.equals("Kilobit") && to.equals("Byte"))
				return no*128;
			if(from.equals("Kilobit") && to.equals("Kilobit"))
				return no;
			if(from.equals("Kilobit") && to.equals("Kilobyte"))
				return no/8;
			if(from.equals("Kilobit") && to.equals("Megabit"))
				return no/1024;
			if(from.equals("Kilobit") && to.equals("Megabyte"))
				return no/(1024*8);
			if(from.equals("Kilobit") && to.equals("Gigabit"))
				return no/(1024*1024);
			if(from.equals("Kilobit") && to.equals("Gigabyte"))
				return no/(1024*1024*8);
			if(from.equals("Kilobit") && to.equals("Terabit"))
				return no/(1024*1024*1024);
			if(from.equals("Kilobit") && to.equals("Terabyte"))
				return no/(1024*1024*1024*8);
			if(from.equals("Kilobit") && to.equals("Petabit"))
				return no/(1024*1024*1024*1024);
			if(from.equals("Kilobit") && to.equals("Petabyte"))
				return no/(1024*1024*1024*1024*8);
		//------------------------------------------------------------
			if(from.equals("Kilobyte") && to.equals("Bit"))
				return no*8192;
			if(from.equals("Kilobyte") && to.equals("Byte"))
				return no*1024;
			if(from.equals("Kilobyte") && to.equals("Kilobit"))
				return no*8;
			if(from.equals("Kilobyte") && to.equals("Kilobyte"))
				return no;
			if(from.equals("Kilobyte") && to.equals("Megabit"))
				return no*8/1024;
			if(from.equals("Kilobyte") && to.equals("Megabyte"))
				return no/1024;
			if(from.equals("Kilobyte") && to.equals("Gigabit"))
				return no*8/(1024*1024);
			if(from.equals("Kilobyte") && to.equals("Gigabyte"))
				return no/(1024*1024);
			if(from.equals("Kilobyte") && to.equals("Terabit"))
				return no*8/(1024*1024*1024);
			if(from.equals("Kilobyte") && to.equals("Terabyte"))
				return no/(1024*1024*1024);
			if(from.equals("Kilobyte") && to.equals("Petabit"))
				return no*8/(1024*1024*1024*1024);
			if(from.equals("Kilobyte") && to.equals("Petabyte"))
					return no/(1024*1024*1024*1024);
		//------------------------------------------------------------
			if(from.equals("Megabit") && to.equals("Bit"))
				return no*1024*1024;
			if(from.equals("Megabit") && to.equals("Byte"))
				return no*1024*1024/8;
			if(from.equals("Megabit") && to.equals("Kilobit"))
				return no*1024;
			if(from.equals("Megabit") && to.equals("Kilobyte"))
				return no*1024/8;
			if(from.equals("Megabit") && to.equals("Megabit"))
				return no;
			if(from.equals("Megabit") && to.equals("Megabyte"))
				return no/8;
			if(from.equals("Megabit") && to.equals("Gigabit"))
				return no/1024;
			if(from.equals("Megabit") && to.equals("Gigabyte"))
				return no/(1024*8);
			if(from.equals("Megabit") && to.equals("Terabit"))
				return no/(1024*1024);
			if(from.equals("Megabit") && to.equals("Terabyte"))
				return no/(1024*1024*8);
			if(from.equals("Megabit") && to.equals("Petabit"))
				return no/(1024*1024*1024);
			if(from.equals("Megabit") && to.equals("Petabyte"))
				return no/(1024*1024*1024*8);
		//------------------------------------------------------------
			if(from.equals("Megabyte") && to.equals("Bit"))
				return no*1024*1024*8;
			if(from.equals("Megabyte") && to.equals("Byte"))
				return no*1024*1024;
			if(from.equals("Megabyte") && to.equals("Kilobit"))
				return no*1024*8;
			if(from.equals("Megabyte") && to.equals("Kilobyte"))
				return no*1024;
			if(from.equals("Megabyte") && to.equals("Megabit"))
				return no*8;
			if(from.equals("Megabyte") && to.equals("Megabyte"))
				return no;
			if(from.equals("Megabyte") && to.equals("Gigabit"))
				return no*8/1024;
			if(from.equals("Megabyte") && to.equals("Gigabyte"))
				return no/1024;
			if(from.equals("Megabyte") && to.equals("Terabit"))
				return no*8/(1024*1024);
			if(from.equals("Megabyte") && to.equals("Terabyte"))
				return no/(1024*1024);
			if(from.equals("Megabyte") && to.equals("Petabit"))
				return no*8/(1024*1024*1024);
			if(from.equals("Megabyte") && to.equals("Petabyte"))
				return no/(1024*1024*1024);
		//------------------------------------------------------------
			if(from.equals("Gigabit") && to.equals("Bit"))
				return no*1024*1024*1024;
			if(from.equals("Gigabit") && to.equals("Byte"))
				return no*1024*1024*1024/8;
			if(from.equals("Gigabit") && to.equals("Kilobit"))
				return no*1024*1024;
			if(from.equals("Gigabit") && to.equals("Kilobyte"))
				return no*1024*1024/8;
			if(from.equals("Gigabit") && to.equals("Megabit"))
				return no*1024;
			if(from.equals("Gigabit") && to.equals("Megabyte"))
				return no*1024/8;
			if(from.equals("Gigabit") && to.equals("Gigabit"))
				return no;
			if(from.equals("Gigabit") && to.equals("Gigabyte"))
				return no/8;
			if(from.equals("Gigabit") && to.equals("Terabit"))
				return no/1024;
			if(from.equals("Gigabit") && to.equals("Terabyte"))
				return no/(1024*8);
			if(from.equals("Gigabit") && to.equals("Petabit"))
				return no/(1024*1024);
			if(from.equals("Gigabit") && to.equals("Petabyte"))
				return no/(1024*1024*8);
		//------------------------------------------------------------
			if(from.equals("Gigabyte") && to.equals("Bit"))
				return no*1024*1024*1024*8;
			if(from.equals("Gigabyte") && to.equals("Byte"))
				return no*1024*1024*1024;
			if(from.equals("Gigabyte") && to.equals("Kilobit"))
				return no*1024*1024*8;
			if(from.equals("Gigabyte") && to.equals("Kilobyte"))
				return no*1024*1024;
			if(from.equals("Gigabyte") && to.equals("Megabit"))
				return no*1024*8;
			if(from.equals("Gigabyte") && to.equals("Megabyte"))
				return no*1024;
			if(from.equals("Gigabyte") && to.equals("Gigabit"))
				return no*8;
			if(from.equals("Gigabyte") && to.equals("Gigabyte"))
				return no;
			if(from.equals("Gigabyte") && to.equals("Terabit"))
				return no*8/1024;
			if(from.equals("Gigabyte") && to.equals("Terabyte"))
				return no/1024;
			if(from.equals("Gigabyte") && to.equals("Petabit"))
				return no*8/(1024*1024);
			if(from.equals("Gigabyte") && to.equals("Petabyte"))
				return no/(1024*1024);
		//------------------------------------------------------------
			if(from.equals("Terabit") && to.equals("Bit"))
				return no*1024*1024*1024*1024;
			if(from.equals("Terabit") && to.equals("Byte"))
				return no*1024*1024*1024*1024/8;
			if(from.equals("Terabit") && to.equals("Kilobit"))
				return no*1024*1024*1024;
			if(from.equals("Terabit") && to.equals("Kilobyte"))
				return no*1024*1024*1024/8;
			if(from.equals("Terabit") && to.equals("Megabit"))
				return no*1024*1024;
			if(from.equals("Terabit") && to.equals("Megabyte"))
				return no*1024*1024/8;
			if(from.equals("Terabit") && to.equals("Gigabit"))
				return no*1024;
			if(from.equals("Terabit") && to.equals("Gigabyte"))
				return no*1024/8;
			if(from.equals("Terabit") && to.equals("Terabit"))
				return no;
			if(from.equals("Terabit") && to.equals("Terabyte"))
				return no/8;
			if(from.equals("Terabit") && to.equals("Petabit"))
				return no/1024;
			if(from.equals("Terabit") && to.equals("Petabyte"))
				return no/(1024*8);
		//------------------------------------------------------------
			if(from.equals("Terabyte") && to.equals("Bit"))
				return no*1024*1024*1024*1024*8;
			if(from.equals("Terabyte") && to.equals("Byte"))
				return no*1024*1024*1024*1024;
			if(from.equals("Terabyte") && to.equals("Kilobit"))
				return no*1024*1024*1024*8;
			if(from.equals("Terabyte") && to.equals("Kilobyte"))
				return no*1024*1024*1024;
			if(from.equals("Terabyte") && to.equals("Megabit"))
				return no*1024*1024*8;
			if(from.equals("Terabyte") && to.equals("Megabyte"))
				return no*1024*1024;
			if(from.equals("Terabyte") && to.equals("Gigabit"))
				return no*1024*8;
			if(from.equals("Terabyte") && to.equals("Gigabyte"))
				return no*1024;
			if(from.equals("Terabyte") && to.equals("Terabit"))
				return no*8;
			if(from.equals("Terabyte") && to.equals("Terabyte"))
				return no;
			if(from.equals("Terabyte") && to.equals("Petabit"))
				return no*8/1024;
			if(from.equals("Terabyte") && to.equals("Petabyte"))
				return no/1024;
		//------------------------------------------------------------
			if(from.equals("Petabit") && to.equals("Bit"))
				return no*1024*1024*1024*1024*1024;
			if(from.equals("Petabit") && to.equals("Byte"))
				return no*1024*1024*1024*1024*1024/8;
			if(from.equals("Petabit") && to.equals("Kilobit"))
				return no*1024*1024*1024*1024;
			if(from.equals("Petabit") && to.equals("Kilobyte"))
				return no*1024*1024*1024*1024/8;
			if(from.equals("Petabit") && to.equals("Megabit"))
				return no*1024*1024*1024;
			if(from.equals("Petabit") && to.equals("Megabyte"))
				return no*1024*1024*1024/8;
			if(from.equals("Petabit") && to.equals("Gigabit"))
				return no*1024*1024;
			if(from.equals("Petabit") && to.equals("Gigabyte"))
				return no*1024*1024/8;
			if(from.equals("Petabit") && to.equals("Terabit"))
				return no*1024;
			if(from.equals("Petabit") && to.equals("Terabyte"))
				return no*1024/8;
			if(from.equals("Petabit") && to.equals("Petabit"))
				return no;
			if(from.equals("Petabit") && to.equals("Petabyte"))
				return no/8;
		//------------------------------------------------------------
			if(from.equals("Petabyte") && to.equals("Bit"))
				return no*1024*1024*1024*1024*1024*8;
			if(from.equals("Petabyte") && to.equals("Byte"))
				return no*1024*1024*1024*1024*1024;
			if(from.equals("Petabyte") && to.equals("Kilobit"))
				return no*1024*1024*1024*1024*8;
			if(from.equals("Petabyte") && to.equals("Kilobyte"))
				return no*1024*1024*1024*1024;
			if(from.equals("Petabyte") && to.equals("Megabit"))
				return no*1024*1024*1024*8;
			if(from.equals("Petabyte") && to.equals("Megabyte"))
				return no*1024*1024*1024;
			if(from.equals("Petabyte") && to.equals("Gigabit"))
				return no*1024*1024*8;
			if(from.equals("Petabyte") && to.equals("Gigabyte"))
				return no*1024*1024;
			if(from.equals("Petabyte") && to.equals("Terabit"))
				return no*1024*8;
			if(from.equals("Petabyte") && to.equals("Terabyte"))
				return no*1024;
			if(from.equals("Petabyte") && to.equals("Petabit"))
				return no*8;
			if(from.equals("Petabyte") && to.equals("Petabyte"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double fuelfns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("MPG(US)") && to.equals("MPG(US)"))
				return no;
			if(from.equals("MPG(US)") && to.equals("MPG(UK)"))
				return no*1.20095;
			if(from.equals("MPG(US)") && to.equals("Km/liter"))
				return no*0.425144;
			if(from.equals("MPG(US)") && to.equals("Liter/100km"))
				return no*235.215;
		//------------------------------------------------------------
			if(from.equals("MPG(UK)") && to.equals("MPG(US)"))
				return no*0.832674;
			if(from.equals("MPG(UK)") && to.equals("MPG(UK)"))
				return no;
			if(from.equals("MPG(UK)") && to.equals("Km/liter"))
				return no*0.354006;
			if(from.equals("MPG(UK)") && to.equals("Liter/100km"))
				return no*282.481;
		//------------------------------------------------------------
			if(from.equals("Km/liter") && to.equals("MPG(US)"))
				return no*2.35215;
			if(from.equals("Km/liter") && to.equals("MPG(UK)"))
				return no*2.82481;
			if(from.equals("Km/liter") && to.equals("Km/liter"))
				return no;
			if(from.equals("Km/liter") && to.equals("Liter/100km"))
				return no*100;
		//------------------------------------------------------------
			if(from.equals("Liter/100km") && to.equals("MPG(US)"))
				return no*235.215;
			if(from.equals("Liter/100km") && to.equals("MPG(UK)"))
				return no*282.481;
			if(from.equals("Liter/100km") && to.equals("Km/liter"))
				return no*100;
			if(from.equals("Liter/100km") && to.equals("Liter/100km"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double areafns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Square metre") && to.equals("Square metre"))
				return no;
			if(from.equals("Square metre") && to.equals("Square km"))
				return no/1000000;
			if(from.equals("Square metre") && to.equals("Square inch"))
				return no*1550;
			if(from.equals("Square metre") && to.equals("Square foot"))
				return no*10.7639104167097;
			if(from.equals("Square metre") && to.equals("Square yard"))
				return no*1.19599004630108;
			if(from.equals("Square metre") && to.equals("Square mile"))
				return no*0.000386102158542445/1000;
			if(from.equals("Square metre") && to.equals("Hectare"))
				return no/10000;
			if(from.equals("Square metre") && to.equals("Acre"))
				return no*0.000247105;
		//------------------------------------------------------------
			if(from.equals("Square km") && to.equals("Square metre"))
				return no*1000*1000;
			if(from.equals("Square km") && to.equals("Square km"))
				return no;
			if(from.equals("Square km") && to.equals("Square inch"))
				return no*1.5500031*1000*1000*1000;
			if(from.equals("Square km") && to.equals("Square foot"))
				return no*1.076391042*10000*1000;
			if(from.equals("Square km") && to.equals("Square yard"))
				return no*1.195990046301*1000*1000;
			if(from.equals("Square km") && to.equals("Square mile"))
				return no*0.386102159;
			if(from.equals("Square km") && to.equals("Hectare"))
				return no*100;
			if(from.equals("Square km") && to.equals("Acre"))
				return no*247.105;
		//------------------------------------------------------------
			if(from.equals("Square inch") && to.equals("Square metre"))
				return no*0.00064516;
			if(from.equals("Square inch") && to.equals("Square km"))
				return no*6.4516/(100000*100000);
			if(from.equals("Square inch") && to.equals("Square inch"))
				return no;
			if(from.equals("Square inch") && to.equals("Square foot"))
				return no*0.006944444444444444;;
			if(from.equals("Square inch") && to.equals("Square yard"))
				return no*0.000771605;
			if(from.equals("Square inch") && to.equals("Square mile"))
				return no*2.4909766860524/(100000*100000);
			if(from.equals("Square inch") && to.equals("Hectare"))
				return no*6.451/(10000*10000);
			if(from.equals("Square inch") && to.equals("Acre"))
				return no*1.59422507907356/(1000*10000);
		//------------------------------------------------------------
			if(from.equals("Square foot") && to.equals("Square metre"))
				return no*0.09290304;
			if(from.equals("Square foot") && to.equals("Square km"))
				return no*9.29030400/(10000*10000);
			if(from.equals("Square foot") && to.equals("Square inch"))
				return no*144;
			if(from.equals("Square foot") && to.equals("Square foot"))
				return no;
			if(from.equals("Square foot") && to.equals("Square yard"))
				return no*0.111111111111111111111;
			if(from.equals("Square foot") && to.equals("Square mile"))
				return no*3.587006427915519/(10000*10000);
			if(from.equals("Square foot") && to.equals("Hectare"))
				return no*9.290304/(1000*1000);
			if(from.equals("Square foot") && to.equals("Acre"))
				return no*2.2956841138659/100000;
		//------------------------------------------------------------
			if(from.equals("Square yard") && to.equals("Square metre"))
				return no*0.83612736;
			if(from.equals("Square yard") && to.equals("Square km"))
				return no*8.3612736/(10000*1000);
			if(from.equals("Square yard") && to.equals("Square inch"))
				return no*1296;
			if(from.equals("Square yard") && to.equals("Square foot"))
				return no*9;
			if(from.equals("Square yard") && to.equals("Square yard"))
				return no;
			if(from.equals("Square yard") && to.equals("Square mile"))
				return no*3.228305785123967/(10000*1000);
			if(from.equals("Square yard") && to.equals("Hectare"))
				return no*8.3612736/100000;
			if(from.equals("Square yard") && to.equals("Acre"))
				return no*0.0002066115702479338752;
		//------------------------------------------------------------
			if(from.equals("Square mile") && to.equals("Square metre"))
				return no*2.589988110336*1000*1000;
			if(from.equals("Square mile") && to.equals("Square km"))
				return no*2.589988110336;
			if(from.equals("Square mile") && to.equals("Square inch"))
				return no*4.0144896*1000*1000*1000;
			if(from.equals("Square mile") && to.equals("Square foot"))
				return no*2.78784*1000*10000;
			if(from.equals("Square mile") && to.equals("Square yard"))
				return no*3.0976*1000*1000;
			if(from.equals("Square mile") && to.equals("Square mile"))
				return no;
			if(from.equals("Square mile") && to.equals("Hectare"))
				return no*258.9988110336;
			if(from.equals("Square mile") && to.equals("Acre"))
				return no*640;
		//------------------------------------------------------------
			if(from.equals("Hectare") && to.equals("Square metre"))
				return no*10000;
			if(from.equals("Hectare") && to.equals("Square km"))
				return no*0.01;
			if(from.equals("Hectare") && to.equals("Square inch"))
				return no*1.55000310000620*1000*10000;
			if(from.equals("Hectare") && to.equals("Square foot"))
				return no*107639.1042;
			if(from.equals("Hectare") && to.equals("Square yard"))
				return no*11959.900463011;
			if(from.equals("Hectare") && to.equals("Square mile"))
				return no*0.003861021585424458594;
			if(from.equals("Hectare") && to.equals("Hectare"))
				return no;
			if(from.equals("Hectare") && to.equals("Acre"))
				return no*2.4710538146716532;
		//------------------------------------------------------------
			if(from.equals("Acre") && to.equals("Square metre"))
				return no*4046.8564224;
			if(from.equals("Acre") && to.equals("Square km"))
				return no*0.0040468564224;
			if(from.equals("Acre") && to.equals("Square inch"))
				return no*6.27263999999999983*1000*1000;
			if(from.equals("Acre") && to.equals("Square foot"))
				return no*43560;
			if(from.equals("Acre") && to.equals("Square yard"))
				return no*4840;
			if(from.equals("Acre") && to.equals("Square mile"))
				return no*0.0015625;
			if(from.equals("Acre") && to.equals("Hectare"))
				return no*0.40468564224;
			if(from.equals("Acre") && to.equals("Acre"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;
	}
	
	public double volumefns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Millilitres") && to.equals("Millilitres"))
				return no;
			if(from.equals("Millilitres") && to.equals("Litres"))
				return no*0.001;
			if(from.equals("Millilitres") && to.equals("Cubic mm"))
				return no*1000;
			if(from.equals("Millilitres") && to.equals("Cubic cm"))
				return no;
			if(from.equals("Millilitres") && to.equals("Cubic metres"))
				return no/(1000*1000);
			if(from.equals("Millilitres") && to.equals("Cubic inches"))
				return no*0.0610237440947322813;
			if(from.equals("Millilitres") && to.equals("Cubic feet"))
				return no*3.5314666711511585938/100000;
			if(from.equals("Millilitres") && to.equals("Gallons(US)"))
				return no*0.00026417205235814842368;
			if(from.equals("Millilitres") && to.equals("Gallons(UK)"))
				return no*0.000219969157380947875;
			if(from.equals("Millilitres") && to.equals("Pint(US)"))
				return no*0.002113376418865187328;
			if(from.equals("Millilitres") && to.equals("Pint(UK)"))
				return no*0.00175975325904758309;
			if(from.equals("Millilitres") && to.equals("Barrels"))
				return no*0.62898107704/100000;
		//------------------------------------------------------------
			if(from.equals("Litres") && to.equals("Millilitres"))
				return no*1000;
			if(from.equals("Litres") && to.equals("Litres"))
				return no;
			if(from.equals("Litres") && to.equals("Cubic mm"))
				return no*1000*1000;
			if(from.equals("Litres") && to.equals("Cubic cm"))
				return no*1000;
			if(from.equals("Litres") && to.equals("Cubic metres"))
				return no*0.001;
			if(from.equals("Litres") && to.equals("Cubic inches"))
				return no*61.023744094732288;
			if(from.equals("Litres") && to.equals("Cubic feet"))
				return no*0.035314666711511580672;
			if(from.equals("Litres") && to.equals("Gallons(US)"))
				return no*0.26417205235814842368;
			if(from.equals("Litres") && to.equals("Gallons(UK)"))
				return no*0.21996915738094788608;
			if(from.equals("Litres") && to.equals("Pint(US)"))
				return no*2.1133764188651872256;
			if(from.equals("Litres") && to.equals("Pint(UK)"))
				return no*1.7597532590475831296;
			if(from.equals("Litres") && to.equals("Barrels"))
				return no*0.62898107704/100;
		//------------------------------------------------------------
			if(from.equals("Cubic mm") && to.equals("Millilitres"))
				return no*0.001;
			if(from.equals("Cubic mm") && to.equals("Litres"))
				return no/(1000*1000);
			if(from.equals("Cubic mm") && to.equals("Cubic mm"))
				return no;
			if(from.equals("Cubic mm") && to.equals("Cubic cm"))
				return no/1000;
			if(from.equals("Cubic mm") && to.equals("Cubic metres"))
				return no/(1000*1000*1000);
			if(from.equals("Cubic mm") && to.equals("Cubic inches"))
				return no*6.10237441/100000;
			if(from.equals("Cubic mm") && to.equals("Cubic feet"))
				return no*353.14667/(100000*100000);
			if(from.equals("Cubic mm") && to.equals("Gallons(US)"))
				return no*2641.72052/(100000*100000);
			if(from.equals("Cubic mm") && to.equals("Gallons(UK)"))
				return no*2199.69248/(100000*100000);
			if(from.equals("Cubic mm") && to.equals("Pint(US)"))
				return no*2.113376418865187328/(1000*1000);
			if(from.equals("Cubic mm") && to.equals("Pint(UK)"))
				return no*1.75975325904758309/(1000*1000);
			if(from.equals("Cubic mm") && to.equals("Barrels"))
				return no*0.62898107704/(10000*10000);
		//------------------------------------------------------------
			if(from.equals("Cubic cm") && to.equals("Millilitres"))
				return no;
			if(from.equals("Cubic cm") && to.equals("Litres"))
				return no*0.001;
			if(from.equals("Cubic cm") && to.equals("Cubic mm"))
				return no*1000;
			if(from.equals("Cubic cm") && to.equals("Cubic cm"))
				return no;
			if(from.equals("Cubic cm") && to.equals("Cubic metres"))
				return no/(1000*1000);
			if(from.equals("Cubic cm") && to.equals("Cubic inches"))
				return no*6.10237441/100;
			if(from.equals("Cubic cm") && to.equals("Cubic feet"))
				return no*353.14667/(10000*1000);
			if(from.equals("Cubic cm") && to.equals("Gallons(US)"))
				return no*2641.72052/(10000*1000);
			if(from.equals("Cubic cm") && to.equals("Gallons(UK)"))
				return no*2199.69248/(10000*1000);
			if(from.equals("Cubic cm") && to.equals("Pint(US)"))
				return no*2.113376418865187328/1000;
			if(from.equals("Cubic cm") && to.equals("Pint(UK)"))
				return no*1.75975325904758309/1000;
			if(from.equals("Cubic cm") && to.equals("Barrels"))
				return no*0.62898107704/(1000*100);
		//------------------------------------------------------------
			if(from.equals("Cubic metres") && to.equals("Millilitres"))
				return no*1000*1000;
			if(from.equals("Cubic metres") && to.equals("Litres"))
				return no*1000;
			if(from.equals("Cubic metres") && to.equals("Cubic mm"))
				return no*1000*1000*1000;
			if(from.equals("Cubic metres") && to.equals("Cubic cm"))
				return no*1000*1000;
			if(from.equals("Cubic metres") && to.equals("Cubic metres"))
				return no;
			if(from.equals("Cubic metres") && to.equals("Cubic inches"))
				return no*61023.7440947323;
			if(from.equals("Cubic metres") && to.equals("Cubic feet"))
				return no*35.3146667115115813;
			if(from.equals("Cubic metres") && to.equals("Gallons(US)"))
				return no*264.172052358148422;
			if(from.equals("Cubic metres") && to.equals("Gallons(UK)"))
				return no*219.969157380947858;
			if(from.equals("Cubic metres") && to.equals("Pint(US)"))
				return no*2113.37641886518727;
			if(from.equals("Cubic metres") && to.equals("Pint(UK)"))
				return no*1759.75325904758327;
			if(from.equals("Cubic metres") && to.equals("Barrels"))
				return no*6.2898107704;
		//------------------------------------------------------------
			if(from.equals("Cubic inches") && to.equals("Millilitres"))
				return no*16.3870639999999989;
			if(from.equals("Cubic inches") && to.equals("Litres"))
				return no*0.0163870639999999989;
			if(from.equals("Cubic inches") && to.equals("Cubic mm"))
				return no*16387.064;
			if(from.equals("Cubic inches") && to.equals("Cubic cm"))
				return no*16.387064;
			if(from.equals("Cubic inches") && to.equals("Cubic metres"))
				return no*1.63870639999999989/100000;
			if(from.equals("Cubic inches") && to.equals("Cubic inches"))
				return no;
			if(from.equals("Cubic inches") && to.equals("Cubic feet"))
				return no*0.00057870370354020984;
			if(from.equals("Cubic inches") && to.equals("Gallons(US)"))
				return no*0.00432900432900432927;
			if(from.equals("Cubic inches") && to.equals("Gallons(UK)"))
				return no*0.00360464866002766566;
			if(from.equals("Cubic inches") && to.equals("Pint(US)"))
				return no*0.0346320346320346312;
			if(from.equals("Cubic inches") && to.equals("Pint(UK)"))
				return no*0.0288371892802213209;
			if(from.equals("Cubic inches") && to.equals("Barrels"))
				return no*0.10307153164/1000;
		//------------------------------------------------------------
			if(from.equals("Cubic feet") && to.equals("Millilitres"))
				return no*28316.8466;
			if(from.equals("Cubic feet") && to.equals("Litres"))
				return no*28.3168466;
			if(from.equals("Cubic feet") && to.equals("Cubic mm"))
				return no*28316846.592;
			if(from.equals("Cubic feet") && to.equals("Cubic cm"))
				return no*28316.846592;
			if(from.equals("Cubic feet") && to.equals("Cubic metres"))
				return no*0.0283168466;
			if(from.equals("Cubic feet") && to.equals("Cubic inches"))
				return no*1728;
			if(from.equals("Cubic feet") && to.equals("Cubic feet"))
				return no;
			if(from.equals("Cubic feet") && to.equals("Gallons(US)"))
				return no*7.48051948263285731;
			if(from.equals("Cubic feet") && to.equals("Gallons(UK)"))
				return no*6.22883288628755937;
			if(from.equals("Cubic feet") && to.equals("Pint(US)"))
				return no*59.8441558610628671;
			if(from.equals("Cubic feet") && to.equals("Pint(UK)"))
				return no*49.8306630903004764;
			if(from.equals("Cubic feet") && to.equals("Barrels"))
				return no*0.17810760668;
		//------------------------------------------------------------
			if(from.equals("Gallons(US)") && to.equals("Millilitres"))
				return no*3785.41178399999973;
			if(from.equals("Gallons(US)") && to.equals("Litres"))
				return no*3.78541178399999973;
			if(from.equals("Gallons(US)") && to.equals("Cubic mm"))
				return no*3785411.78399999973;
			if(from.equals("Gallons(US)") && to.equals("Cubic cm"))
				return no*3785.41178399999973;
			if(from.equals("Gallons(US)") && to.equals("Cubic metres"))
				return no*0.00378541178399999973;
			if(from.equals("Gallons(US)") && to.equals("Cubic inches"))
				return no*231;
			if(from.equals("Gallons(US)") && to.equals("Cubic feet"))
				return no*0.133680555517788473;
			if(from.equals("Gallons(US)") && to.equals("Gallons(US)"))
				return no;
			if(from.equals("Gallons(US)") && to.equals("Gallons(UK)"))
				return no*0.832673840466390651;
			if(from.equals("Gallons(US)") && to.equals("Pint(US)"))
				return no*8;
			if(from.equals("Gallons(US)") && to.equals("Pint(UK)"))
				return no*6.66139072373112585;
			if(from.equals("Gallons(US)") && to.equals("Barrels"))
				return no*0.02380952381;
		//------------------------------------------------------------
			if(from.equals("Gallons(UK)") && to.equals("Millilitres"))
				return no*4546.09187899999927;
			if(from.equals("Gallons(UK)") && to.equals("Litres"))
				return no*4.54609187899999927;
			if(from.equals("Gallons(UK)") && to.equals("Cubic mm"))
				return no*4546090;
			if(from.equals("Gallons(UK)") && to.equals("Cubic cm"))
				return no*4546.09;
			if(from.equals("Gallons(UK)") && to.equals("Cubic metres"))
				return no*0.00454609187899999991;
			if(from.equals("Gallons(UK)") && to.equals("Cubic inches"))
				return no*277.419547455236648;
			if(from.equals("Gallons(UK)") && to.equals("Cubic feet"))
				return no*0.16054371954679444;
			if(from.equals("Gallons(UK)") && to.equals("Gallons(US)"))
				return no*1.20095042188414113;
			if(from.equals("Gallons(UK)") && to.equals("Gallons(UK)"))
				return no;
			if(from.equals("Gallons(UK)") && to.equals("Pint(US)"))
				return no*9.60760337507312906;
			if(from.equals("Gallons(UK)") && to.equals("Pint(UK)"))
				return no*8;
			if(from.equals("Gallons(UK)") && to.equals("Barrels"))
				return no*0.028594045845;
		//------------------------------------------------------------
			if(from.equals("Pint(US)") && to.equals("Millilitres"))
				return no*473.176472999999966;
			if(from.equals("Pint(US)") && to.equals("Litres"))
				return no*0.473176472999999966;
			if(from.equals("Pint(US)") && to.equals("Cubic mm"))
				return no*473176.472999999966;
			if(from.equals("Pint(US)") && to.equals("Cubic cm"))
				return no*473.176472999999966;
			if(from.equals("Pint(US)") && to.equals("Cubic metres"))
				return no*0.000473176472999999966;
			if(from.equals("Pint(US)") && to.equals("Cubic inches"))
				return no*28.875;
			if(from.equals("Pint(US)") && to.equals("Cubic feet"))
				return no*0.0167100694397235566;
			if(from.equals("Pint(US)") && to.equals("Gallons(US)"))
				return no*0.125;
			if(from.equals("Pint(US)") && to.equals("Gallons(UK)"))
				return no*0.104084230058298833;
			if(from.equals("Pint(US)") && to.equals("Pint(US)"))
				return no;
			if(from.equals("Pint(US)") && to.equals("Pint(UK)"))
				return no*0.8326738404663908;
			if(from.equals("Pint(US)") && to.equals("Barrels"))
				return no*0.00297619047617528487389315860081;
		//------------------------------------------------------------
			if(from.equals("Pint(UK)") && to.equals("Millilitres"))
				return no*568.26148487499989;
			if(from.equals("Pint(UK)") && to.equals("Litres"))
				return no*0.56826148487499989;
			if(from.equals("Pint(UK)") && to.equals("Cubic mm"))
				return no*568261.25;
			if(from.equals("Pint(UK)") && to.equals("Cubic cm"))
				return no*568.26125;
			if(from.equals("Pint(UK)") && to.equals("Cubic metres"))
				return no*0.00056826148487499989;
			if(from.equals("Pint(UK)") && to.equals("Cubic inches"))
				return no*34.6774434319045762;
			if(from.equals("Pint(UK)") && to.equals("Cubic feet"))
				return no*0.0200679649433493021;
			if(from.equals("Pint(UK)") && to.equals("Gallons(US)"))
				return no*0.150118802735517667;
			if(from.equals("Pint(UK)") && to.equals("Gallons(UK)"))
				return no*0.125;
			if(from.equals("Pint(UK)") && to.equals("Pint(US)"))
				return no*1.20095042188414107;
			if(from.equals("Pint(UK)") && to.equals("Pint(UK)"))
				return no;
			if(from.equals("Pint(UK)") && to.equals("Barrels"))
				return no*0.0035742557307;
		//------------------------------------------------------------
			if(from.equals("Barrels") && to.equals("Millilitres"))
				return no*158987.294928;
			if(from.equals("Barrels") && to.equals("Litres"))
				return no*158.987294928;
			if(from.equals("Barrels") && to.equals("Cubic mm"))
				return no*158987294.928;
			if(from.equals("Barrels") && to.equals("Cubic cm"))
				return no*158987.294928;
			if(from.equals("Barrels") && to.equals("Cubic metres"))
				return no*0.158987294928;
			if(from.equals("Barrels") && to.equals("Cubic inches"))
				return no*9702;
			if(from.equals("Barrels") && to.equals("Cubic feet"))
				return no*5.61458333333;
			if(from.equals("Barrels") && to.equals("Gallons(US)"))
				return no*42;
			if(from.equals("Barrels") && to.equals("Gallons(UK)"))
				return no*34.9723157544;
			if(from.equals("Barrels") && to.equals("Pint(US)"))
				return no*336.00000000171503887696672064575;
			if(from.equals("Barrels") && to.equals("Pint(UK)"))
				return no*279.778526035;
			if(from.equals("Barrels") && to.equals("Barrels"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double velocityfns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Kilometres/hour") && to.equals("Kilometres/hour"))
				return no;
			if(from.equals("Kilometres/hour") && to.equals("Metres/sec"))
				return no*0.277778;
			if(from.equals("Kilometres/hour") && to.equals("Miles/hour"))
				return no*0.621371;
			if(from.equals("Kilometres/hour") && to.equals("Feet/sec"))
				return no*0.911344;
			if(from.equals("Kilometres/hour") && to.equals("Knots"))
				return no*0.539957;
		//------------------------------------------------------------
			if(from.equals("Metres/sec") && to.equals("Kilometres/hour"))
				return no*3.6;
			if(from.equals("Metres/sec") && to.equals("Metres/sec"))
				return no;
			if(from.equals("Metres/sec") && to.equals("Miles/hour"))
				return no*2.23694;
			if(from.equals("Metres/sec") && to.equals("Feet/sec"))
				return no*3.28084;
			if(from.equals("Metres/sec") && to.equals("Knots"))
				return no*1.94384;
		//------------------------------------------------------------
			if(from.equals("Miles/hour") && to.equals("Kilometres/hour"))
				return no*1.60934;
			if(from.equals("Miles/hour") && to.equals("Metres/sec"))
				return no*0.44704;
			if(from.equals("Miles/hour") && to.equals("Miles/hour"))
				return no;
			if(from.equals("Miles/hour") && to.equals("Feet/sec"))
				return no*1.46667;
			if(from.equals("Miles/hour") && to.equals("Knots"))
				return no*0.868976;
		//------------------------------------------------------------
			if(from.equals("Feet/sec") && to.equals("Kilometres/hour"))
				return no*1.09728;
			if(from.equals("Feet/sec") && to.equals("Metres/sec"))
				return no*0.3048;
			if(from.equals("Feet/sec") && to.equals("Miles/hour"))
				return no*0.681818;
			if(from.equals("Feet/sec") && to.equals("Feet/sec"))
				return no;
			if(from.equals("Feet/sec") && to.equals("Knots"))
				return no*0.592484;
		//------------------------------------------------------------
			if(from.equals("Knots") && to.equals("Kilometres/hour"))
				return no*1.852;
			if(from.equals("Knots") && to.equals("Metres/sec"))
				return no*0.514444;
			if(from.equals("Knots") && to.equals("Miles/hour"))
				return no*1.15078;
			if(from.equals("Knots") && to.equals("Feet/sec"))
				return no*1.68781;
			if(from.equals("Knots") && to.equals("Knots"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double powerfns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Watts") && to.equals("Watts"))
				return no;
			if(from.equals("Watts") && to.equals("Kilowatts"))
				return no/1000;
			if(from.equals("Watts") && to.equals("Horsepower"))
				return no*0.00134102;
		//------------------------------------------------------------
			if(from.equals("Kilowatts") && to.equals("Watts"))
				return no/1000;
			if(from.equals("Kilowatts") && to.equals("Kilowatts"))
				return no;
			if(from.equals("Kilowatts") && to.equals("Horsepower"))
				return no*1.34102;
		//------------------------------------------------------------
			if(from.equals("Horsepower") && to.equals("Watts"))
				return no*745.7;
			if(from.equals("Horsepower") && to.equals("Kilowatts"))
				return (no*745.7)/1000;
			if(from.equals("Horsepower") && to.equals("Horsepower"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double pressurefns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Atmospheres") && to.equals("Atmospheres"))
				return no;
			if(from.equals("Atmospheres") && to.equals("Bars"))
				return no*1.01325;
			if(from.equals("Atmospheres") && to.equals("Pascals"))
				return no*101325;
			if(from.equals("Atmospheres") && to.equals("mm Hg"))
				return no*759.9983;
		//------------------------------------------------------------
			if(from.equals("Bars") && to.equals("Atmospheres"))
				return no*0.98692;
			if(from.equals("Bars") && to.equals("Bars"))
				return no;
			if(from.equals("Bars") && to.equals("Pascals"))
				return no*100000;
			if(from.equals("Bars") && to.equals("mm Hg"))
				return no*750.06;
		//------------------------------------------------------------
			if(from.equals("Pascals") && to.equals("Atmospheres"))
				return (no*0.9869232667)/100000;
			if(from.equals("Pascals") && to.equals("Bars"))
				return no/100000;
			if(from.equals("Pascals") && to.equals("Pascals"))
				return no;
			if(from.equals("Pascals") && to.equals("mm Hg"))
				return no*0.0075;
		//------------------------------------------------------------
			if(from.equals("mm Hg") && to.equals("Atmospheres"))
				return no*0.00131579;
			if(from.equals("mm Hg") && to.equals("Bars"))
				return no*0.00133323;
			if(from.equals("mm Hg") && to.equals("Pascals"))
				return no*133.32267;
			if(from.equals("mm Hg") && to.equals("mm Hg"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;	
	}
	
	public double lengthfns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Centimetres") && to.equals("Centimetres"))
				return no;
			if(from.equals("Centimetres") && to.equals("Metres"))
				return no/100;
			if(from.equals("Centimetres") && to.equals("Kilometres"))
				return no/(100*1000);
			if(from.equals("Centimetres") && to.equals("Inches"))
				return (no*0.393701);
			if(from.equals("Centimetres") && to.equals("Feet"))
				return (no*0.0328084);
			if(from.equals("Centimetres") && to.equals("Yards"))
				return (no*0.0109361);
			if(from.equals("Centimetres") && to.equals("Miles"))
				return (no*6.21371)/1000000;
			if(from.equals("Centimetres") && to.equals("Nautical Miles"))
				return (no*5.39957)/1000000;
		//------------------------------------------------------------
			if(from.equals("Metres") && to.equals("Centimetres"))
				return no*100;
			if(from.equals("Metres") && to.equals("Metres"))
				return no;
			if(from.equals("Metres") && to.equals("Kilometres"))
				return no/1000;
			if(from.equals("Metres") && to.equals("Inches"))
				return (no*39.3701);
			if(from.equals("Metres") && to.equals("Feet"))
				return (no*3.28084);
			if(from.equals("Metres") && to.equals("Yards"))
				return (no*1.09361);
			if(from.equals("Metres") && to.equals("Miles"))
				return (no*0.000621371);
			if(from.equals("Metres") && to.equals("Nautical Miles"))
				return (no*0.000539957);
		//------------------------------------------------------------
			if(from.equals("Kilometres") && to.equals("Centimetres"))
				return no*100*1000;
			if(from.equals("Kilometres") && to.equals("Metres"))
				return no*1000;
			if(from.equals("Kilometres") && to.equals("Kilometres"))
				return no;
			if(from.equals("Kilometres") && to.equals("Inches"))
				return no;
			if(from.equals("Kilometres") && to.equals("Feet"))
				return no*39370.1;
			if(from.equals("Kilometres") && to.equals("Yards"))
				return no*1093.61;
			if(from.equals("Kilometres") && to.equals("Miles"))
				return no*0.621371;
			if(from.equals("Kilometres") && to.equals("Nautical Miles"))
				return no*0.539957;
		//------------------------------------------------------------
			if(from.equals("Inches") && to.equals("Centimetres"))
				return no*2.54;
			if(from.equals("Inches") && to.equals("Metres"))
				return no*0.0254;
			if(from.equals("Inches") && to.equals("Kilometres"))
				return (no*2.54)/100000;
			if(from.equals("Inches") && to.equals("Inches"))
				return no;
			if(from.equals("Inches") && to.equals("Feet"))
				return no*0.0833333;
			if(from.equals("Inches") && to.equals("Yards"))
				return no*0.0277778;
			if(from.equals("Inches") && to.equals("Miles"))
				return (no*1.5783)/100000;
			if(from.equals("Inches") && to.equals("Nautical Miles"))
				return (no*1.3715)/100000;
		//------------------------------------------------------------
			if(from.equals("Feet") && to.equals("Centimetres"))
				return no*30.48;
			if(from.equals("Feet") && to.equals("Metres"))
				return no*0.3048;
			if(from.equals("Feet") && to.equals("Kilometres"))
				return no*0.0003048;
			if(from.equals("Feet") && to.equals("Inches"))
				return no*12;
			if(from.equals("Feet") && to.equals("Feet"))
				return no;
			if(from.equals("Feet") && to.equals("Yards"))
				return no*0.333333;
			if(from.equals("Feet") && to.equals("Miles"))
				return no*0.000189394;
			if(from.equals("Feet") && to.equals("Nautical Miles"))
				return no*0.000164579;
		//------------------------------------------------------------
			if(from.equals("Yards") && to.equals("Centimetres"))
				return no*91.44;
			if(from.equals("Yards") && to.equals("Metres"))
				return no*0.9144;
			if(from.equals("Yards") && to.equals("Kilometres"))
				return no*0.0009144;
			if(from.equals("Yards") && to.equals("Inches"))
				return no*36;
			if(from.equals("Yards") && to.equals("Feet"))
				return no*3;
			if(from.equals("Yards") && to.equals("Yards"))
				return no;
			if(from.equals("Yards") && to.equals("Miles"))
				return no*0.000568182;
			if(from.equals("Yards") && to.equals("Nautical Miles"))
				return no*0.000493737;
		//------------------------------------------------------------
			if(from.equals("Miles") && to.equals("Centimetres"))
				return no*160934;
			if(from.equals("Miles") && to.equals("Metres"))
				return no*1609.34;
			if(from.equals("Miles") && to.equals("Kilometres"))
				return no*1.60934;
			if(from.equals("Miles") && to.equals("Inches"))
				return no*63360;
			if(from.equals("Miles") && to.equals("Feet"))
				return no*5280;
			if(from.equals("Miles") && to.equals("Yards"))
				return no*1760;
			if(from.equals("Miles") && to.equals("Miles"))
				return no;
			if(from.equals("Miles") && to.equals("Nautical Miles"))
				return no*0.868976;
		//------------------------------------------------------------
			if(from.equals("Nautical Miles") && to.equals("Centimetres"))
				return no*185200;
			if(from.equals("Nautical Miles") && to.equals("Metres"))
				return no*1852;
			if(from.equals("Nautical Miles") && to.equals("Kilometres"))
				return no*1.852;
			if(from.equals("Nautical Miles") && to.equals("Inches"))
				return no*72913.4;
			if(from.equals("Nautical Miles") && to.equals("Feet"))
				return no*6076.12;
			if(from.equals("Nautical Miles") && to.equals("Yards"))
				return no*2025.37;
			if(from.equals("Nautical Miles") && to.equals("Miles"))
				return no*1.15078;
			if(from.equals("Nautical Miles") && to.equals("Nautical Miles"))
				return no;
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;
	}

	public double massfns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Milligram") && to.equals("Milligram"))
				return no;
			if(from.equals("Milligram") && to.equals("Grammes"))
				return no/1000;
			if(from.equals("Milligram") && to.equals("Kilogrammes"))
				return no/(1000*1000);
			if(from.equals("Milligram") && to.equals("Metric tons"))
				return no/(1000*1000*1000);
			if(from.equals("Milligram") && to.equals("Ounces"))
				return (no*3.5274)/100000;
			if(from.equals("Milligram") && to.equals("Pounds"))
				return (no*2.20462)/1000000;
			if(from.equals("Milligram") && to.equals("Stones"))
				return (no*1.57473)/10000000;
		//------------------------------------------------------------
			if(from.equals("Grammes") && to.equals("Milligram"))
				return no*1000;
			if(from.equals("Grammes") && to.equals("Grammes"))
				return no;
			if(from.equals("Grammes") && to.equals("Kilogrammes"))
				return no/1000;
			if(from.equals("Grammes") && to.equals("Metric tons"))
				return no/(1000*1000);
			if(from.equals("Grammes") && to.equals("Ounces"))
				return (no*3.5274)/100;
			if(from.equals("Grammes") && to.equals("Pounds"))
				return (no*2.20462)/1000;
			if(from.equals("Grammes") && to.equals("Stones"))
				return (no*1.57473)/10000;
		//------------------------------------------------------------
			if(from.equals("Kilogrammes") && to.equals("Milligram"))
				return no*1000*1000;
			if(from.equals("Kilogrammes") && to.equals("Grammes"))
				return no*1000;
			if(from.equals("Kilogrammes") && to.equals("Kilogrammes"))
				return no;
			if(from.equals("Kilogrammes") && to.equals("Metric tons"))
				return no/1000;
			if(from.equals("Kilogrammes") && to.equals("Ounces"))
				return (no*3.5274)*10;
			if(from.equals("Kilogrammes") && to.equals("Pounds"))
				return (no*2.20462);
			if(from.equals("Kilogrammes") && to.equals("Stones"))
				return (no*1.57473)/10;
		//------------------------------------------------------------
			if(from.equals("Metric tons") && to.equals("Milligram"))
				return no*1000*1000*1000;
			if(from.equals("Metric tons") && to.equals("Grammes"))
				return no*1000*1000;
			if(from.equals("Metric tons") && to.equals("Kilogrammes"))
				return no*1000;
			if(from.equals("Metric tons") && to.equals("Metric tons"))
				return no;
			if(from.equals("Metric tons") && to.equals("Ounces"))
				return (no*35274);
			if(from.equals("Metric tons") && to.equals("Pounds"))
				return (no*2204.62);
			if(from.equals("Metric tons") && to.equals("Stones"))
				return (no*157.473);
		//------------------------------------------------------------
			if(from.equals("Ounces") && to.equals("Milligram"))
				return (no*28349.5);
			if(from.equals("Ounces") && to.equals("Grammes"))
				return (no*28.3495);
			if(from.equals("Ounces") && to.equals("Kilogrammes"))
				return (no*0.0283495);
			if(from.equals("Ounces") && to.equals("Metric tons"))
				return (no*0.0283495)/1000;
			if(from.equals("Ounces") && to.equals("Ounces"))
				return no;
			if(from.equals("Ounces") && to.equals("Pounds"))
				return (no*0.0625);
			if(from.equals("Ounces") && to.equals("Stones"))
				return (no*0.00446429);
		//------------------------------------------------------------
			if(from.equals("Pounds") && to.equals("Milligram"))
				return (no*453592);
			if(from.equals("Pounds") && to.equals("Grammes"))
				return (no*453.592);
			if(from.equals("Pounds") && to.equals("Kilogrammes"))
				return (no*0.453592);
			if(from.equals("Pounds") && to.equals("Metric tons"))
				return (no*0.453592)/1000;
			if(from.equals("Pounds") && to.equals("Ounces"))
				return no*16;
			if(from.equals("Pounds") && to.equals("Pounds"))
				return no;
			if(from.equals("Pounds") && to.equals("Stones"))
				return (no*0.0714286);
		//------------------------------------------------------------
			if(from.equals("Stones") && to.equals("Milligram"))
				return (no*6.35029)*1000000;
			if(from.equals("Stones") && to.equals("Grammes"))
				return (no*6350.29);
			if(from.equals("Stones") && to.equals("Kilogrammes"))
				return (no*6.35029);
			if(from.equals("Stones") && to.equals("Metric tons"))
				return (no*6.35029)/1000;
			if(from.equals("Stones") && to.equals("Ounces"))
				return no*224;
			if(from.equals("Stones") && to.equals("Pounds"))
				return no*14;
			if(from.equals("Stones") && to.equals("Stones"))
				return no;			
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;
	}
	
	public double timefns(){
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Seconds") && to.equals("Seconds"))
				return no;
			if(from.equals("Seconds") && to.equals("Minutes"))
				return no/60;
			if(from.equals("Seconds") && to.equals("Hours"))
				return no/3600;
			if(from.equals("Seconds") && to.equals("Days"))
				return no/(24*3600);
			if(from.equals("Seconds") && to.equals("Weeks"))
				return no/(7*24*3600);
		//------------------------------------------------------------
			if(from.equals("Minutes") && to.equals("Seconds"))
				return no*60;
			if(from.equals("Minutes") && to.equals("Minutes"))
				return no;
			if(from.equals("Minutes") && to.equals("Hours"))
				return no/60;
			if(from.equals("Minutes") && to.equals("Days"))
				return no/(24*60);
			if(from.equals("Minutes") && to.equals("Weeks"))
				return no/(7*24*60);
		//------------------------------------------------------------
			if(from.equals("Hours") && to.equals("Seconds"))
				return no*60*60;
			if(from.equals("Hours") && to.equals("Minutes"))
				return no*60;
			if(from.equals("Hours") && to.equals("Hours"))
				return no;
			if(from.equals("Hours") && to.equals("Days"))
				return no/24;
			if(from.equals("Hours") && to.equals("Weeks"))
				return no/(7*24);
		//------------------------------------------------------------
			if(from.equals("Days") && to.equals("Seconds"))
				return (no*24*60*60);
			if(from.equals("Days") && to.equals("Minutes"))
				return (no*24*60);
			if(from.equals("Days") && to.equals("Hours"))
				return (no*24);
			if(from.equals("Days") && to.equals("Days"))
				return (no);
			if(from.equals("Days") && to.equals("Weeks"))
				return (no/7);
		//------------------------------------------------------------	
			if(from.equals("Weeks") && to.equals("Seconds"))
				return (no*7*24*60*60);
			if(from.equals("Weeks") && to.equals("Minutes"))
				return (no*7*24*60);
			if(from.equals("Weeks") && to.equals("Hours"))
				return (no*7*24);
			if(from.equals("Weeks") && to.equals("Days"))
				return (no*7);
			if(from.equals("Weeks") && to.equals("Weeks"))
				return (no);
		//------------------------------------------------------------	
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;
	}
		
	public double tempfns() {
		try{
		input = amount.getText().toString();
		Double no = Double.parseDouble(input);
		//------------------------------------------------------------
			if(from.equals("Celsius") && to.equals("Celsius"))
				return no;
			if(from.equals("Celsius") && to.equals("Fahrenheit"))
				return ((9*no)/5)+ 32;
			if(from.equals("Celsius") && to.equals("Kelvin"))
				return (no+273);
		//------------------------------------------------------------
			if(from.equals("Fahrenheit") && to.equals("Celsius"))
				return ((no -32)*5/9);
			if(from.equals("Fahrenheit") && to.equals("Fahrenheit"))
				return no;
			if(from.equals("Fahrenheit") && to.equals("Kelvin"))
				return (5/9*(no-32)+273);
		//------------------------------------------------------------
			if(from.equals("Kelvin") && to.equals("Celsius"))
				return (no-273);
			if(from.equals("Kelvin") && to.equals("Fahrenheit"))
				return (9/5*no+32);
			if(from.equals("Kelvin") && to.equals("Kelvin"))
				return no;	
		//------------------------------------------------------------
		} catch (Exception e) {
			disp.setText("Enter the amount !");
		}
	return 0.0;
	}
	
	public void set(int position){
		try{
			if(position==0){
				   ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, length);
		           adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		           fromSpinner.setAdapter(adapter1);
		           
		           ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, length);
		           adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		           toSpinner.setAdapter(adapter2);
		           
		           ilength=1; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==1){
			   ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, mass);
	           adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	           fromSpinner.setAdapter(adapter1);
	           
	           ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, mass);
	           adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	           toSpinner.setAdapter(adapter2);
	           
	           ilength=0; imass=1; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==2){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, power);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, power);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=1; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==3){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pressure);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, pressure);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=1; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==4){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, temp);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, temp);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=1; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==5){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, time);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, time);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=1; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==6){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, velocity);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, velocity);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=1; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==7){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, volume);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, volume);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=1; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==8){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, area);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, area);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=1; ifuelcon=0; idigital=0; inumber=0; iangle=0;
			}
			else if(position==9){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, fuelcon);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, fuelcon);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=1; idigital=0; inumber=0; iangle=0;
			}
			else if(position==10){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, digital);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, digital);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=1; inumber=0; iangle=0;
			}
			else if(position==11){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, NumberSystem);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, NumberSystem);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=1; iangle=0;
			}
			else if(position==12){
				ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, Angle);
	            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            fromSpinner.setAdapter(adapter1);
	               
	            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, Angle);
	            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	            toSpinner.setAdapter(adapter2);
	            
	            ilength=0; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; iarea=0; ifuelcon=0; idigital=0; inumber=0; iangle=1;
			}
		} catch (Exception e) {
			disp.setText("Select a type !");
		}
	}
	
	public void initialise(){
		try{
			disp = (TextView)findViewById(R.id.textViewanswer);
			bconvert = (Button)findViewById(R.id.bconvert);
			amount = (EditText)findViewById(R.id.editTextamount);
			
	        typeSpinner = (Spinner) findViewById(R.id.spinnertype);
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, type);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        typeSpinner.setAdapter(adapter);
	        
	        fromSpinner = (Spinner) findViewById(R.id.spinnerfrom);
	        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, length);
	        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        fromSpinner.setAdapter(adapter1);
	        
	        toSpinner = (Spinner) findViewById(R.id.spinnerto);
	        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, length);
	        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        toSpinner.setAdapter(adapter2);
	        
	        ilength=1; imass=0; ipower=0; ipressure=0; itemp=0; itime=0; ivelocity=0; ivolume=0; idigital=0; ifuelcon=0; inumber=0; iangle=0;
		} catch (Exception e) {
			disp.setText("Failed Initialization !");
		}
	}
}


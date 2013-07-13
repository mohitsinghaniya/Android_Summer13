package com.iitg.sciencereferences;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Animation extends Activity {

	Button alist, avideo, aanimation, amore; 
	
	EditText tvAnimationSearch;
	Button bSearchAnimation;
	
	String back = "";
	String chapter = "";
	String h = "";
	String formula_no = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);
		initialise();
		
		try {
			Bundle get = getIntent().getExtras();
			h = get.getString("0");
			back = get.getString("1");
			chapter = get.getString("2");
			formula_no = get.getString("3");
			tvAnimationSearch.setText(formula_no);
		} catch (Exception e) {
			// Do nothing.
		}
	}

	public void openAnimation() {
		
		int formula_no = Integer.parseInt(tvAnimationSearch.getText().toString());
		
		if (back.equalsIgnoreCase("physics")) {
			if (chapter.equals("0")) {
				// Chapter one formulas videos
				if(formula_no==1){
					// For opening the Video in YouTube, any Browser.
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=Wmc4gQmhAQI")));
				} else {
					Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
					t.show();
				}
			}
			if (chapter.equals("1")) {
				// Chapter two formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("2")) {
				// Chapter three formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("3")) {
				// Chapter four formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("4")) {
				// Chapter five formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("5")) {
				// Chapter six formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("6")) {
				// Chapter seven formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
		}
		if (back.equalsIgnoreCase("chemistry")) {
			if (chapter.equals("0")) {
				// Chapter one formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("1")) {
				// Chapter two formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("2")) {
				// Chapter three formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("3")) {
				// Chapter four formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("4")) {
				// Chapter five formulas videos
				Toast t = Toast.makeText(this, "No animation available", Toast.LENGTH_LONG);
				t.show();
			}
		}
	}
	
	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.bSearchAnimation:
			try{
				openAnimation();
			} 
			catch (Exception e) {
				Toast t = Toast.makeText(this, "Enter the Formula Number", Toast.LENGTH_LONG);
				t.show();
			}
			break;
			
		case R.id.alist:
			  finish();
              Intent iList = new Intent(this, List.class);
              Bundle passtoList = new Bundle();
              passtoList.putString("0", h);
              passtoList.putString("1", back);
              passtoList.putString("2", chapter);
              iList.putExtras(passtoList);
              startActivity(iList);
			break;
		case R.id.avideo:
			formula_no = tvAnimationSearch.getText().toString();
			finish();
            Intent ivideo = new Intent(this, Video.class);
            Bundle passtoVideo = new Bundle();
            passtoVideo.putString("0", h);
            passtoVideo.putString("1", back);
            passtoVideo.putString("2", chapter);
            passtoVideo.putString("3", formula_no);
            ivideo.putExtras(passtoVideo);
            startActivity(ivideo);
			break;
		case R.id.amore:
			formula_no = tvAnimationSearch.getText().toString();
			finish();
            Intent imore = new Intent(this, More.class);
            Bundle passtoMore = new Bundle();
            passtoMore.putString("0", h);
            passtoMore.putString("1", back);
            passtoMore.putString("2", chapter);
            passtoMore.putString("3", formula_no);
            imore.putExtras(passtoMore);
            startActivity(imore);
			break;
		}
	}
	
	public void initialise(){
		aanimation = (Button) findViewById(R.id.aanimation);
		aanimation.setBackgroundColor(Color.RED);
		
		alist = (Button) findViewById(R.id.alist);
		avideo = (Button) findViewById(R.id.video);
		amore = (Button) findViewById(R.id.amore);
		
		bSearchAnimation = (Button) findViewById(R.id.bSearchAnimation);
		tvAnimationSearch = (EditText) findViewById(R.id.tvAnimationSearch);
	}

}

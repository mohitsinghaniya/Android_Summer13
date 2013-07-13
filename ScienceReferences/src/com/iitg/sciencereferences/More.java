package com.iitg.sciencereferences;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class More extends Activity {

	Button mlist, manimation, mvideo, mmore;

	EditText tvMoreSearch;
	Button bSearchMore;

	String back = "";
	String chapter = "";
	String h = "";

	String url = "";
	String formula_no = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_more);
		initialise();

		try {
			Bundle get = getIntent().getExtras();
			h = get.getString("0");
			back = get.getString("1");
			chapter = get.getString("2");
			formula_no = get.getString("3");
			tvMoreSearch.setText(formula_no);
		} catch (Exception e) {
			// Do nothing.
		}
	}

	public void openLink() {
		
		int formula_no = Integer.parseInt(tvMoreSearch.getText().toString());
		
		if (back.equalsIgnoreCase("physics")) {
			if (chapter.equals("0")) {
				// Chapter one formulas links
				if(formula_no==1){
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://en.wikipedia.org/wiki/Linear_motion"));
					startActivity(browserIntent);
				} else {
					Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
					t.show();
				}
			}
			if (chapter.equals("1")) {
				// Chapter two formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("2")) {
				// Chapter three formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("3")) {
				// Chapter four formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("4")) {
				// Chapter five formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("5")) {
				// Chapter six formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("6")) {
				// Chapter seven formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
		}
		if (back.equalsIgnoreCase("chemistry")) {
			if (chapter.equals("0")) {
				// Chapter one formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("1")) {
				// Chapter two formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("2")) {
				// Chapter three formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("3")) {
				// Chapter four formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("4")) {
				// Chapter five formulas links
				Toast t = Toast.makeText(this, "Not available", Toast.LENGTH_LONG);
				t.show();
			}
		}
	}

	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.bSearchMore:
			try{
				openLink();
			}
			catch (Exception e) {
				Toast t = Toast.makeText(this, "Enter the Formula Number", Toast.LENGTH_LONG);
				t.show();
			}
			break;

		case R.id.mlist:
			finish();
			Intent iList = new Intent(this, List.class);
			Bundle passtoList = new Bundle();
			passtoList.putString("0", h);
			passtoList.putString("1", back);
			passtoList.putString("2", chapter);
			iList.putExtras(passtoList);
			startActivity(iList);
			break;
		case R.id.mvideo:
			formula_no = tvMoreSearch.getText().toString();
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
		case R.id.manimation:
			formula_no = tvMoreSearch.getText().toString();
			finish();
			Intent ianimation = new Intent(this, Animation.class);
			Bundle passtoAnimation = new Bundle();
			passtoAnimation.putString("0", h);
			passtoAnimation.putString("1", back);
			passtoAnimation.putString("2", chapter);
			passtoAnimation.putString("3", formula_no);
			ianimation.putExtras(passtoAnimation);
			startActivity(ianimation);
			break;
		}
	}

	public void initialise() {
		mmore = (Button) findViewById(R.id.mmore);
		mmore.setBackgroundColor(Color.RED);

		mlist = (Button) findViewById(R.id.mlist);
		manimation = (Button) findViewById(R.id.manimation);
		mvideo = (Button) findViewById(R.id.mmore);

		bSearchMore = (Button) findViewById(R.id.bSearchMore);
		tvMoreSearch = (EditText) findViewById(R.id.tvMoreSearch);
	}

}

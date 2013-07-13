package com.iitg.sciencereferences;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class List extends Activity {

	Button bback, bmainmenu;
	EditText tvlist;
	Button list, video, animation, web;
	
	String back = "";
	String name = "";
	String chapter = "";
	String h = "";
	int ctr = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		initialise();		
		
		try {
			Bundle get = getIntent().getExtras();
			name = get.getString("0");
			back = get.getString("1");
			chapter = get.getString("2");
		} catch (Exception e) {
			// Do nothing.
		}
		
		h += name;
		tvlist.setText(Html.fromHtml(h));
	}
	
	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.video:
			  finish();
              Intent ivideo = new Intent(this, Video.class);
              Bundle passtoVideo = new Bundle();
              passtoVideo.putString("0", h);
              passtoVideo.putString("1", back);
              passtoVideo.putString("2", chapter);
              ivideo.putExtras(passtoVideo);
              startActivity(ivideo);
			break;
		case R.id.animation:
			 finish();
             Intent ianimation = new Intent(this, Animation.class);
             Bundle passtoAnimation = new Bundle();
             passtoAnimation.putString("0", h);
             passtoAnimation.putString("1", back);
             passtoAnimation.putString("2", chapter);
             ianimation.putExtras(passtoAnimation);
             startActivity(ianimation);
			break;
		case R.id.more:
			finish();
            Intent imore = new Intent(this, More.class);
            Bundle passtoMore = new Bundle();
            passtoMore.putString("0", h);
            passtoMore.putString("1", back);
            passtoMore.putString("2", chapter);
            imore.putExtras(passtoMore);
            startActivity(imore);
			break;
		
		case R.id.bmainmenu:
			finish();
			break;

		case R.id.bback:
				if (back.equals("Physics")) {
					Intent physics = new Intent(this, Physics.class);
					finish();
					startActivity(physics);
				} else if (back.equals("Chemistry")) {
					Intent chemistry = new Intent(this, Chemistry.class);
					finish();
					startActivity(chemistry);
				}
			break;
		}
	}
	
	public void initialise(){
		list = (Button) findViewById(R.id.list);
		list.setBackgroundColor(Color.RED);
		
		bback = (Button) findViewById(R.id.bback);
		bmainmenu = (Button) findViewById(R.id.bmainmenu);
		
		tvlist = (EditText) findViewById(R.id.tvlist);
		
		video = (Button) findViewById(R.id.video);
		animation = (Button) findViewById(R.id.animation);
		web = (Button) findViewById(R.id.more);
		
	}
}


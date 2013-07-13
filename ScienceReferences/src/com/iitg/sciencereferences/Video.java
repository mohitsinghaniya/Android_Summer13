package com.iitg.sciencereferences;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends Activity {

	Button vlist, vvideo, vanimation, vmore; 
	
	EditText tvVideoSearch;
	Button bSearchVideo;
	
	String back = "";
	String chapter = "";
	String h = "";
	String addr = "";
	String formula_no = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video);
		initialise();
		
		try {
			Bundle get = getIntent().getExtras();
			h = get.getString("0");
			back = get.getString("1");
			chapter = get.getString("2");
			formula_no = get.getString("3");
			tvVideoSearch.setText(formula_no);
		} catch (Exception e) {
			// Do nothing.
		}
	}
	
	public void play(){
		Intent iMediaPlayer = new Intent(this, com.iitg.sciencereferences.MediaPlayer.class);
        Bundle passtoMediaPlayer = new Bundle();
        passtoMediaPlayer.putString("0", addr);
        iMediaPlayer.putExtras(passtoMediaPlayer);
        startActivity(iMediaPlayer);
	}
	
	public void openVideo() {
		
		int formula_no = Integer.parseInt(tvVideoSearch.getText().toString());
		
		if (back.equalsIgnoreCase("physics")) {
			if (chapter.equals("0")) {
				// Chapter one formulas videos
				if(formula_no==1){				
					addr = "android.resource://" + getPackageName() +"/"+R.raw.lmv;
					play();
				} else {
					Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
					t.show();
				}
			}
			if (chapter.equals("1")) {
				// Chapter two formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("2")) {
				// Chapter three formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("3")) {
				// Chapter four formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("4")) {
				// Chapter five formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("5")) {
				// Chapter six formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("6")) {
				// Chapter seven formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
		}
		if (back.equalsIgnoreCase("chemistry")) {
			if (chapter.equals("0")) {
				// Chapter one formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("1")) {
				// Chapter two formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("2")) {
				// Chapter three formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("3")) {
				// Chapter four formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
			if (chapter.equals("4")) {
				// Chapter five formulas videos
				Toast t = Toast.makeText(this, "No videos available", Toast.LENGTH_LONG);
				t.show();
			}
		}
	}

	public void whenClick(View v) {
		switch (v.getId()) {
		case R.id.bSearchVideo:
			try{
				openVideo();
			}
			catch (Exception e) {
				Toast t = Toast.makeText(this, "Enter the Formula Number", Toast.LENGTH_LONG);
				t.show();
			}
			break;
		
		case R.id.vlist:
			  finish();
              Intent iList = new Intent(this, List.class);
              Bundle passtoList = new Bundle();
              passtoList.putString("0", h);
              passtoList.putString("1", back);
              passtoList.putString("2", chapter);
              iList.putExtras(passtoList);
              startActivity(iList);
			break;
		case R.id.vanimation:
			formula_no = tvVideoSearch.getText().toString();
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
		case R.id.vmore:
			formula_no = tvVideoSearch.getText().toString();
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
		vvideo = (Button) findViewById(R.id.vvideo);
		vvideo.setBackgroundColor(Color.RED);
		
		vlist = (Button) findViewById(R.id.vlist);
		vanimation = (Button) findViewById(R.id.vanimation);
		vmore = (Button) findViewById(R.id.vmore);
		
		bSearchVideo = (Button) findViewById(R.id.bSearchVideo);
		tvVideoSearch = (EditText) findViewById(R.id.tvVideoSearch);	
	}
}

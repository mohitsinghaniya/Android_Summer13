package com.iitg.sciencereferences;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MediaPlayer extends Activity {

	String videoadd;
	VideoView videoview;
	Button play;
	LinearLayout layout;

	int white = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_media_player);

		layout = (LinearLayout) findViewById(R.id.layout);
		layout.setBackgroundColor(Color.WHITE);
		
		try {
			
			Toast t = Toast.makeText(this, "Tap on the video to play", Toast.LENGTH_LONG);
			t.show();
			
			videoadd = getIntent().getExtras().getString("0");
			videoview = (VideoView) findViewById(R.id.vv);
			videoview.setVideoURI(Uri.parse(videoadd));
			videoview.setMediaController(new MediaController(this));
			videoview.requestFocus();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.media_player, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.color_change:
			if(white == 1){
				layout.setBackgroundColor(Color.BLACK);
				white = 0;
			} else {
				layout.setBackgroundColor(Color.WHITE);
				white = 1;
			}
			break;
			
		case R.id.exit:
			finish();
			break;
		}
		return false;
	}
}

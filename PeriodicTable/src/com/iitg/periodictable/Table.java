package com.iitg.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Switch;

public class Table extends Activity {

	WebView table;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table);

		table = (WebView) findViewById(R.id.webview);
		table.loadUrl("file:///android_asset/periodic_table.gif");
	}
}

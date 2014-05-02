package com.locuslabs.notiphisample;


import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class SecondActivity extends Activity{


	private static final String TAG = SecondActivity.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		String payloadData = getIntent().getStringExtra("client_data");
		Log.d(TAG, "Payload received from notification is equal = " + payloadData);
		try {
			JSONObject jsonObject = new JSONObject(payloadData);
			double lat = jsonObject.getDouble("lat");
			double lon = jsonObject.getDouble("lon");
			Log.d(TAG, " Latitude receied  is = " + lat);
			Log.d(TAG, "Lontitude received is = " + lon);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}

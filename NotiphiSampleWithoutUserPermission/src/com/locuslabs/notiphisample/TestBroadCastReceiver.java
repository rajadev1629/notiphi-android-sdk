package com.locuslabs.notiphisample;

import android.content.Context;
import android.util.Log;

import com.google.android.gcm.GCMBroadcastReceiver;

public class TestBroadCastReceiver extends GCMBroadcastReceiver{

	public static final String TAG = "TestBroadCastReceiver";
	
	@Override
	protected String getGCMIntentServiceClassName(Context context) {
		String serviceName = DemoHelperService.class.getCanonicalName();
		Log.d(TAG, " Inside receiver it will call demo helper service");
		return serviceName;
	}
	

}

package com.locuslabs.notiphisample;

import android.content.Context;
import android.content.Intent;

import com.google.android.gcm.GCMBaseIntentService;

public class DemoHelperService extends GCMBaseIntentService{

	
	@Override
	protected void onError(Context arg0, String arg1) {
		
	}

	@Override
	protected void onMessage(Context context, Intent intentData) {
		// Please copy and paste the below code as first line  inside onMessage method 
		
		if(intentData.getStringExtra("is_notiphi") != null){
			return;
		}
		
		//--------------------------------------------------------------------
		
	}

	@Override
	protected void onRegistered(Context arg0, String arg1) {
		
		
	}

	@Override
	protected void onUnregistered(Context arg0, String arg1) {
		
		
	}

}

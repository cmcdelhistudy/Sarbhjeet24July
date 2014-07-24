package com.example.sarabhjeetservicesstudy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {

		Toast.makeText(getBaseContext(), "Service Started", Toast.LENGTH_LONG)
				.show();

		return START_STICKY;
	}

	@Override
	public void onDestroy() {
		Toast.makeText(getBaseContext(), "Service Stopped", Toast.LENGTH_LONG)
				.show();
		super.onDestroy();
	}
}

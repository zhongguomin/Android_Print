package com.thtfit.print.view;

import com.thtfit.print.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private static final String TAG = "Android_Print";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bluetoothPrintButton = (Button)findViewById(R.id.bluetooth_print);
		bluetoothPrintButton.setOnClickListener(buttOnClickListener);
	}

	private OnClickListener buttOnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			switch (view.getId()) {
			case R.id.bluetooth_print:
				Intent bluetoothPrintIntent = new Intent(MainActivity.this, BluetoothPrintActivity.class);
				startActivity(bluetoothPrintIntent);
				break;

			default:
				Log.e(TAG, "Unkown Event ..");
				break;
			}
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

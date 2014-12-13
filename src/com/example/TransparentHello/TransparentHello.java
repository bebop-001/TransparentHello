package com.example.TransparentHello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.libtest.Lib;

public class TransparentHello extends Activity {
	static final String logTag = "Hello";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transparent_hello);
		Lib l = new Lib(this);
		String s = l.libGetString(R.string.hello_world);
		Log.i(logTag, "String: "+ s);
	}
	public void finishClick (View v) {
		finish();
	}
}

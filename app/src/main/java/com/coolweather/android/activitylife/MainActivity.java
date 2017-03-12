package com.coolweather.android.activitylife;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;


public class MainActivity extends Activity
{
    private static final String TAG = "MainActivity_test";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null)
        {

            String test = savedInstanceState.getString("test");
            Log.i(TAG, "savedInstanceState: " + test);
        }
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: ");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putString("test", ((EditText) this.findViewById(R.id.text)).getText().toString());
        Log.i(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState: ");
    }
}


package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.example.R;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClick(View view) {
        Log.d(TAG, "onClick");
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }
}

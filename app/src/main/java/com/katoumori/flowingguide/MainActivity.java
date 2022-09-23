package com.katoumori.flowingguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        try{
//            startActivity(new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS));
//        } catch (Exception e) {
//            Log.i(TAG, "start ACTION_ACCESSIBILITY_SETTINGS fail: " + e.getMessage());
//            startActivity(new Intent(Settings.ACTION_SETTINGS));
//        } finally {
//            finish();
//        }
    }
}
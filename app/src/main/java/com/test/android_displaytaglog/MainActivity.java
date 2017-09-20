package com.test.android_displaytaglog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

// Goal of this app (20 Sept 2017):
// To activate the Android logging - in 2016, this was possible with defining a TAG.
// Steps to activate logging:
// 1. select View > Tool Windows > Android Monitor
// 2. within Android Monitor, switch to logcat
// 3. above the logcat tab (still within the Android Monitor) there is a drop down menu:
// select the device you are actually monitoring
// 4. the log message should be displayed.

public class MainActivity extends AppCompatActivity {

    private static final String DEBUGTAG = "mytext";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.DEBUGTAG, "This is a test log message");
    }
}

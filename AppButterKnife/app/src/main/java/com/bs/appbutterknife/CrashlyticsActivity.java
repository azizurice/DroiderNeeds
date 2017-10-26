package com.bs.appbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crashlytics.android.Crashlytics;

import timber.log.Timber;

public class CrashlyticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Move this to where you establish a user session
        Timber.tag("LifeCycles");
        Timber.d("Activity Created");
        logUser();

        setContentView(R.layout.activity_crashlytics);
    }

    private void logUser() {
        // TODO: Use the current user's information
        // You can call any combination of these three methods
       // Crashlytics.setUserIdentifier("12345");
        Crashlytics.setUserEmail("azizur.ice@gmail.com");
        Crashlytics.setUserName("Azizur Rahman");
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }


}

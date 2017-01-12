package com.letscodes.apptwelve.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.letscodes.apptwelve.R;
import com.letscodes.apptwelve.com.letscodes.apptwelve.Home;

public class DisplayActivity extends AppCompatActivity {

    TextView mHomeId;
    TextView mStreetName;
    TextView mAddress;
    TextView mState;
    TextView mPostCode;
    TextView mCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        this.setTitle("Display Activity");
        mHomeId =(TextView)findViewById(R.id.homeId);
        mStreetName =(TextView)findViewById(R.id.streetName);
        mAddress =(TextView)findViewById(R.id.homeAddress);
        mState =(TextView)findViewById(R.id.homeState);
        mPostCode =(TextView)findViewById(R.id.homePostCode);
        mCountry =(TextView)findViewById(R.id.homeCountry);


        Intent receiveIntent=getIntent();
        Home theHome=receiveIntent.getParcelableExtra("home");


        mHomeId.setText(theHome.getHomeId());
        mStreetName.setText(theHome.getStreetName());
        mAddress.setText(theHome.getAddress());
        mState.setText(theHome.getState());
        mPostCode.setText(theHome.getPostCode());
        mCountry.setText(theHome.getCountry());

    }
}

package com.letscodes.apptwelve.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.letscodes.apptwelve.R;
import com.letscodes.apptwelve.com.letscodes.apptwelve.Home;

public class MainActivity extends AppCompatActivity {

    Button mSendButton;
    Home aHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("MainActivity");
        aHome=new Home("007","111 Street","World is not enough","BC","M5F BW3", "Canada");


        mSendButton=(Button)findViewById(R.id.buttonSend);
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendHomeInfo();
            }
        });


    }

    public void sendHomeInfo(){

        Intent sendIntent=new Intent(this, DisplayActivity.class);
        sendIntent.putExtra("home",aHome);
        startActivity(sendIntent);
    }
}

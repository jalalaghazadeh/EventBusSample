package com.mrjalal.eventbussample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.sender_container, new SenderFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.receiver_container, new ReceiverFragment()).commit();
    }
}

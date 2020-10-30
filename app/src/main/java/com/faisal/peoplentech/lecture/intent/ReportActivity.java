package com.faisal.peoplentech.lecture.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        Intent receiverIntent = getIntent();
        String firstName = receiverIntent.getStringExtra("fNameKey");
        String lastName = receiverIntent.getStringExtra("lNameKey");

        ((TextView)findViewById(R.id.tvFirstName)).setText(firstName);
        ((TextView)findViewById(R.id.tvLastName)).setText(lastName);
    }
}

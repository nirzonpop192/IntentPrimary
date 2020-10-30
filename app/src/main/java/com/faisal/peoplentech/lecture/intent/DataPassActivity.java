package com.faisal.peoplentech.lecture.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DataPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pass);

        findViewById(R.id.btnPass).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName= ((EditText)findViewById(R.id.edtFirstName)).getText().toString();
                String lastName= ((EditText)findViewById(R.id.edtLastName)).getText().toString();

                Intent intent= new Intent(DataPassActivity.this,ReportActivity.class);
                intent.putExtra("fNameKey",firstName);
                intent.putExtra("lNameKey",lastName);
                startActivity(intent);
            }
        });
    }
}

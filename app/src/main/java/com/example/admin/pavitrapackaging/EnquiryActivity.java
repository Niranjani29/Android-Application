package com.example.admin.pavitrapackaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnquiryActivity extends AppCompatActivity {
String phone,phone1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enquiry);

        final EditText et1= (EditText) findViewById(R.id.et1);
        phone = et1.getText().toString();
        if (phone.length() != 10) {
            et1.setError("Please enter valid phone no");

        }

        final Button bt1= (Button) findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                    Toast.makeText(EnquiryActivity.this,"We Will Contact You Within An Hour.",Toast.LENGTH_SHORT).show();

            }
        });



    }
}

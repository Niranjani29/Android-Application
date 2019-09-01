package com.example.admin.pavitrapackaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class OthersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        final Button btQuotation = (Button)findViewById(R.id.btQuotation);
        btQuotation.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OthersActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}

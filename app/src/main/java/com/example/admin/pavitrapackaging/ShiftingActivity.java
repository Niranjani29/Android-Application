package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class ShiftingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shifting);

        final Button bt1=(Button) findViewById(R.id.bt1);
        final Button bt2=(Button) findViewById(R.id.bt2);
        final Button bt3=(Button) findViewById(R.id.btPaintings);

        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent=new Intent(ShiftingActivity.this,House_Activity.class);
                                       startActivity(intent);
                                   }
                               }


        );
        bt2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent=new Intent(ShiftingActivity.this,OfficeActivity.class);
                                       startActivity(intent);
                                   }
                               }


        );
        bt3.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent intent=new Intent(ShiftingActivity.this,OthersActivity.class);
                                       startActivity(intent);
                                   }
                               }


        );

    }
}


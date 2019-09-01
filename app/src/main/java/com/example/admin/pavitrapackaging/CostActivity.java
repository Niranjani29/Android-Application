package com.example.admin.pavitrapackaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost);
        final TextView tvCost=(TextView) findViewById(R.id.tvCost);
        Button btConfirm=(Button)findViewById(R.id.btConfirm);
        Button btGet=(Button)findViewById(R.id.btGet);
        btGet.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         tvCost.setText("Cost Is : 4000-6000");
                                     }
                                 }
        );


        btConfirm.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {

                                             Intent intent=new Intent(CostActivity.this,LoginActivity.class);
                                             startActivity(intent);
                                         }
                                     }
        );


    }
}

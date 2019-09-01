package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FlatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat);

        final TextView tv=(TextView)findViewById(R.id.tv);
        final TextView tv1=(TextView)findViewById(R.id.tv1);
        final Button bt1=(Button)findViewById(R.id.bt1);
        final Button bt2=(Button)findViewById(R.id.bt2);
        final Button bt3=(Button)findViewById(R.id.btPaintings);
        final Button bt4=(Button)findViewById(R.id.bt4);
        final Button btDone=(Button)findViewById(R.id.btDone);

        bt1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       tv1.setText("Cost Is :4000");
                                   }
                               }
        );
        bt2.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       tv1.setText("Cost Is :6000");
                                   }
                               }
        );
        bt3.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       tv1.setText("Cost Is :8000");
                                   }
                               }
        );
        bt4.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       tv1.setText("Cost Is :10000 Or More");
                                   }
                               }
        );

        btDone.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {

                                          Intent intent=new Intent(FlatActivity.this,DateTimeActivity.class);
                                          startActivity(intent);
                                      }
                                  }
        );



    }
}

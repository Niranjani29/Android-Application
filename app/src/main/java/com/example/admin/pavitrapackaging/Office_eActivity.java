package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Office_eActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_e);

        final Button bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_eActivity.this,"TV Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_eActivity.this,"Computer Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt3=(Button)findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_eActivity.this,"Printer Is Selected",Toast.LENGTH_SHORT).show();
            }
        });        final Button bt4=(Button)findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_eActivity.this,"Server Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt5=(Button)findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_eActivity.this,"Table Fan Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt6=(Button)findViewById(R.id.bt6);
        bt6.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_eActivity.this,"Electronics Is Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

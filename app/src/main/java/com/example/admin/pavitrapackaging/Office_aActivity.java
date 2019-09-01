package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Office_aActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_a);

        final Button bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_aActivity.this,"Mirror Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_aActivity.this,"Frame Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt3=(Button)findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_aActivity.this,"Painting Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt4=(Button)findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_aActivity.this,"Books Are Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button bt5=(Button)findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(Office_aActivity.this,"Accessories Is Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

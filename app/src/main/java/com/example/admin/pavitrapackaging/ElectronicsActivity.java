package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ElectronicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);

        final Button btTv=(Button)findViewById(R.id.btTv);
        btTv.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"TV Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btFridge=(Button)findViewById(R.id.btFridge);
        btFridge.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"Fridge Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btWash=(Button)findViewById(R.id.btWash);
        btWash.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"Washing Machine Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btComp=(Button)findViewById(R.id.btComp);
        btComp.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"Computer Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btAC=(Button)findViewById(R.id.btAC);
        btAC.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"AC Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btMusic=(Button)findViewById(R.id.btMusic);
        btMusic.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"Music System Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btDone=(Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(ElectronicsActivity.this,"Electronics Is Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

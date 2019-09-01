package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FurnitureActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);

        final Button btSofa=(Button)findViewById(R.id.btSofa);
        btSofa.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {


                Toast.makeText(FurnitureActivity.this,"Sofa Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btBed=(Button)findViewById(R.id.btBed);
        btBed.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Bed Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btDinning=(Button)findViewById(R.id.btDinning);
        btDinning.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Dinning Table Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btShowcase=(Button)findViewById(R.id.btShowcase);
        btShowcase.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Showcase Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btTable=(Button)findViewById(R.id.btTable);
        btTable.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Table Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btChair=(Button)findViewById(R.id.btChair);
        btChair.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Chair Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btShoerack=(Button)findViewById(R.id.btShoerack);
        btShoerack.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Shoes Are Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btDone=(Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {

                Toast.makeText(FurnitureActivity.this,"Furniture Is Done",Toast.LENGTH_SHORT).show();
            }
        });
        final TextView tv1=(TextView)findViewById(R.id.tv1);



    }
}

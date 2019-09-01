package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AccessoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories);
        final Button btFlower=(Button)findViewById(R.id.btFlower);
        btFlower.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(AccessoriesActivity.this,"FlowerPot Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btPainting=(Button)findViewById(R.id.btPainting);
        btPainting.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(AccessoriesActivity.this,"Painting Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btClothes=(Button)findViewById(R.id.btClothes);
        btClothes.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(AccessoriesActivity.this,"Clothes Are Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btBedding=(Button)findViewById(R.id.btBedding);
        btBedding.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(AccessoriesActivity.this,"Bedding Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btMat=(Button)findViewById(R.id.btMat);
        btMat.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(AccessoriesActivity.this,"Mattress Is Selected",Toast.LENGTH_SHORT).show();
            }
        });

        final Button btDone=(Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(AccessoriesActivity.this,"Accessories Is Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

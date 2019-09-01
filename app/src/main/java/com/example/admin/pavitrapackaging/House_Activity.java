package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class House_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_);
        init();
        init1();
        init2();init3();init4();init5();

    }
    public void  init() {
        final Button btFurniture = (Button)findViewById(R.id.btFurniture);
        btFurniture.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(House_Activity.this,FurnitureActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init1() {
        final Button btElectronics = (Button)findViewById(R.id.btElectronics);
        btElectronics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(House_Activity.this, ElectronicsActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init2(){
        final Button btKitchen = (Button)findViewById(R.id.btKitchen);
        btKitchen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(House_Activity.this, KitchenActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init3() {
        final  Button btAccessories = (Button)findViewById(R.id.btAccessories);
        btAccessories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(House_Activity.this, AccessoriesActivity.class);
                startActivity(intent);
            }
        });

    }
    public void  init4() {
        final  Button btMiscellaneous = (Button)findViewById(R.id.btMiscellaneous);
        btMiscellaneous.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(House_Activity.this, MiscellaneousActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init5() {
        final  Button btDone = (Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(House_Activity.this,FlatActivity.class);
                startActivity(intent);
            }
        });


    }
}

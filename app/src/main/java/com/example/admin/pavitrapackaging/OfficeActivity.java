package com.example.admin.pavitrapackaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OfficeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        init();
        init1();
        init2();
        init3();

    }
    public void  init() {
        final Button btFurniture = (Button)findViewById(R.id.btFurniture);
        btFurniture.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OfficeActivity.this, Office_fActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init1() {
        final Button btAccessories = (Button)findViewById(R.id.btAccessories);
        btAccessories.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OfficeActivity.this, Office_aActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init2() {
        final Button btElectronics = (Button)findViewById(R.id.btElectronics);
        btElectronics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OfficeActivity.this, Office_eActivity.class);
                startActivity(intent);
            }
        });
    }
    public void  init3() {
        final Button btDone = (Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OfficeActivity.this, DateTime1Activity.class);
                startActivity(intent);
            }
        });

    }
}

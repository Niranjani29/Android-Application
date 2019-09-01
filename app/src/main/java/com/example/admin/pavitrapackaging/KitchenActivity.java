package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class KitchenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        final Button btUtensils=(Button)findViewById(R.id.btUtensils);
        btUtensils.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(KitchenActivity.this,"Utensils Are Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btGas=(Button)findViewById(R.id.btGas);
        btGas.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(KitchenActivity.this,"Gas Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btKitchen=(Button)findViewById(R.id.btKitchen);
        btKitchen.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(KitchenActivity.this,"Kitchen Rack Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btMicroWave=(Button)findViewById(R.id.btMicrowave);
        btMicroWave.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(KitchenActivity.this,"Microwave Is Selected",Toast.LENGTH_SHORT).show();
            }
        });


        final Button btDone=(Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(KitchenActivity.this,"Kitchen Is Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

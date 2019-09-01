package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MiscellaneousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous);

        final Button btBooks=(Button)findViewById(R.id.btBooks);
        btBooks.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(MiscellaneousActivity.this,"Books Are Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btSewing=(Button)findViewById(R.id.btSewing);
        btSewing.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(MiscellaneousActivity.this,"Sewing Machine Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btAquarium=(Button)findViewById(R.id.btAquarium);
        btAquarium.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(MiscellaneousActivity.this,"Aquarium Is Selected",Toast.LENGTH_SHORT).show();
            }
        });
        final Button btBags=(Button)findViewById(R.id.btBags);
        btBags.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(MiscellaneousActivity.this,"Bags Are Selected",Toast.LENGTH_SHORT).show();
            }
        });

        final Button btDone=(Button)findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Toast.makeText(MiscellaneousActivity.this,"Miscellaneous Is Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

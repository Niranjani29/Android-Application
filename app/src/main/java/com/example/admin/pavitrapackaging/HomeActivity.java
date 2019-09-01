package com.example.admin.pavitrapackaging;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class HomeActivity extends AppCompatActivity {
    private DrawerLayout d1;
    private ActionBarDrawerToggle abdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        d1=(DrawerLayout)findViewById(R.id.d1);
        abdt = new ActionBarDrawerToggle(this,d1,R.string.Open,R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        d1.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.homeus)
                {
                    Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
                    startActivity(intent);

                }

                else if(id ==R.id.contactus )
                {
                    Log.i("Call","");
                    //  Toast.makeText(HomeActivity.this,"ContactUs",Toast.LENGTH_SHORT).show();
                    //https://goo.gl/forms/00ix5C9yQnpKRoEc2
                    Intent emailIntent = new Intent(Intent.ACTION_DIAL);
                    emailIntent.setData(Uri.parse("tel:7743996388"));

                    startActivity(Intent.createChooser(emailIntent,"Call"));

                }

                else if(id ==R.id.findus )
                {

                    Intent intent = new Intent(HomeActivity.this,MapsActivity.class);
                    startActivity(intent);
                }

                else if(id ==R.id.feedback )
                {

                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://drive.google.com/open?id=1y-Es11ryrfqrvle02VwOR2V3Wwn3GaVHbCPJ3rw77f8"));

                    startActivity(intent);
                }

                return true;
            }

        });

        init();
        init1();
        init2();

      /*  btShift.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ShiftingActivity.class);
                startActivity(intent);
            }
        });

       */


    }

    public boolean onOptionsItemSelected(MenuItem item){
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
    public void init()
    {

        final Button btAboutUs = (Button)findViewById(R.id.btAboutUs);
        btAboutUs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,AboutUs_Activity.class);
                startActivity(intent);
            }
        });
    }

    public void init1()
    {

        final Button btAboutUs = (Button)findViewById(R.id.btShift);
        btAboutUs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ShiftingActivity.class);
                startActivity(intent);
            }
        });



    }
    public void init2()
    {

        final Button btEnquiry = (Button)findViewById(R.id.btEnquiry);
        btEnquiry.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,EnquiryActivity.class);
                startActivity(intent);
            }
        });



    }
}

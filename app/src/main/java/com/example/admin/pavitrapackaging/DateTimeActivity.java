package com.example.admin.pavitrapackaging;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;


public class DateTimeActivity extends AppCompatActivity implements View.OnClickListener {


    Button btDate1;
    Button btTime1;
    EditText etDate;
    EditText etTime;
    EditText etSaddress;
    EditText etDaddress;
    EditText etNo;
    private int dd,mm,yy,hr,min;
    @RequiresApi(api = Build.VERSION_CODES.N)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        btDate1= (Button) findViewById(R.id.btDate);
        btTime1= (Button) findViewById(R.id.btTIME);

        etDate=(EditText)findViewById(R.id.etDate);
        etTime=(EditText)findViewById(R.id.etTime);


        btDate1.setOnClickListener((View.OnClickListener) this);
        btTime1.setOnClickListener((View.OnClickListener) this);

        etSaddress=(EditText)findViewById(R.id.etSaddress);
        etDaddress=(EditText)findViewById(R.id.etDaddress);
        etNo=(EditText)findViewById(R.id.etNo);

        init();
    }
    public void init() {
        final Button btGet=(Button)findViewById(R.id.btQuotation);
        btGet.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                Intent intent = new Intent(DateTimeActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)

    public void onClick(View view) {
        if (view==btDate1)
        {
            final  Calendar calendar=Calendar.getInstance();
            dd= calendar.get(Calendar.DAY_OF_MONTH);
            mm= calendar.get(Calendar.MONTH);
            yy= calendar.get(Calendar.YEAR);
            DatePickerDialog datePickerDialog=new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener(){

                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    etDate.setText(i2+"/"+(i1+1)+"/"+i);
                }
            },dd,mm,yy
            );
            datePickerDialog.show();
        }
        if (view==btTime1)
        {
            final  Calendar calendar=Calendar.getInstance();
            hr= calendar.get(Calendar.HOUR_OF_DAY);
            min= calendar.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    etTime.setText(i+":"+i1);
                }
            },hr,min,false);
            timePickerDialog.show();
        }

    }
}

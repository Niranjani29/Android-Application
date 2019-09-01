package com.example.admin.pavitrapackaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    EditText et_name, et_email, et_password, et_phone, et_cpassword;
    String name, email, phone, password, cpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_name = (EditText) findViewById(R.id.name);
        et_email = (EditText) findViewById(R.id.email);
        et_phone = (EditText) findViewById(R.id.phone);
        et_password = (EditText) findViewById(R.id.password);
        et_cpassword = (EditText) findViewById(R.id.cpassword);

        final Button btDone=(Button) findViewById(R.id.btDone);
        btDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(RegisterActivity.this,"Now We Will Contact You.",Toast.LENGTH_SHORT).show();
            }
        });

    }



    public void userReg(View view) {

        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        phone = et_phone.getText().toString().trim();
        password = et_password.getText().toString().trim();
        cpassword = et_cpassword.getText().toString().trim();

        if (!validate()) {
            Toast.makeText(this, "Signup has failed", Toast.LENGTH_SHORT).show();
        } else {
            onSignupSuccess();
        }

    }

    public void onSignupSuccess() {



        String method = "register";

        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, name, email, password, cpassword, phone);
        finish();
        Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();


    }

    public boolean validate()
    {
        boolean valid=true;
        if(name.isEmpty()||name.length()>32)
        {
            et_name.setError("Please enter name");
            valid=false;
        }
        if(email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            et_email.setError("Please enter valid email address");
            valid=false;
        }

        if(password.isEmpty()){
            et_password.setError("Please enter password");
            valid=false;
        }

        if(cpassword.isEmpty()){
            et_cpassword.setError("Please enter password");
            valid=false;
        }

        if(!password.equals(cpassword))
        {
            et_cpassword.setError("Passwords do not match");
            valid=false;
        }



        if(phone.isEmpty()){
            et_phone.setError("Please enter phone no");
            valid=false;
        }


        if(phone.length()!=10)
        {
            et_phone.setError("Please enter valid phone no");
            valid=false;
        }


        return valid;
    }

}

package com.example.admin.pavitrapackaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {


    EditText ET_NAME,ET_PASS;
    String login_pass;
    public static String login_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ET_NAME=(EditText)findViewById(R.id.user_name);
        ET_PASS=(EditText)findViewById(R.id.user_pass);


    }

    public void userReg(View view)
    {
        startActivity(new Intent(this,RegisterActivity.class));

    }

    public void userLogin(View view) {



        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();

        if (!validate()) {
            Toast.makeText(this, "Login has failed", Toast.LENGTH_SHORT).show();
        } else {
            onSignupSuccess();
        }



    }

    public void onSignupSuccess()
    {


        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, login_name, login_pass);

        nextact();


    }


    public boolean validate() {
        boolean valid = true;

        if (login_name.isEmpty() && login_pass.isEmpty()) {
            ET_NAME.setError("Please enter email");
            ET_PASS.setError("Please enter password");
            valid = false;

        } else if (login_name.isEmpty()) {

            ET_NAME.setError("Please enter email");
            valid = false;
        } else if (login_pass.isEmpty()) {
            ET_PASS.setError("Please enter password");
            valid = false;

        }

        return valid;

    }

    public void nextact()
    {
        if(BackgroundTask.r==false)
        {
           Toast.makeText(LoginActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();

            BackgroundTask.r=false;
        }
        else
        {
            Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
        }

    }



}

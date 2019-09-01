package com.example.admin.pavitrapackaging;

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.content.Context;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Admin on 9/14/2017.
 */

public class BackgroundTask extends AsyncTask<String,Void,String> {


    AlertDialog alertDialog;


    public static boolean r = false;

    Context ctx;

    BackgroundTask(Context ctx) {
        this.ctx = ctx;
    }


    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(ctx).create();
        alertDialog.setTitle("Login information......");
    }

    @Override
    protected String doInBackground(String... params) {

        String reg_url = "http://192.168.43.226/webapp/register.php";
        String login_url = "http://192.168.43.226/webapp/login.php";
        String method = params[0];
        if (method.equals("register")) {
            String name = params[1];
            String email = params[2];
            String password = params[3];
            String cpassword = params[4];
            String phone = params[5];
            try {
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS, "UTF-8"));
                String data = URLEncoder.encode("name", "UTF-8") + "=" + URLEncoder.encode(name, "UTF-8") + "&"
                        + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(email, "UTF-8") + "&" +
                        URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8") + "&" +
                        URLEncoder.encode("cpassword", "UTF-8") + "=" + URLEncoder.encode(cpassword, "UTF-8") + "&"
                        + URLEncoder.encode("phone", "UTF-8") + "=" + URLEncoder.encode(phone, "UTF-8");

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();

                return "Registration success";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (method.equals("login")) {
            String login_name = params[1];
            String login_pass = params[2];


            try {
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String data = URLEncoder.encode("login_name", "UTF-8") + "=" + URLEncoder.encode(login_name, "UTF-8") + "&" + URLEncoder.encode("login_pass", "UTF-8") + "=" + URLEncoder.encode(login_pass, "UTF-8");

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                String response = "";
                String line = "";


                while ((line = bufferedReader.readLine()) != null) {
                    response += line;
                }

                if (response.equals("Login failed.Try again.")) {
                    r = false;

                }


                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return response;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ProtocolException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }return "Login successful";
    }




    protected void onProgressUpdate(Void...values)
    {
        super.onProgressUpdate(values);
    }

    protected boolean onPostExecute()
    {
        r=false;

        if(doInBackground()=="Registration success...")
        {

            Toast.makeText(ctx,"Registration Success ...",Toast.LENGTH_LONG).show();
        }

        else if (doInBackground()=="Login failed.Try again.")
        {
            r=false;
            alertDialog.setMessage("Login failed.Try again.");
            alertDialog.show();

        }

        else if(doInBackground()=="Login successful")
        {
            r=true;
        }
    return r;
    }

}
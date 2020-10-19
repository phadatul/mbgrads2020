package com.hsbc.restapicall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        email = findViewById(R.id.txtEmail);
        password = findViewById(R.id.txtPassword);
    }

    public void btnClick(View v) {
        MyTask m = new MyTask();
        m.execute("");
    }

    public void postButton(View v) {
        MyPostTask post = new MyPostTask();
        post.execute("");
    }

    public void loginButton(View v) {
        MyLoginTask login = new MyLoginTask();
        login.execute("");
    }

    class MyTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            Log.e("TEST MSG", "TEST MESSAGE");
            HttpURLConnection con = null;
            URL url;
            String temp = "";
            String response = "";
            String responseData = "";
            try {

                url = new URL("https://jsonplaceholder.typicode.com/users");
                con = (HttpURLConnection) url.openConnection();  //THIS WILL OPEN URL CONNECTION

                response = con.getResponseCode() + " " + con.getResponseMessage();
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((responseData = br.readLine()) != null) {
                    temp = temp + responseData;

                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                con.disconnect();
            }
            return temp;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            String data = "";
            try {
                JSONArray arr = new JSONArray(s);

                for (int i = 0; i < arr.length(); i++) {
                    JSONObject user = arr.getJSONObject(i);
                    data = data + user.getString("name") + "-" + user.getString("phone") + "\n";
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

            tv.setText(data);

        }
    }

    class MyPostTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection con = null;
            URL url = null;
            JSONObject obj = null;
            String temp = "", response = "", responseData = "";

            try {
                url = new URL("https://reqres.in/api/register");

                obj = new JSONObject();
                obj.put("email", email.getText().toString());
                obj.put("password", password.getText().toString());

                con = (HttpURLConnection) url.openConnection();
                con.setConnectTimeout(5000);
                con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                con.setDoOutput(true);
                con.setDoInput(true);
                con.setRequestMethod("POST");
                con.getOutputStream().write(obj.toString().getBytes());
                con.getOutputStream().close();


                response = con.getResponseCode() + " " + con.getResponseMessage();

                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((responseData = br.readLine()) != null) {
                    temp = temp + responseData;

                }


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return response + "#" + temp;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
        }
    }

    class MyLoginTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            Log.e("Hello","WE ARE IN THREAD");
            HttpURLConnection con = null;
            URL url = null;
            JSONObject obj = null;
            String temp = "", response = "", responseData = "";

            try {
                url = new URL("https://reqres.in/api/login");

                obj = new JSONObject();
                obj.put("email", email.getText().toString());
                obj.put("password", password.getText().toString());
                Log.e("DATA", obj.toString());

                con = (HttpURLConnection) url.openConnection();
                con.setConnectTimeout(5000);
                con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                con.setDoOutput(true);
                con.setDoInput(true);
                con.setRequestMethod("POST");
                con.getOutputStream().write(obj.toString().getBytes());
                con.getOutputStream().close();


                response = con.getResponseCode() + " " + con.getResponseMessage();

                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((responseData = br.readLine()) != null) {
                    temp = temp + responseData;

                }


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return response + "#" + temp;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
        }
    }
}
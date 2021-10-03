package com.example.esfumado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarMedicion(View view){
        Context contexto = this;
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {
                    FetchURL check = new FetchURL(contexto);
                    try {
                        String s = check.doInBackground("http://192.168.0.164:8080/medicion/","POST");
                        //Toast toast = Toast.makeText(contexto, s, Toast.LENGTH_SHORT);
                        //toast.show();
                        Log.d("post",s);
                        Log.d("post","funciona");

                    }catch (Exception e){
                        Log.d("",e.toString());
                    }
                    //Your code goes here
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
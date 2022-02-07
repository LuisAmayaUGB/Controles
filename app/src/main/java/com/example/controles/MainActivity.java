package com.example.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button Ace;
     MediaPlayer sonido;
private CheckBox uvas, peras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uvas=(CheckBox) findViewById(R.id.chkUvas);
        peras=(CheckBox)findViewById(R.id.chkPeras);


   Ace=(Button) findViewById(R.id.btnAceptar);

   sonido=MediaPlayer.create(getApplicationContext(),R.raw.himno_ugb);





Ace.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

   if(uvas.isChecked()==true){

       Toast.makeText(getApplicationContext(),"Te gutan las uvas", Toast.LENGTH_LONG).show();
   }


    }
});






    }






    public static int getRandomNumber(int min, int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }




}
package com.example.bloodpressurefingerfrank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class FingerPrint extends AppCompatActivity {


    ImageView imgfingerprint;
    RelativeLayout scanner;
    RelativeLayout scanner2;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingerprint);



        scanner = findViewById(R.id.scanner);
        handler = new Handler();
        scanner2 = findViewById(R.id.scanner2);
       imgfingerprint = findViewById(R.id.imgfingerprint);

       imgfingerprint.setOnLongClickListener(new View.OnLongClickListener() {

           @Override
           public boolean onLongClick(View view) {

               if(imgfingerprint==imgfingerprint){

                   Vibrator vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                   vb.vibrate(2000);

                   final Animation animation = AnimationUtils.loadAnimation(FingerPrint.this, R.anim.animationxml);

                   animation.setAnimationListener(new Animation.AnimationListener() {

                       @Override
                       public void onAnimationStart(Animation animation) {}

                       @Override
                       public void onAnimationEnd(Animation animation) {
                           imgfingerprint.setVisibility(View.GONE);
                       }

                       @Override
                       public void onAnimationRepeat(Animation animation) {}
                   });

                   imgfingerprint.setVisibility(View.VISIBLE);
                   imgfingerprint.startAnimation(animation);


                   handler.postDelayed(new Runnable() {
                       @Override
                       public void run() {

                           startActivity(new Intent(FingerPrint.this,BloodPressureResult.class));
                           finish();


                       }
                   },2500);

               }

            return false;
           }
       });


           }


       }

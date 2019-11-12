package com.example.bloodpressurefingerfrank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class BloodPressureResult extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_pressure_result);




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this,FingerPrint.class));
        finish();

    }
}

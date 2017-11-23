package com.example.ramdanix.projectpertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        hello = findViewById(R.id.tv_hello);


        /*Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        String username = bundle.getString("KEY_USERNAME");

        Log.d("RESULT", "data username : "+username);*/


        Intent i = this.getIntent();

        Siswa mySiswa = i.getParcelableExtra("KEY_USERNAME");

        String namaSiswa = mySiswa.getNama();




        hello.setText(namaSiswa);




    }
}

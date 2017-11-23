package com.example.ramdanix.projectpertama;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView tvUsername;

    private EditText edUsername;
    private EditText edPassword;
    private Button btnLogin;

    Context context = this;

    private boolean statusLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsername = findViewById(R.id.tv_username);
        tvUsername.setText("Sirojudin");

        edUsername = findViewById(R.id.ed_username);
        edPassword = findViewById(R.id.ed_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getUsername = edUsername.getText().toString();
                String getPassword = edPassword.getText().toString();

                if (getUsername.equals("admin") && getPassword.equals("adminaja")){
                    statusLogin = true;
                    peringatan("selamat anda berhasil login","Sukses","next");

                }else {
                    statusLogin = false;
                    peringatan("maaf username dan password salah","Gagal","close");

                }
            }
        });

    }

    public void pesan(String pesan){
        Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
    }

    public void peringatan(String pesan, String title, String pesanBtn){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);

        builder.setMessage(pesan)
                .setCancelable(true)
                .setPositiveButton(pesanBtn, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(statusLogin){

                            Siswa newSiswa = new Siswa();
                            newSiswa.setNama("Rizki");


                            Intent intent = new Intent(context, WelcomeActivity.class);
                            intent.putExtra("KEY_USERNAME",newSiswa);

                            startActivity(intent);
                        }
                    }
                });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}

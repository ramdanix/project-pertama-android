package com.example.ramdanix.projectpertama;

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

                if (getUsername.equals("bucin") && getPassword.equals("123456")){
                    pesan("berhasil");
                }else {
                    pesan("gagal");
                }
            }
        });

    }

    public void pesan(String pesan){
        Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
    }
}

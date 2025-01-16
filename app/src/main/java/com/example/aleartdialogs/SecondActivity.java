package com.example.aleartdialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btnLogoutDialog, btnYes, btnNo;
    TextView txtView1, txtView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_second);
        initViews();
        initListeners();
    }

    private void initViews(){
        btnLogoutDialog = findViewById(R.id.btnLogoutDialog);
    }

    private void initListeners(){
        btnLogoutDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog logoutDialog = new Dialog(SecondActivity.this);
                logoutDialog.setTitle("Logout Dialog");
                logoutDialog.setContentView(R.layout.logout_activity);
                txtView1 = findViewById(R.id.txtView1);
                txtView2 = findViewById(R.id.txtView2);
                btnYes = findViewById(R.id.btnYes);
                btnNo = findViewById(R.id.btnNo);
                logoutDialog.show();
            }
        });
    }
}

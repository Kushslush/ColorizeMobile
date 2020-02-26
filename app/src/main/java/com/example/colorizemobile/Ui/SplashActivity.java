package com.example.colorizemobile.Ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.colorizemobile.App;
import com.example.colorizemobile.R;
import com.example.colorizemobile.Utils.NetworkUtil;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DELAY = 600;
    private ProgressBar progressBar;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.splash_text_view);
        new Handler().postDelayed(() -> checkConnection(), SPLASH_DELAY);
    }

    private void checkConnection(){
        progressBar.setVisibility(ProgressBar.VISIBLE);
        textView.setVisibility(TextView.VISIBLE);
        Boolean check = NetworkUtil.getConnectivityStatusString(this);
        if(check !=null && check == true){
            openLoginScreen();
        }
        else{
            progressBar.setVisibility(ProgressBar.INVISIBLE);
            textView.setVisibility(TextView.INVISIBLE);
            showAlertDialog();
        }
    }

    private void openLoginScreen() {
        Intent i = new Intent(SplashActivity.this,
                LoginActivity.class);
        startActivity(i);
        finish();
    }

    private void showAlertDialog(){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Нет доступа к интернету.");
        builder1.setCancelable(true);
        builder1.setPositiveButton(
                "Повторить попытку",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        checkConnection();
                    }
                });
        builder1.setNegativeButton(
                "Закрыть",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        finish();
                    }
                });
        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}

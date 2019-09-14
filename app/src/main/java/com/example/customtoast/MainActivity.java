package com.example.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShowToast;
    TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowToast = findViewById(R.id.btnShowToast);
        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createCustomToastMethod(btnShowToast.getText().toString());
            }
        });
    }

    private void createCustomToastMethod(String btnName) {
        LayoutInflater layoutInflater = getLayoutInflater();
        View layoutView = layoutInflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.custom_layout));
//        txtMessage= layoutView.findViewById(R.id.txtToastMessage);
//        txtMessage.setText(btnName);
        Toast customToast = new Toast(MainActivity.this);
        //position of CustomToast
        customToast.setGravity(Gravity.CENTER, 0, 0);
        customToast.setDuration(Toast.LENGTH_SHORT);
        customToast.setView(layoutView);
        customToast.show();
    }
}

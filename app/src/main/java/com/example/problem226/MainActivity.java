package com.example.problem226;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button (View view){
        TextView email = findViewById(R.id.email);
        TextView disp = findViewById(R.id.display);

        if (email.getText().toString().contains("@")){
            disp.setText("VALID");
        } else{
            disp.setText("INVALID");
        }

    }
}
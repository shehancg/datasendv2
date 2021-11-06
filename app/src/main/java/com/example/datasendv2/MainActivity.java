package com.example.datasendv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText phno,bot,bat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phno = (EditText) findViewById( R.id.phoneno);
        bot = (EditText) findViewById(R.id.bottles);
        bat = (EditText) findViewById(R.id.battery);
    }

    public void loginBtn(View view) {
        String phoneN = phno.getText().toString();
        String bottel = bot.getText().toString();
        String battery = bat.getText().toString();

        background bg = new background(this);
        bg.execute(phoneN,bottel,battery);
    }
}
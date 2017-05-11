package com.acme.csci3130;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.helloText);
        textView.setText(message);
    }
}

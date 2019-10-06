package com.example.android.greeter;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.greeter.R;

public class MainActivity extends AppCompatActivity {
    private TextView GreeterView;
    private EditText NameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GreeterView = findViewById(R.id.textView);
        NameEditText = findViewById(R.id.editText);
    }

    public void Pressed(View view) {
        if (NameEditText.getText().length() == 0) {
            GreeterView.setText("The name wasn't entered");
        } else {

            GreeterView.setText("Hi, how are you "+ NameEditText.getText());

        }

    }
}



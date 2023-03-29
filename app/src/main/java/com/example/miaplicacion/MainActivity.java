package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText text1;
    private EditText text2;
    private TextView View1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText)findViewById(R.id.editTextText1);
        text2 = (EditText)findViewById(R.id.editTextText2);
        View1 = (TextView)findViewById(R.id.textView2);
    }

    public void Result(View view){
        String string1 = text1.getText().toString();
        String string2 = text2.getText().toString();

        String result = string1 + " " + string2;
        View1.setText(result);
    }
}
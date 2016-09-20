package com.example.jerry.morse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConverterActivity extends AppCompatActivity {

    private Button convert;
    private Button reset;
    private EditText editText1;
    private EditText editText2;
    private TextView textViewShow1;
    private TextView textViewShow2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        textViewShow1 = (TextView) findViewById(R.id.textViewShow1);
        textViewShow2 = (TextView) findViewById(R.id.textViewShow2);

        convert = (Button) findViewById(R.id.button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                asciiToMorse converter1 = new asciiToMorse();
                morseToAscii converter2 = new morseToAscii();
                textViewShow1.setText(converter1.asciiToMorse(editText1.getText().toString()));
                textViewShow2.setText(converter2.morseToAscii(editText2.getText().toString()));
            }
        });

        reset = (Button) findViewById(R.id.button2);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText2.setText("");
            }
        });
    }
}

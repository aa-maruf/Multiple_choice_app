package com.example.multiple_choice_quiz_3;

//package com.example.multiplechoice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Questiontxt;
    private TextView Answertxt;

    private TextView notify;
    private CheckBox op1;
    private CheckBox op2;
    private CheckBox op3;
    private Button GiveAns;
    private String ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Questiontxt = (TextView) findViewById(R.id.text2);
        Answertxt = (TextView) findViewById(R.id.text3);
        op1 = (CheckBox) findViewById(R.id.checkbox1);
        op2 = (CheckBox) findViewById(R.id.checkbox2);
        op3 = (CheckBox) findViewById(R.id.checkbox3);
        GiveAns = (Button) findViewById(R.id.button);
        notify = (TextView) findViewById(R.id.text4);



        GiveAns.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView exampleTxt1 = findViewById(R.id.text3);
                Color text4 = null;
                exampleTxt1.setTextColor(text4.parseColor("#FFFFFF"));

                if((op1.isChecked() && op2.isChecked()) || (op2.isChecked() && op3.isChecked()) || (op3.isChecked() && op1.isChecked())){
                    Answertxt.setText("Hello");
                    notify.setText("Please Select One Option At a time");
                }
                else if(op1.isChecked() != true && op2.isChecked()!= true && op3.isChecked()!= true){
                    Answertxt.setText("Hello");
                    notify.setText("Please Select One option");
                }
                else{
                    notify.setText("");
                    if(op1.isChecked() || op2.isChecked() ){
                        Answertxt.setText("Wrong Answer");

                        TextView exampleTxt = findViewById(R.id.text3);
                        Color text3 = null;
                        exampleTxt.setTextColor(text3.parseColor("#FF0000"));

                    }
                    if(op3.isChecked()){
                        Answertxt.setText("Correct Answer");

                        TextView exampleTxt = findViewById(R.id.text3);
                        Color text3 = null;
                        exampleTxt.setTextColor(text3.parseColor("#00FF00"));
                    }
                }
            }
        });


    }
}
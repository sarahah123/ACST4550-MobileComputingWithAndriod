package com.example.shansber.simplephonepad;

/*
 * Course: ACST 4550
 * Section: .....
 * Name: ......
 * Professor:       Shaw
 * Assignment #: Lab 6
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PhonePadActivity extends AppCompatActivity {


    public final int DONE = 0;        // The value of the plus operator
    public final int PLUS = 1;        // The value of the plus operator
    public final int MINUS = 2;       // The value of the minus operator
    public final int MULTIPLY = 3;    // The value of the multiply operator
    public final int DIVIDE = 4;      // The value of the divide operator

    private static TextView outputTxt = null;
    private static Button button1 = null;
    private static Button button2 = null;
    private static Button button3 = null;
    private static Button button4 = null;
    private static Button button5 = null;
    private static Button button6 = null;
    private static Button button7 = null;
    private static Button button8 = null;
    private static Button button9 = null;
    private static Button button0 = null;
    private static Button buttonPlus = null;
    private static Button buttonMinus = null;
    private static Button buttonDivide = null;
    private static Button buttonMultiply = null;
    private static Button buttonEquals = null;
    private static Button buttonClear = null;

    private double input1, input2, input3;
    private int operator = 0;
    private boolean didOp = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_pad);

        outputTxt = (TextView) findViewById(R.id.txtOutput);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr1));
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr2));
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr3));
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr4));
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr5));
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr6));
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr7));
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr8));
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr9));
            }
        });

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addToOutput(getString(R.string.btnStr0));
            }
        });

        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                outputTxt.setText("");
                operator = DONE;
                didOp = false;
                input1 = 0;
            }
        });
    }

    private void addToOutput(String appendStr) {
        if (outputTxt.getText().length() == 3 || outputTxt.getText().length() == 7) {
            outputTxt.setText(outputTxt.getText() + "-");
        }
        else if(outputTxt.getText().length() == 12) {
            return;
        }

        outputTxt.setText(outputTxt.getText() + appendStr);
    }
}




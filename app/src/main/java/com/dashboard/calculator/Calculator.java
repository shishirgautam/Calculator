package com.dashboard.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    private Button button_1, button_2, button_3, button_plus, button_4, button_5, button_6, button_minus,
            button_7, button_8, button_9, button_divid, button_clear, button_0, button_equal, button_multiply;

    private EditText display;

    float fOne,fTwo;
    boolean bAdd, bSub, bMul, bDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.etText);

        button_1 = findViewById(R.id.btn_1);
        button_2 = findViewById(R.id.btn_2);
        button_3 = findViewById(R.id.btn_3);
        button_plus = findViewById(R.id.btn_plus);

        button_4 = findViewById(R.id.btn_4);
        button_5 = findViewById(R.id.btn_5);
        button_6 = findViewById(R.id.btn_6);
        button_minus = findViewById(R.id.btn_minus);

        button_7 = findViewById(R.id.btn_7);
        button_8 = findViewById(R.id.btn_8);
        button_9 = findViewById(R.id.btn_9);
        button_divid = findViewById(R.id.btn_divid);

        button_clear = findViewById(R.id.btn_clear);
        button_0 = findViewById(R.id.btn_0);
        button_equal = findViewById(R.id.btn_equal);
        button_multiply = findViewById(R.id.btn_multiply);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                } else {
                    fOne = Float.parseFloat(display.getText() + "");
                    bAdd = true;
                    display.setText(null);
                }
            }

        });


        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fOne = Float.parseFloat(display.getText() + "");
                bSub = true;
                display.setText(null);
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fOne = Float.parseFloat(display.getText() + "");
                bMul = true;
                display.setText(null);
            }
        });

        button_divid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fOne = Float.parseFloat(display.getText() + "");
                bDiv = true;
                display.setText(null);
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fTwo = Float.parseFloat(display.getText() + "");

                if (bAdd == true) {

                    display.setText(fOne + fTwo + "");
                    bAdd = false;
                }


                if (bSub == true) {
                    display.setText(fOne - fTwo + "");
                    bSub = false;
                }

                if (bMul == true) {
                    display.setText(fOne * fTwo + "");
                    bMul = false;
                }

                if (bDiv == true) {
                    display.setText(fOne / fTwo + "");
                    bDiv = false;
                }
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });
    }


}


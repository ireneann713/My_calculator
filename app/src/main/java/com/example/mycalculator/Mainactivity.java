package com.example.mycalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class Mainactivity extends AppCompatActivity {



    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonMul,
            buttonDivision, button10, buttonC, buttonEqual;
    EditText mycalEditText;

    float mValueOne, mValueTwo;

    boolean mycalAddition, mycalSubtract, mycalMultiplication, mycalDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        mycalEditText = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View v) {
            mycalEditText.setText(mycalEditText.getText() + "7");
        }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mycalEditText == null) {
                    mycalEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(mycalEditText.getText() + "");
                    mycalAddition = true;
                    mycalEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mycalEditText.getText() + "");
                mycalSubtract = true;
                mycalEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mycalEditText.getText() + "");
                mycalMultiplication = true;
                mycalEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(mycalEditText.getText() + "");
                mycalDivision = true;
                mycalEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(mycalEditText.getText() + "");

                if (mycalAddition == true) {
                    mycalEditText.setText(mValueOne + mValueTwo + "");
                    mycalAddition = false;
                }

                if (mycalSubtract == true) {
                    mycalEditText.setText(mValueOne - mValueTwo + "");
                    mycalSubtract = false;
                }

                if (mycalMultiplication == true) {
                    mycalEditText.setText(mValueOne * mValueTwo + "");
                    mycalMultiplication = false;
                }

                if (mycalDivision == true) {
                    mycalEditText.setText(mValueOne / mValueTwo + "");
                    mycalDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycalEditText.setText(mycalEditText.getText() + ".");
            }
        });
    }
}
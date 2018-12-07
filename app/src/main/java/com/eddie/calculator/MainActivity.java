package com.eddie.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView myText;
    private boolean mAddition, mSubtract, mMultiplication, mDivision;
    private String operand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_calc);

        Button button_1 = findViewById(R.id.one_btn);
        Button button_2 = findViewById(R.id.two_btn);
        Button button_3 = findViewById(R.id.three_btn);
        Button button_4 = findViewById(R.id.four_btn);
        Button button_5 = findViewById(R.id.five_btn);
        Button button_6 = findViewById(R.id.six_btn);
        Button button_7 = findViewById(R.id.seven_btn);
        Button button_8 = findViewById(R.id.eigth_btn);
        Button button_9 = findViewById(R.id.nine_btn);
        Button button_0 = findViewById(R.id.zero_btn);
        Button clearButton = findViewById(R.id.clear_btn);
        Button plusButton = findViewById(R.id.plus_btn);
        Button resultButton = findViewById(R.id.result_btn);
        Button minusButton = findViewById(R.id.minus_btn);
        Button multiButton = findViewById(R.id.multiplication_btn);
        Button divideButton = findViewById(R.id.divide_btn);
        Button pointButton = findViewById(R.id.point_btn);

        myText = findViewById(R.id.text_disp);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        clearButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        resultButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        multiButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        pointButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.one_btn) {

            String str = String.valueOf(myText.getText());
            str += 1;
            myText.setText(str);

        } else if (v.getId() == R.id.two_btn) {

            String str = String.valueOf(myText.getText());
            str += 2;
            myText.setText(str);

        } else if (v.getId() == R.id.three_btn) {

            String str = String.valueOf(myText.getText());
            str += 3;
            myText.setText(str);

        } else if (v.getId() == R.id.four_btn) {

            String str = String.valueOf(myText.getText());
            str += 4;
            myText.setText(str);

        } else if (v.getId() == R.id.five_btn) {

            String str = String.valueOf(myText.getText());
            str += 5;
            myText.setText(str);

        } else if (v.getId() == R.id.six_btn) {

            String str = String.valueOf(myText.getText());
            str += 6;
            myText.setText(str);

        } else if (v.getId() == R.id.seven_btn) {

            String str = String.valueOf(myText.getText());
            str += 7;
            myText.setText(str);

        } else if (v.getId() == R.id.eigth_btn) {

            String str = String.valueOf(myText.getText());
            str += 8;
            myText.setText(str);

        } else if (v.getId() == R.id.nine_btn) {

            String str = String.valueOf(myText.getText());
            str += 9;
            myText.setText(str);

        } else if (v.getId() == R.id.zero_btn) {

            String str = String.valueOf(myText.getText());
            str += 0;
            myText.setText(str);

        } else if (v.getId() == R.id.point_btn) {

            String str = String.valueOf(myText.getText());

            if (!String.valueOf(myText.getText()).contains(".")) {

                myText.setText(str + ".");
            }

        } else if (v.getId() == R.id.clear_btn) {

            operand = null;
            myText.setText("");

        } else if (v.getId() == R.id.plus_btn) {

            mAddition = true;
            operand = String.valueOf(myText.getText());
            myText.setText("");

        } else if (v.getId() == R.id.minus_btn) {

            operand = String.valueOf(myText.getText());
            mSubtract = true;
            myText.setText(null);

        } else if (v.getId() == R.id.multiplication_btn) {

            operand = String.valueOf(myText.getText());
            mMultiplication = true;
            myText.setText(null);

        } else if (v.getId() == R.id.divide_btn) {

            operand = String.valueOf(myText.getText());
            mDivision = true;
            myText.setText(null);

        } else if (v.getId() == R.id.result_btn) {

            if (operand == null) {

                return;
            }

            double a = Double.parseDouble(operand);
            double b = Double.parseDouble(myText.getText().toString());

            if (mAddition == true) {

                myText.setText((a + b) + "");

                mAddition = false;

            } else if (mSubtract == true) {

                myText.setText((a - b) + "");

                mSubtract = false;

            } else if (mMultiplication == true) {

                myText.setText((a * b) + "");

                mMultiplication = false;

            } else if (mDivision == true) {

                myText.setText(((a / b)) + "");

                mDivision = false;
            }

            operand = null;

        }
    }
}



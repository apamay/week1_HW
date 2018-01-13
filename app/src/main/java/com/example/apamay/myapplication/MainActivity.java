package com.example.apamay.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void thaibaht(View v) {
        Context context = getApplicationContext();
        EditText et1 = (EditText) findViewById(R.id.txtThaiBath);
        String txtTB = et1.getText().toString();
        double AnsThaiBath = Double.parseDouble(txtTB) / 35;

        TextView tv1 = (TextView) findViewById(R.id.lblUsa);
        tv1.setText("" + AnsThaiBath);

    }


    public void cal(View v) {
        Context context = getApplicationContext();
        EditText et2 = (EditText) findViewById(R.id.txtFirstNo);
        EditText et3 = (EditText) findViewById(R.id.txtSecondNo);
        String txtFN = et2.getText().toString();
        String txtSN = et3.getText().toString();
        float AnsSum = Float.parseFloat(txtFN) + Float.parseFloat(txtSN);


        TextView tv2 = (TextView) findViewById(R.id.lblAnsSum);
        tv2.setText(""+AnsSum);
    }



    public void ok(View v) {
        Context context = getApplicationContext();
        EditText et1 = (EditText) findViewById(R.id.txtStartNo);
        EditText et2 = (EditText) findViewById(R.id.txtEndNo);
        String txtSN = et1.getText().toString();
        String txtEN = et2.getText().toString();
        int AnsSum = Integer.parseInt(txtEN) - Integer.parseInt(txtSN);
        String AnsA="";
        for (int i = 0; i<AnsSum ;i++){
            AnsA = AnsA+"A";
        }

        TextView tv2 = (TextView) findViewById(R.id.lblAnsA);
        tv2.setText("" + AnsA);
    }
}
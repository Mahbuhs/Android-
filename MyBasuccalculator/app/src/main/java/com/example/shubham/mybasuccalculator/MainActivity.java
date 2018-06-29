package com.example.shubham.mybasuccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btAdd,btSub,btDiv,btMul;
    private TextView pvresult;
    private EditText idfirstnumber,idsecondnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        btAdd = (Button)findViewById(R.id.btAdd);
        btSub = (Button)findViewById(R.id.btSub);
        btDiv = (Button)findViewById(R.id.btDiv);
        btMul = (Button)findViewById(R.id.btMul);
        idfirstnumber = (EditText)findViewById(R.id.idfirstnumber);
        idsecondnumber = (EditText)findViewById(R.id.idsecondnumber);
        pvresult = (TextView)findViewById(R.id.pvresult);

        btAdd.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btDiv.setOnClickListener(this);
        btMul.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
    String num1 = idfirstnumber.getText().toString();
    String num2 = idsecondnumber.getText().toString();

        switch (v.getId()){
            case R.id.btAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                pvresult.setText(String.valueOf(addition));
                break;

            case R.id.btSub:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                pvresult.setText(String.valueOf(subtraction));
                break;

            case R.id.btDiv:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    pvresult.setText(String.valueOf(division));
                }catch (Exception e){
                    pvresult.setText("Cannot DIVIDE");
                }
                break;

            case R.id.btMul:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                pvresult.setText(String.valueOf(multiplication));
                break;

        }
    }
}

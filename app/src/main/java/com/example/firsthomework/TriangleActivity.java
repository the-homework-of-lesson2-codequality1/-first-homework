package com.example.firsthomework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import util.DoubletoStringUtil;

public class TriangleActivity extends AppCompatActivity {
    private EditText mEtData1,mEtData2;
    private Button mBtnRun;
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        mBtnRun = findViewById(R.id.btn_run);
        mEtData1 = findViewById(R.id.et_data_1);
        mEtData2 = findViewById(R.id.et_data_2);
        mTvResult = findViewById(R.id.tv_result);
        mBtnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double data1 = Double.parseDouble(mEtData1.getText().toString());
                double data2 = Double.parseDouble(mEtData2.getText().toString());
                String result = DoubletoStringUtil.getstring(data1*data2/2);
                mTvResult.setText(result);
            }
        });
    }
}

package com.example.firsthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnRectangle,mBtnSquare,mBtnCircle,mBtnTriangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnRectangle = findViewById(R.id.btn_rectangle);
        mBtnSquare = findViewById(R.id.btn_square);
        mBtnCircle = findViewById(R.id.btn_circle);
        mBtnTriangle = findViewById(R.id.btn_triangle);
        setListeners();
    }
    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnRectangle.setOnClickListener(onClick);
        mBtnSquare.setOnClickListener(onClick);
        mBtnCircle.setOnClickListener(onClick);
        mBtnTriangle.setOnClickListener(onClick);

    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_rectangle:
                    intent = new Intent(MainActivity.this,RectangleActivity.class);
                    break;
                case R.id.btn_square:
                    intent = new Intent(MainActivity.this,SquareActivity.class);
                    break;
                case R.id.btn_circle:
                    intent = new Intent(MainActivity.this,CircleActivity.class);
                    break;
                case R.id.btn_triangle:
                    intent = new Intent(MainActivity.this,TriangleActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}

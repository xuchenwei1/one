package com.bwie.day1_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //演示
        TextView textView=new TextView(this,null);
        //新控件 输入框
        EditText editText=new EditText(this,null);
        //创建新控件
        Button button=new Button(this,null);
    }
}

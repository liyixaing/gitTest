package com.example.xiaoqiang.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVIew();
    }

    //初始化View
    public void initVIew() {
        tv_name = findViewById(R.id.tv_name);
        tv_name.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_name:
                Toast.makeText(this, "点击了小强", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

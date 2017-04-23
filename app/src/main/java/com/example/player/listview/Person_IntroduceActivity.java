package com.example.player.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Person_IntroduceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_detail);
        TextView personname = (TextView)findViewById(R.id.name);
        TextView introduce = (TextView)findViewById(R.id.detail);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        if(name.equals("毛泽东")){
            personname.setText(name);
            introduce.setText(R.string.total_mao); }
        if(name.equals("蒋介石")){
            personname.setText(name);
            introduce.setText(R.string.total_jiang); }
        if(name.equals("孙中山")){
            personname.setText(name);
            introduce.setText(R.string.total_sun); }
        if(name.equals("邓小平")){
            personname.setText(name);
            introduce.setText(R.string.total_deng); }
    }
}

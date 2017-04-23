package com.example.player.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Deng_IntroduceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_detail);
        TextView name = (TextView)findViewById(R.id.name);
        TextView introduce = (TextView)findViewById(R.id.detail);
        name.setText("邓小平");
        introduce.setText(R.string.total_deng);
    }
}

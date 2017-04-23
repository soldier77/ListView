package com.example.player.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.player.listview.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private List<Person>persons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPerson();
        PersonAdapter adapter = new PersonAdapter(MainActivity.this,R.layout.person_item,persons);
        ListView listView = (ListView)findViewById(R.id.person_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
                Person person = persons.get(position);
                if(person.getName().equals("孙中山")) {
                    Toast.makeText(MainActivity.this,R.string.sun, Toast.LENGTH_LONG).show();
                }
                if(person.getName().equals("蒋介石")) {
                    Toast.makeText(MainActivity.this,R.string.jiang, Toast.LENGTH_LONG).show();
                }
                if(person.getName().equals("毛泽东")) {
                    Toast.makeText(MainActivity.this, R.string.mao, Toast.LENGTH_LONG).show();
                }
                if(person.getName().equals("邓小平")) {
                    Toast.makeText(MainActivity.this, R.string.deng, Toast.LENGTH_LONG).show();
                }
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent,View view,int position,long id){
                Person person = persons.get(position);
                Intent intent = new Intent(MainActivity.this,Person_IntroduceActivity.class);
                String name = new String("none");
                if(person.getName().equals("孙中山")) {
                    name = new String("孙中山");
                }
                if(person.getName().equals("蒋介石")) {
                    name = new String("蒋介石");
                }
                if(person.getName().equals("毛泽东")) {
                    name = new String("毛泽东");
                }
                if(person.getName().equals("邓小平")) {
                    name = new String("邓小平");
                }
                intent.putExtra("name",name);
                startActivity(intent);
                return true;
            }
        });
    }
    private void initPerson(){
        Person Sun_Zhongshan = new Person("孙中山",R.drawable.sunzhongshan);
        persons.add(Sun_Zhongshan);
        Person Jiang_Jieshi = new Person("蒋介石",R.drawable.jiangjieshi);
        persons.add(Jiang_Jieshi);
        Person Mao_Zedong = new Person("毛泽东",R.drawable.maozedong);
        persons.add(Mao_Zedong);
        Person Deng_Xiaoping = new Person("邓小平",R.drawable.dengxiaoping);
        persons.add(Deng_Xiaoping);
    }
}

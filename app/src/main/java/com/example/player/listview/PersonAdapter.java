package com.example.player.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by player on 2017/4/22.
 */

public class PersonAdapter extends ArrayAdapter<Person> {
    private int layoutId;
    public PersonAdapter(Context context, int textViewId, List<Person>objects){
        super(context, textViewId,objects);
        layoutId=textViewId;
    }
    public View getView(int position, View convertview, ViewGroup parent){
        Person person = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(layoutId,parent,false);
        ImageView personImage = (ImageView)view.findViewById(R.id.person_image);
        TextView personName = (TextView)view.findViewById(R.id.person_name);
        personImage.setImageResource(person.getImageId());
        personName.setText(person.getName());
        return view;
    }
}

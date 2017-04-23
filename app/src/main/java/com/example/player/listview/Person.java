package com.example.player.listview;

/**
 * Created by player on 2017/4/22.
 */

public class Person {
    private String name;
    private int imageId;
    public Person(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}

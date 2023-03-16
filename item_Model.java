package com.example.streams;

public class item_Model {
    private int imageview1;
    private String textview1,textview2,textview3,divider;


    public item_Model(int imageview1, String textview1, String textview2, String textview3, String divider)
    {
        this.textview1=textview1;
        this.textview2=textview2;
        this.textview3=textview3;
        this.divider=divider;
        this.imageview1=imageview1;
    }

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getTextview3() {
        return textview3;
    }

    public String getDivider() {
        return divider;
    }
}

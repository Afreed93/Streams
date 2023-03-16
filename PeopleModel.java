package com.example.streams;

import android.widget.TextView;

public class PeopleModel {
    private int img1;
    private String textView1;
    private String textView2;
    private String divider;
    public PeopleModel(int img1, String textview1, String textview2, String divider)
    {
       this.img1=img1;
       this.textView1=textview1;
       this.textView2=textview2;
       this.divider=divider;


    }

    public int getImageview1() {
        return img1;
    }

    public String getTextview1() {
        return textView1;
    }

    public String getTextview2() {
        return textView2;
    }

    public String getDivider() {
        return divider;
    }

}

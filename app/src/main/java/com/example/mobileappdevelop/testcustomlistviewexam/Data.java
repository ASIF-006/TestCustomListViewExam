package com.example.mobileappdevelop.testcustomlistviewexam;


import android.widget.ImageView;

import java.util.ArrayList;

public class Data {
    String name, number;
    int sm, cl;
    ArrayList<Data> contacts;

    public Data(String name, String number, int sm, int cl) {
        this.name = name;
        this.number = number;
        this.sm = sm;
        this.cl = cl;
    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getCl() {
        return cl;
    }

    public int getSm() {
        return sm;
    }

    public ArrayList<Data> getAlldata(){
        contacts = new ArrayList<>();
        contacts.add(new Data("Demo","15555215556",R.drawable.sms,R.drawable.call));
        contacts.add(new Data("Five","888",R.drawable.sms,R.drawable.call));
        contacts.add(new Data("Four","767",R.drawable.sms,R.drawable.call));
        contacts.add(new Data("naser","8600",R.drawable.sms,R.drawable.call));
        contacts.add(new Data("one","123",R.drawable.sms,R.drawable.call));
        contacts.add(new Data("sf","733",R.drawable.sms,R.drawable.call));
        contacts.add(new Data("Three","768899",R.drawable.sms,R.drawable.call));
        return contacts;
    }
}

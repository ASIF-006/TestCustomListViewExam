package com.example.mobileappdevelop.testcustomlistviewexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactList = (ListView) findViewById(R.id.firstListView);

        //ContactAdapter<Data> = new ContactAdapter(this,list_row,R.id.firstListView.)
    }
}

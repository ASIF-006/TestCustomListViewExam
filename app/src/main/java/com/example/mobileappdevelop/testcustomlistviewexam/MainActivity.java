package com.example.mobileappdevelop.testcustomlistviewexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView contactList;
    ArrayList<Data> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactList = (ListView) findViewById(R.id.firstListView);

        Data data = new Data();
        datas = data.getAlldata();
        ContactAdapter adapter = new ContactAdapter(this, datas);
        contactList.setAdapter(adapter);
    }
}

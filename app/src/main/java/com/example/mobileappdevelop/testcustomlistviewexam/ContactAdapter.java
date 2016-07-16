package com.example.mobileappdevelop.testcustomlistviewexam;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter {

    private Context context;
    private ArrayList<Data> contact;
    public ContactAdapter(Context context,ArrayList<Data> teams) {
        super(context, R.layout.list_row, teams);
        this.context = context;
        this.contact = teams;
    }

    private class viewHolder{
        TextView NameText ;
        TextView PhoneText ;
        Button call ;
        Button sms ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder vi;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row, null,true);

            vi = new viewHolder();
            vi.NameText = (TextView) convertView.findViewById(R.id.nameTextView);
            vi.PhoneText = (TextView) convertView.findViewById(R.id.numberTextView);
            vi.call = (Button) convertView.findViewById(R.id.callButton);
            vi.sms = (Button) convertView.findViewById(R.id.smsButton);
            convertView.setTag(vi);
        }
        else{
            vi = (viewHolder) convertView.getTag();
        }

        vi.NameText.setText(contact.get(position).getName());
        vi.PhoneText.setText(contact.get(position).getNumber());
        vi.call.setText(contact.get(position).getCl());
        vi.sms.setText(contact.get(position).getSm());
        return convertView;
    }
}

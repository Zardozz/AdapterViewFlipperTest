package com.test.AdaterViewFlipperTest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FlipperAdapter extends BaseAdapter {
    private People mPeople;
    private Context context;
    private LayoutInflater inflter;

    public FlipperAdapter(Context applicationContext, People people){
        this.context = applicationContext;
        this.mPeople = people;
        this.inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return this.mPeople.getSize();
    }

    @Override
    public Object getItem(int position) {
        return this.mPeople.getPerson(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = inflter.inflate(R.layout.flipper_page, parent, false);
        TextView firstName = (TextView) view.findViewById(R.id.firstName);
        TextView lastName = (TextView) view.findViewById(R.id.lastName);

        Person person = (Person) getItem(position);

        firstName.setText(person.getFirstName());
        firstName.setTextColor(Color.BLACK);
        lastName.setText(person.getLastName());
        lastName.setTextColor(Color.BLACK);

        return view;
    }
}

package com.example.hp.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter3 extends BaseAdapter {
    private ArrayList<Restaurant1Food> fData;
    private Context fContext;
    private int fResource;

    public MyAdapter3(ArrayList<Restaurant1Food> data1, Context context1, int resource1) {
        fData = data1;
        fContext = context1;
        fResource = resource1;
    }

    @Override
    public View getView(int j, View view, ViewGroup viewGroup) { //i번째 항목에 대한 view를 만듦

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) fContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(fResource, viewGroup,false);
        }

        ImageView Image = view.findViewById(R.id.imageView);
        TextView name = view.findViewById(R.id.Name);
        TextView price = view.findViewById(R.id.Price);
        TextView score = view.findViewById(R.id.Score);

        Image.setImageResource(fData.get(j).getFood());
        name.setText(fData.get(j).getName());
        price.setText(fData.get(j).getPrice());
        score.setText(fData.get(j).getScore());

        return view;
    }

    @Override
    public int getCount() {
        return fData.size(); //MyAdapter가 관리하는 항목의 개수
    }

    @Override
    public Object getItem(int j) {
        return fData.get(j); //MyItem타입의 데이터가 가지고 있는 데이터를 get
    }

    @Override
    public long getItemId(int j) {
        return j;
    }

}
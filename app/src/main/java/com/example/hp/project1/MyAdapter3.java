package com.example.hp.project1;

import android.widget.BaseAdapter;

/**
 * Created by hp on 2017-10-15.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter3 extends BaseAdapter {
    private ArrayList<Restaurant1menu> sData;
    private Context sContext;
    private int sResource;

    public MyAdapter3(ArrayList<Restaurant1menu> data, Context context, int resource) {
        sData = data;
        sContext = context;
        sResource = resource;
    }

    @Override
    public int getCount() {
        return sData.size(); //MyAdapter가 관리하는 항목의 개수
    }

    @Override
    public Object getItem(int i) {
        return sData.get(i); //MyItem타입의 데이터가 가지고 있는 데이터를 get
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override           //i번째항목, ListView, Parent group
    public View getView(int i, View view, ViewGroup viewGroup) { //i번째 항목에 대한 view를 만듦

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) sContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(sResource, viewGroup,false);
        }

        ImageView Image = view.findViewById(R.id.imageView); //view class 에서 정의되어진 findViewById사용
        TextView text1 = view.findViewById(R.id.Name);
        TextView text2 = view.findViewById(R.id.Price);
        //  TextView text3 = view.findViewById(R.id.Score);

        Image.setImageResource(sData.get(i).getFood());
        text1.setText(sData.get(i).getName());
        text2.setText(sData.get(i).getPrice());
        //   text3.setText(sData.get(i).getScore());

        return view;
    }
}
package com.example.hp.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private ArrayList<Restaurant1> mData;
    private Context mContext;
    private int mResource;

    public MyAdapter(ArrayList<Restaurant1> data, Context context, int resource) {
        mData = data;
        mContext = context;
        mResource = resource;
    }

    @Override
    public int getCount() {
        return mData.size(); //MyAdapter가 관리하는 항목의 개수
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i); //MyItem타입의 데이터가 가지고 있는 데이터를 get
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override           //i번째항목, ListView, Parent group
    public View getView(int i, View view, ViewGroup viewGroup) { //i번째 항목에 대한 view를 만듦

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(mResource, viewGroup,false);
        }

        TextView text1 = view.findViewById(R.id.textItem1); //view class 에서 정의되어진 findViewById사용
        TextView text2 = view.findViewById(R.id.textItem2);
        TextView text3 = view.findViewById(R.id.textItem3);

        text1.setText(mData.get(i).getAddress());
        text2.setText(mData.get(i).getNumber());
        text3.setText(mData.get(i).getTime());

        return view;
    }
}
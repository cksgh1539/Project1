package com.example.hp.project1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.jar.Attributes;

/**
 * Created by hp on 2017-10-16.
 */

public class FoodDetail extends AppCompatActivity {

    static final String TAG = "Chan";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fooddetail);
        Intent intent = getIntent();
        int Image = intent.getExtras().getInt("Image");
        String name = intent.getExtras().getString("Name");
        String price = intent.getExtras().getString("Price");
        String average = intent.getExtras().getString("Average");

        TextView  txt = (TextView)findViewById(R.id.Name);
        TextView txt2 = (TextView)findViewById(R.id.Price);
        TextView txt3 = (TextView)findViewById(R.id.Score);
        ImageView img = (ImageView)findViewById(R.id.imageView);
        img.setImageResource(Image);
        txt.setText(name);
        txt2.setText(price);
        txt3.setText(average);




        //   text3.setText(sData.get(i).getScore());

       /* ArrayList<Restaurant1menu> data1 = new ArrayList<>();
        data1.add(new Restaurant1menu(Image,"name","price"));

        MyAdapter3 adapter1 = new MyAdapter3(data1, this, R.layout.fooddetail);
        ListView listView = (ListView)findViewById(R.id.listView);
       listView.setAdapter(adapter1);
        listView.setDividerHeight(5);*/

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            Drawable drawable = getDrawable(R.drawable.ic_arrow_back_black_24dp);
            if (drawable != null) {
                drawable.setTint(Color.WHITE);
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }
        Log.i(TAG, getLocalClassName() + ".onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, getLocalClassName() + ".onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, getLocalClassName() + ".onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, getLocalClassName() + ".onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, getLocalClassName() + ".onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, getLocalClassName() + ".onDestroy");
    }


}
package com.example.hp.project1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2017-10-16.
 */

public class FoodDetail extends AppCompatActivity {

    static final String TAG = "Chan";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ArrayList<Restaurant1> data = new ArrayList<>();
        data.add(new Restaurant1("성북구 ","02-760-1678","11:00~22:00"));
        MyAdapter adapter = new MyAdapter(data, this, R.layout.item4);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setDividerHeight(5);

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
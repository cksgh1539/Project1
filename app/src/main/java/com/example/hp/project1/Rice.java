package com.example.hp.project1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class Rice extends AppCompatActivity {

    static final String TAG = "Chan";

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menubase);

        Intent intent = getIntent();
        String Menu = intent.getStringExtra("Menu");
        TextView menu = (TextView)findViewById(R.id.menubar);
        menu.setText(Menu);

        ArrayList<Restaurant1menu> data1 = new ArrayList<>();
        data1.add(new Restaurant1menu(R.drawable.m4,"비빔밥","4000원"));
        data1.add(new Restaurant1menu(R.drawable.m5,"제육덮밥","4500원"));

        ArrayList<Restaurant1Food> data2 = new ArrayList<>();
        data2.add(new Restaurant1Food(R.drawable.m4,"비빔밥","4000원","평점: ★★"));
        data2.add(new Restaurant1Food(R.drawable.m5,"제육덮밥","4500원","평점: ★★"));

        final MyAdapter2 adapter1 = new MyAdapter2(data1, this, R.layout.item2);
        final MyAdapter3 adapter2 = new MyAdapter3(data2,this,R.layout.item2);

        ListView listView1 = (ListView)findViewById(R.id.ListView4);
        listView1.setAdapter( adapter1);
        listView1.setDividerHeight(5);

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

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), FoodDetail.class);

                int Image = ((Restaurant1Food)adapter2.getItem(position)).getFood();
                String name = ((Restaurant1Food)adapter2.getItem(position)).getName();
                String price = ((Restaurant1Food)adapter2.getItem(position)).getPrice();
                String score = ((Restaurant1Food)adapter2.getItem(position)).getScore();

                intent.putExtra("Image", Image);
                intent.putExtra("Name", name);
                intent.putExtra("Price", price);
                intent.putExtra("Score", score);

                startActivity(intent);
            }
        });
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

    public void calling(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:027604499"));
        startActivity(intent);
    }

}
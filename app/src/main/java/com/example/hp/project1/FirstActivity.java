package com.example.hp.project1;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    static final String TAG = "Chan";
    private ListAdapter createAdapter() {

        String[] items = {"Roll & Noodles", "Rice", "Fry" };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        return adapt;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);
        Log.i(TAG, getLocalClassName() + ".onCreate");

        ListAdapter adapt = createAdapter();

        ListView list = (ListView) findViewById(R.id.ListView1);
        list.setAdapter(adapt);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(), noodle.class);
                    intent.putExtra("Menu", "Roll & Noodles");
                    startActivity(intent);
                }else if(position == 1){
                    Intent intent = new Intent(getApplicationContext(), Rice.class);
                    intent.putExtra("Menu", "Rice");
                    startActivity(intent);
                }else if(position == 2){
                    Intent intent = new Intent(getApplicationContext(), Fry.class);
                    intent.putExtra("Menu", "Fry");
                    startActivity(intent);
                }
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


package com.example.hp.project1;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

        String[] items = {"Roll/Noodles", "Rice", "Fry" };

        ArrayAdapter<String> adapt
                = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
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

        list.setDivider(new ColorDrawable(Color.GRAY));
        list.setDividerHeight(5);



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                Intent intent = new Intent(getApplicationContext(), noodle.class);
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

}
    /*ArrayList<Restaurant1> data = new ArrayList<>();
        data.add(new Restaurant1("Roll/Noodles ", "Rice", "Fry"));

        final MyAdapter adapter = new MyAdapter(data, this, R.layout.item);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setDividerHeight(5);*/
       /* list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked,
                                    int position, long id) {
                Intent intent = new Intent(getApplicationContext(), noodle.class);
                startActivity(intent);
            }
        });*/

/*    public void button1(View view) {
        Intent intent = new Intent(getApplicationContext(), noodle.class);
        startActivity(intent);
    }
    public void button2(View view) {
        Intent intent = new Intent(getApplicationContext(), noodle.class);
        startActivity(intent);
    }
    public void button3(View view) {
        Intent intent = new Intent(getApplicationContext(), Fry.class);
        startActivity(intent);
    }*/



    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
*/
   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.quick_action1:
                Toast.makeText(getApplicationContext(), "quick", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_subactivity:
                startActivity(new Intent(this, Fry.class));

                Intent intent = new Intent(getApplicationContext(), Fry.class);
                intent.putExtra("string_msg", "Hello");
                startActivityForResult(intent, 0);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
*/

package com.sailcoach.sailcoach.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sailcoach.sailcoach.R;

public class ChooseBoatActivity extends AppCompatActivity {

    private String[] boats = new String[]{"Bateau 1","Bateau 2","Bateau 3","Bateau 4"};
    private ListView listBoats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_boat);

        listBoats = (ListView) findViewById(R.id.ListView);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(ChooseBoatActivity.this,
                android.R.layout.simple_list_item_1, boats);
        listBoats.setAdapter(adapter);
    }
}

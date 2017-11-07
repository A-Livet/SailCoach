package com.sailcoach.sailcoach.Activities;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sailcoach.sailcoach.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Create_Boat :
                TextView text = new TextView(this);
                text.setText("click");
               // addContentView(text);
                startActivity(new Intent(MainActivity.this, CreateBoatActivity.class));
                break;

            case R.id.Choos_Boat :
                testClick();
                break;
        }
    }

    public void testClick(){
        System.out.println("click");
    }
}

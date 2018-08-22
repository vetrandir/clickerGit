package com.example.vetrandir.clicker;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IComputer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icomputer);
        getSupportActionBar().hide();
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        TextView textView2= (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/pixcelfont.ttf");
        textView1.setTypeface(type);
        textView2.setTypeface(type);
        textView3.setTypeface(type);
    }
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
    }
}

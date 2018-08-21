package com.example.vetrandir.clicker;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    Button button;
    int a=0;
    int b=5;
    int copper;
    int iron;
    int graok;
    int flint;
    int rubber;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        button = (Button) findViewById(R.id.button);
        dbHelper = new DatabaseHelper(this);
        Button btn1 = (Button)findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this , Main2Activity.class);
                ContentValues cv = new ContentValues();
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                String COPPER = textView2.getText().toString();
                String IRON = textView.getText().toString();
                String RUBBER= textView.getText().toString();
                String GRAOK = textView.getText().toString();
                String FLINT = textView.getText().toString();
                switch (v.getId()) {
                    case R.id.button:


                        cv.put("COPPER", COPPER);
                        cv.put("RUBBER", RUBBER);
                        cv.put("GRAOK", GRAOK);
                        cv.put("FLINT", FLINT);
                        cv.put("IRON", IRON);
                        // вставляем запись и получаем ее ID
                        long rowID = db.insert("mytable", null, cv);

                        break;


                }
                dbHelper.close();
                startActivity(inten);
            }
        });




        View.OnClickListener Clicker = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_number1 = a + (int) (Math.random() * b);
                switch (random_number1) {
                    case 0:
                        copper++;

                        break;
                    case 1:
                        iron++;
                        break;
                    case 2:
                        graok++;
                        break;
                    case 3:
                        flint++;
                        break;
                    case 4:
                        rubber++;
                        break;

                }
                textView.setText(Integer.toString(copper));
                textView2.setText(Integer.toString(iron));
                textView3.setText(Integer.toString(graok));
                textView4.setText(Integer.toString(flint));
                textView5.setText(Integer.toString(rubber));
            }


        };
        button.setOnClickListener(Clicker);



    }
    public void OnClickToInventory(View view) {
        Intent intent = new Intent(MainActivity.this, Inventory.class);
        startActivity(intent);
    }

}

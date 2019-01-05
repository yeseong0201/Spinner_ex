package com.example.ys020.spinner_ex;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String[] items = {"선택하세요", "피크닉 사과", "감자알칩", "만두", "빵또아"};
    ImageView item1, item2, item3, item4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        final Spinner spinner = findViewById(R.id.spinner);


        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(items[i]);
                if (items[i] == items[0]) {
                    item1.setVisibility(View.INVISIBLE);
                    item2.setVisibility(View.INVISIBLE);
                    item3.setVisibility(View.INVISIBLE);
                    item4.setVisibility(View.INVISIBLE);

                } else if (items[i] == items[1]) {
                    item1.setVisibility(View.VISIBLE);
                    item2.setVisibility(View.INVISIBLE);
                    item3.setVisibility(View.INVISIBLE);
                    item4.setVisibility(View.INVISIBLE);
                } else if (items[i] == items[2]) {
                    item1.setVisibility(View.INVISIBLE);
                    item2.setVisibility(View.VISIBLE);
                    item3.setVisibility(View.INVISIBLE);
                    item4.setVisibility(View.INVISIBLE);
                } else if (items[i] == items[3]) {
                    item1.setVisibility(View.INVISIBLE);
                    item2.setVisibility(View.INVISIBLE);
                    item3.setVisibility(View.VISIBLE);
                    item4.setVisibility(View.INVISIBLE);

                } else if (items[i] == items[4]) {
                    item1.setVisibility(View.INVISIBLE);
                    item2.setVisibility(View.INVISIBLE);
                    item3.setVisibility(View.INVISIBLE);
                    item4.setVisibility(View.VISIBLE);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                textView.setText("선택");

            }
        });
    }
}

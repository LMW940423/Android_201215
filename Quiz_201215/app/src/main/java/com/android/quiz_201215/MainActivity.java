package com.android.quiz_201215;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Galaxy> data = null;
    private GalaxyAdapter adapter = null;
    private ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<Galaxy>();

        data.add(new Galaxy("Galaxy S"));
        data.add(new Galaxy("Galaxy S2"));
        data.add(new Galaxy("Galaxy S3"));
        data.add(new Galaxy("Galaxy S4"));
        data.add(new Galaxy("Galaxy S5"));
        data.add(new Galaxy("Galaxy S6"));
        data.add(new Galaxy("Galaxy S7"));
        data.add(new Galaxy("Galaxy S8"));
        data.add(new Galaxy("Galaxy S9"));
        data.add(new Galaxy("Galaxy S10"));
        data.add(new Galaxy("Galaxy S20"));

        adapter = new GalaxyAdapter(MainActivity.this, R.layout.custom_layout, data);
        listView = findViewById(R.id.listView_Galaxy);
        listView.setAdapter(adapter);

        listView.setDivider(new ColorDrawable(0x50ffffff)); // 간격 색상 조절(setDividerHeight 보다 먼저 쓰여야 변경된다)
        listView.setDividerHeight(50);

        listView.setOnItemClickListener(mItemClickListener);
    }
    AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String selectedModel = (String) parent.getAdapter().getItem(position);
            Intent intent = new Intent(getApplicationContext(), SubActivity.class);
            intent.putExtra("seqno", position);
            intent.putExtra("model", selectedModel);

            startActivity(intent);

        }
    };
}
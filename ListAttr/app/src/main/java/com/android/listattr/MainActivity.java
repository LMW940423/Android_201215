package com.android.listattr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //리스트에 체크박스 만들기

        ArrayAdapter<CharSequence> adapter;
        adapter = ArrayAdapter.createFromResource(this, R.array.country, android.R.layout.simple_list_item_multiple_choice);

        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE); // SINGLE 과 MULTIPLE
        list.setDivider(new ColorDrawable(0x50ff0000)); // 간격 색상 조절(setDividerHeight 보다 먼저 쓰여야 변경된다)
        list.setDividerHeight(30); // 리스트 행간의 간격 조절

    }
}
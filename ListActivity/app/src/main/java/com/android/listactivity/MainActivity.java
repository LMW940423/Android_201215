package com.android.listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends ListActivity { // 아예 List로 Activity로 사용하려면 ListActivity로 변경

    ArrayList<String> data = null;
    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        data = new ArrayList<String>();
        data.add("월");
        data.add("화");
        data.add("수");
        data.add("목");
        data.add("금");
        data.add("토");
        data.add("일");
        data.add("월");
        data.add("화");
        data.add("수");
        data.add("목");
        data.add("금");
        data.add("토");
        data.add("일");
        data.add("월");
        data.add("화");
        data.add("수");
        data.add("목");
        data.add("금");
        data.add("토");
        data.add("일");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        setListAdapter(adapter); // 기존 ListView와 다른 양식

    }
}
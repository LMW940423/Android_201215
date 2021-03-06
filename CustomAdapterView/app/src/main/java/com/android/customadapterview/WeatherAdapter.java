package com.android.customadapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends BaseAdapter { // 기본 어댑터 형식 BaseAdapter

    //Field
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Weather> data = null;
    private LayoutInflater inflater = null;

    //Constructor
    public WeatherAdapter(Context mContext, int layout, ArrayList<Weather> data) {
        this.mContext = mContext;
        this.layout = layout;
        this.data = data;
        this.inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //Method
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getDay();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(this.layout, parent, false);
        }
        // ListView 만들기
        TextView textView_day = convertView.findViewById(R.id.text_day);
        ImageView imageView_icon = convertView.findViewById(R.id.imageView_Weather);
        TextView textView_comment = convertView.findViewById(R.id.text_comment);

        textView_day.setText(data.get(position).getDay() + " ");
        imageView_icon.setImageResource(data.get(position).getIcon());
        textView_comment.setText(data.get(position).getComment());

        if(position % 2 == 1){
            convertView.setBackgroundColor(0x5000ff00);
        }else{
            convertView.setBackgroundColor(0x2000ff00);
        }

        return convertView;
    }

}

package com.android.quiz_201215;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GalaxyAdapter extends BaseAdapter {

    //Field
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Galaxy> data = null;
    private LayoutInflater inflater = null;

    public GalaxyAdapter(Context mContext, int layout, ArrayList<Galaxy> data) {
        this.mContext = mContext;
        this.layout = layout;
        this.data = data;
        this.inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getPrdName();
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
        TextView textView_day = convertView.findViewById(R.id.text_Name);
//        ImageView imageView_icon = convertView.findViewById(R.id.imageView_Weather);
//        TextView textView_comment = convertView.findViewById(R.id.text_Discription);

        textView_day.setText(data.get(position).getPrdName() + " ");
//        imageView_icon.setImageResource(data.get(position).getIcon());
//        textView_comment.setText(data.get(position).getPrdDis());

        if(position % 2 == 1){
            convertView.setBackgroundColor(0x5000BFFF);
        }else{
            convertView.setBackgroundColor(0x201E90FF);
        }

        return convertView;
    }
}

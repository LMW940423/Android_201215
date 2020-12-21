package com.android.quiz_201215;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class SubActivity extends AppCompatActivity {
    Button showList = null;
    Button showDetail = null;
    TextView prdName = null;
    ImageView prdImg = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);

        prdName = findViewById(R.id.prdName);

        prdImg = findViewById(R.id.prdImg);
        showList = findViewById(R.id.showList);
        showDetail = findViewById(R.id.showDetail);

//        prdDis.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        int seqno = intent.getExtras().getInt("seqno");
        String model = intent.getStringExtra("model");

        switch (seqno){
            case 0:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s);
                break;
            case 1:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s2);

                break;
            case 2:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s3);

                break;
            case 3:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s4);

                break;
            case 4:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s5);

                break;
            case 5:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s6);

                break;
            case 6:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s7);

                break;
            case 7:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s8);

                break;
            case 8:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s9);

                break;
            case 9:
                prdName.setText(model);
                prdImg.setImageResource(R.drawable.s10);

                break;
            case 10:
                prdName.setText(model);
                Glide.with(this).load(R.drawable.galaxys20).into(prdImg);

                break;


        }
        Log.v("CheckSection", "sub1");
        showDetail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.v("CheckSection", "onClick1");

                Intent intent = new Intent(getApplicationContext(), DisActivity.class);
                Log.v("CheckSection", "onClick2");
                intent.putExtra("seqno", seqno);
                Log.v("CheckSection", "onClick3");
                intent.putExtra("model", model);
                Log.v("CheckSection", "onClick4");

                startActivity(intent);
            }
        });
        showList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });


    }
}

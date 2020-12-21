package com.android.horizontalscrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private int[] data = {R.drawable.w1, R.drawable.w2, R.drawable.w3, R.drawable.w4, R.drawable.w5, R.drawable.w6, R.drawable.w7};
    private LinearLayout ll;
    private ImageView[] ivs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = findViewById(R.id.ll_01);
        ivs = new ImageView[7];

        for (int i = 0; i < 7; i++){
            ivs[i] = new ImageView(this);
            ivs[i].setImageResource(data[i]); // data에 저장된 이미지 id를 이용
            ll.addView(ivs[i]);
        }

    }
}
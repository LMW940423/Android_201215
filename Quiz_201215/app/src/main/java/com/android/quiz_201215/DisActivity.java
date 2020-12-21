package com.android.quiz_201215;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DisActivity extends AppCompatActivity {
    Button goBack = null;
    TextView prdDis = null;
    TextView prdName = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);
        Log.v("CheckSection", "Dis_onCreate1");

        goBack = findViewById(R.id.goBack);
        Log.v("CheckSection", "Dis_onCreate2");
        prdDis = findViewById(R.id.text_Detail);
        Log.v("CheckSection", "Dis_onCreate3");
        prdName = findViewById(R.id.text_Name);
        Log.v("CheckSection", "Dis_onCreate4");
//        prdDis.setMovementMethod(new ScrollingMovementMethod());
        Log.v("CheckSection", "Dis_onCreate5");

        Intent intent = getIntent();
        Log.v("CheckSection", "Dis_getIntent");
        int seqno = intent.getExtras().getInt("seqno");
        Log.v("CheckSection", "seqno : " + seqno);
        String model = intent.getStringExtra("model");
        Log.v("CheckSection", "model : " + model);

        switch (seqno) {
            case 0:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 1:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 2:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 3:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 4:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 5:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 6:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 7:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 8:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 9:
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원");
                break;
            case 10:
                Log.v("CheckSection", "case10");
                prdName.setText(model);
                prdDis.setText("■ 5G 단독 모드 지원\n" +
                        "\n" +
                        "갤럭시S20시리즈 3종은 모두 5G를 지원한다. 특히, 세 기종 모두 최신 5G 표준인 단독모드(SA)를 지원한 것이 특징이다.\n" +
                        "\n" +
                        "5G 단독 모드를 제공해 기존 4G LTE와 5G 네트워크를 함께 사용하는 비단독모드(NSA)보다 더 빠른 네트워크 접속 시간과 데이터 전송 속도를 제공할 수 있게 됐다. 삼성전자에 따르면 지연 시간은 거의 0초에 가깝다.\n" +
                        "\n" +
                        "갤럭시S20은 최초로 국가별 5G 네트워크 구축 환경에 따라 6GHz 이하(sub-6GHz)와 밀리미터파(mmWave) 대역을 동시에 지원한다.\n" +
                        "\n" +
                        "■ 1억800만 화소 광각 카메라 장착\n" +
                        "\n" +
                        "이번 갤럭시S20 시리즈에서 단연 돋보인 기능은 카메라다. 갤럭시S20 플러스와 갤럭시S20은 6천400만화소의 고화소 카메라를 탑재했으며, 갤럭시S20울트라는 갤럭시 시리즈 최초로 1억800만 화소 카메라를 탑재했다.\n" +
                        "\n" +
                        "갤럭시S20에는 역대 최대 크기의 이미제 센서가 탑재됐으며, 인공지능(AI)을 접목해 더욱 선명한 사진과 영상을 제공한다.\n" +
                        "\n" +
                        "■ '노나 비닝' 기술 및 최대 100배 디지털줌\n" +
                        "\n" +
                        "갤럭시S20 울트라는 노나 비닝(nona-binning) 기술도 지원한다. 노나 비닝 기술은 저조도 환경에서 9개의 픽셀을 하나의 픽셀로 병합해 더 많은 빛을 받아들일 수 있는 기술로, 어두운 밤에도 선명한 사진 촬영을 가능하게 한다.\n" +
                        "\n" +
                        "갤럭시S20 울트라는 폴디드 렌즈를 적용해 10배 줌으로 촬영해도 화질에 손상이 없으며, 최대 100배 줌 촬영이 가능한 '스페이스 줌'도 지원한다. 갤럭시S20플러스와 갤럭시S20은 3배 광학 줌에 최대 30배 줌 촬영이 가능하다.\n" +
                        "\n" +
                        "■ 8K 동영상\n" +
                        "\n" +
                        "갤럭시S20 시리즈는 카메라뿐 아니라 동영상 기능도 향상됐다. 갤럭시S20 3종 모두 8K 동영상을 지원한다. 기존 갤럭시S10 시리즈는 4K 동영상을 제공했다.\n" +
                        "\n" +
                        "갤럭시S20에서 촬영한 8K 영상은 삼성 QLED 8K TV로 바로 감상할 수 있다. 또 삼성전자는 유튜브와 협력해 갤럭시S20에서 8K 동영상을 유튜브에 바로 업로드할 수 있도록 했다.\n" +
                        "\n" +
                        "■ 슈퍼 스테디 모드 및 싱글테이크 기능\n" +
                        "\n" +
                        "안정적인 영상 촬영을 위해 슈퍼 스테디 모드도 진화했다. 슈퍼 스테디 모드는 기존 손떨림 방지 기능뿐 아니라 회전 방지 기능과 인공지능 기반 모션 분석 기능을 탑재해, 익스트림 스포츠와 같이 과격한 활동 중에도 흔들림 없는 영상 촬영을 지원한다.\n" +
                        "\n" +
                        "갤럭시S20에는 싱글 테이크 기능도 추가됐다. 싱글 테이크(Single take) 기능은 여러 개의 카메라 렌즈를 한 번에 사용해 라이브 포커스, 광각 등 다양한 모드로 사진과 동영상을 촬영하고, 해당 순간을 가장 잘 보여줄 수 있는 장면을 AI 기반으로 추천해준다.\n" +
                        "\n" +
                        "■ 풀HD급 영상 통화 지원\n" +
                        "\n" +
                        "삼성전자는 구글과도 협력해 갤럭시S20에 최적화된 영상통화 서비스 구글 듀오를 제공한다. 구글 듀오는 풀HD 화질의 영상 통화를 제공하며, 동시에 최대 8명과 영상 통화가 가능하다.\n" +
                        "\n" +
                        "■ 120Hz 주사율 디스플레이 탑재\n" +
                        "\n" +
                        "갤럭시S20은 120Hz 주사율의 디스플레이도 탑재했다. 초당 120개의 화면을 보여주는 120Hz 주사율 디스플레이로 고사양 게임도 더욱 매끄럽고 부드러운 화면으로 즐길 수 있다.\n" +
                        "\n" +
                        "삼성전자는 120Hz 주사율 디스플레이에 최신 모바일 프로세서, 고용량 RAM, 하만의 프리미엄 오디오 브랜드 AKG 기술력이 합쳐져 더욱 풍부한 게이밍 경험을 제공한다고 설명했다. 삼성전자는 마이크로소프트와 협력해 인기 게임 포르자스트리트를 모바일 최초로 갤럭시S20 사용자에게 제공할 예정이라고 밝혔다.\n" +
                        "\n" +
                        "■ 5천mAh 배터리와 45W 초고속 충전 지원\n" +
                        "\n" +
                        "갤럭시S20 시리즈는 전작보다 배터리 수명이 대폭 늘어났다. 특히, 갤럭시S20 울트라에는 대용량 5천mAh 배터리가 탑재됐으며, 별도 충전기 구매 시 45W의 초고속 충전도 가능하다.\n" +
                        "\n" +
                        "갤럭시S20 플러스는 4천500mAh, 갤럭스S20은 4천mAh 용량의 배터리를 탑재했으며, 두 기기 모두 25W 고속 충전을 지원한다. 전작인 갤럭시S10 배터리 용량은 3천400mAh였으며, 갤럭시S10 플러스는 4천100mAh였다.\n" +
                        "\n" +
                        "■ 더 커진 화면…6.2인치·6.7인치·6.9인치\n" +
                        "\n" +
                        "갤럭시S20 시리즈는 전작보다 화면이 더욱 커졌다. 갤럭시S20은 6.2인치, 갤럭시S20 플러스는 6.7인치, 갤럭시S20 울트라는 6.9인치 화면을 자랑한다. 전작인 갤럭시S10 화면은 6.1인치였으며, 갤럭시S10 플러스는 6.4인치 화면이었다.");

                break;
        }
        Log.v("CheckSection", "escape");
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("CheckSection", "Dis1");
                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.xiongying.videoplayerapp.upload;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.xiongying.videoplayerapp.R;
import com.xiongying.videoplayerapp.collection.CollectActivity;
import com.xiongying.videoplayerapp.local.LocalVideoActivity;


public class UploadActivity extends AppCompatActivity implements View.OnClickListener{
    private Intent intent=new Intent(this, CollectActivity.class);
    private Intent intent1=new Intent(this, InfomationActivity.class);
    private Intent intent2=new Intent(this, InfomationActivity.class);
    private Intent intent3=new Intent(this, LocalVideoActivity.class);
    private  ImageView imag;
    private ImageView iv_upload;
    private ImageView iv_set;
    private ImageView iv_local;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        initView();
        imag.setOnClickListener(this);
        iv_set.setOnClickListener(this);
        iv_upload.setOnClickListener(this);
        iv_local.setOnClickListener(this);
    }
    public  void initView(){
        imag = (ImageView) findViewById(R.id.iv_mysaveOrder);
        iv_upload=(ImageView)findViewById(R.id.iv_myload);
        iv_set=(ImageView)findViewById(R.id.iv_setting);
        iv_local=(ImageView)findViewById(R.id.iv_morelocal);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_mysaveOrder:
                startActivity(intent);
                break;
            case R.id.iv_myload:
                startActivity(intent1);
                break;
            case R.id.iv_setting:
                startActivity(intent2);
                break;
            case R.id.iv_morelocal:
                startActivity(intent3);
                break;

        }
    }
}
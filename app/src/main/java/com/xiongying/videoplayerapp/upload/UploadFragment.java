package com.xiongying.videoplayerapp.upload;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiongying.videoplayerapp.R;
import com.xiongying.videoplayerapp.collection.CollectActivity;
import com.xiongying.videoplayerapp.local.LocalVideoActivity;

/**
 * Created by 20256473 on 2017/3/20.
 */

public class UploadFragment extends Fragment  implements View.OnClickListener{

    private ImageView iv_saveOrder;
    private TextView tv_saveOrder;
    private Intent intent=new Intent(this.getActivity(), CollectActivity.class);
    private Intent intent2=new Intent(this.getActivity(), UploadActivity.class);
    private Intent intent3=new Intent(this.getActivity(), LocalVideoActivity.class);
    private ImageView iv_upload;
    private ImageView iv_more;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_upload, container, false);
        initView(view);
        iv_saveOrder.setOnClickListener(this);
        tv_saveOrder.setOnClickListener(this);
        iv_upload.setOnClickListener(this);
        iv_more.setOnClickListener(this);
        return view;
    }
    public void initView(View view){
        iv_saveOrder=(ImageView) view.findViewById(R.id.iv_saveOrder);
        tv_saveOrder=(TextView) view.findViewById(R.id.tv_saveOrder);
        iv_upload=(ImageView) view.findViewById(R.id.iv_load);
        iv_more=(ImageView) view.findViewById(R.id.iv_more);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.iv_saveOrder:
                startActivity(intent);
                break;
            case R.id.tv_saveOrder:
                startActivity(intent);
                break;
            case R.id.iv_load:
                startActivity(intent2);
                break;
            case R.id.iv_more:
                startActivity(intent3);
                break;
        }
    }
}

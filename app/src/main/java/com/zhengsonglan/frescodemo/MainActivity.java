
package com.zhengsonglan.frescodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.zhengsonglan.frescodemo.xml.GifActivity;
import com.zhengsonglan.frescodemo.xml.LoadingActivity;
import com.zhengsonglan.frescodemo.xml.ReloadActivity;
import com.zhengsonglan.frescodemo.xml.XmlActivity;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    //initView
    Button bt_xml,bt_xml_reload,bt_xml_gif,bt_xml_loading;


    //initData
    Intent intent=new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化fresco
        Fresco.initialize(MainActivity.this);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();

    }

    private void initEvent() {
        bt_xml.setOnClickListener(this);
        bt_xml_reload.setOnClickListener(this);
        bt_xml_gif.setOnClickListener(this);
        bt_xml_loading.setOnClickListener(this);
    }

    //初始化view
    private void initView() {
        bt_xml = (Button) findViewById(R.id.main_bt_xml);
        bt_xml_reload= (Button) findViewById(R.id.main_bt_xml_reload);
        bt_xml_gif= (Button) findViewById(R.id.main_bt_xml_gif);
        bt_xml_loading= (Button) findViewById(R.id.main_bt_xml_loading);

    }

    //点击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.main_bt_xml: {
                intent.setClass(MainActivity.this, XmlActivity.class);

                break;
            }

            case R.id.main_bt_xml_reload: {
                intent.setClass(MainActivity.this, ReloadActivity.class);

                break;
            }
            case R.id.main_bt_xml_gif: {
                intent.setClass(MainActivity.this, GifActivity.class);

                break;
            }

            case R.id.main_bt_xml_loading:
            {
                intent.setClass(MainActivity.this, LoadingActivity.class);
                break;
            }
        }

        startActivity(intent);
    }
}

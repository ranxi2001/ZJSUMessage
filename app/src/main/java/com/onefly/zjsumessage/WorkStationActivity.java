package com.onefly.zjsumessage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WorkStationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_staion);
        //此处写底部四个按钮的相互跳转
        ImageButton button_message = (ImageButton) findViewById(R.id.imageButton_message);
        button_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入消息",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(WorkStationActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button_myprofile = (ImageButton) findViewById(R.id.imageButton_myprofile);
        button_myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入我的",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(WorkStationActivity.this, MineActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button_addressbook = (ImageButton) findViewById(R.id.imageButton_addressBook);
        button_addressbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入通讯录",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(WorkStationActivity.this, AddressbookActivity.class);
                startActivity(intent);
            }
        });
        //底部按钮功能完全体

        //跳转到核酸按钮
        ImageButton button_hesuan = (ImageButton) findViewById(R.id.imageButton_hesuan);
        button_hesuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入核酸打卡",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(WorkStationActivity.this,FormActivity.class);
                startActivity(intent);
            }
        });
        //跳转外部浏览器


        ImageButton button_bigstudy = (ImageButton) findViewById(R.id.imageButton_bigstudy);
        final Uri uri=Uri.parse("https://f.kdocs.cn/w/s5dp6UlE/");
        button_bigstudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入核酸打卡",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
    }
}
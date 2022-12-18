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

        //跳转到学风特优班按钮
        ImageButton button_studystyle = (ImageButton) findViewById(R.id.imageButton_studystyle);
        button_studystyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入学风特优班投票通道",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(WorkStationActivity.this, StudyStyleActivity.class);
                startActivity(intent);
            }
        });
        //跳转外部浏览器
        //核酸
        ImageButton button_hesuan = (ImageButton) findViewById(R.id.imageButton_hesuan);
        final Uri uri_hesuan=Uri.parse("https://f.kdocs.cn/w/s5dp6UlE/");
        button_hesuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入核酸打卡",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_hesuan);
                startActivity(intent);
            }
        });
        //青年大学习
        ImageButton button_bigstudy = (ImageButton) findViewById(R.id.imageButton_bigstudy);
        final Uri uri_bigstudy=Uri.parse("https://f.kdocs.cn/w/y7FRSY33");
        button_bigstudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入青年大学习打卡",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_bigstudy);
                startActivity(intent);
            }
        });
        //行程码
        ImageButton button_xingchegnma = (ImageButton) findViewById(R.id.imageButton_xingchengma);
        final Uri uri_xingchengma=Uri.parse("https://f.kdocs.cn/w/wVCDopIu/");
        button_xingchegnma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入行程码接龙",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_xingchengma);
                startActivity(intent);
            }
        });
        //健康码
        ImageButton button_healthycode = (ImageButton) findViewById(R.id.imageButton_healthycode);
        final Uri uri_healthycode=Uri.parse("https://f.kdocs.cn/w/VN2HvxeS/");
        button_healthycode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入健康码接龙",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_healthycode);
                startActivity(intent);
            }
        });
        //奖学金
        ImageButton button_scholarship = (ImageButton) findViewById(R.id.imageButton_scholarship);
        final Uri uri_scholarship=Uri.parse("https://f.kdocs.cn/w/TWizHNMk/");
        button_scholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入奖学金申请书提交",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_scholarship);
                startActivity(intent);
            }
        });
        //助学金
        ImageButton button_subsidies = (ImageButton) findViewById(R.id.imageButton_subsidies);
        final Uri uri_subsidies=Uri.parse("https://f.kdocs.cn/g/wgHOQjoE/");
        button_subsidies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入助学金申请书提交",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_subsidies);
                startActivity(intent);
            }
        });
        //收集进度
        ImageButton button_schedule = (ImageButton) findViewById(R.id.imageButton_collectionschedule);
        final Uri uri_schedule=Uri.parse("https://kdocs.cn/l/cuLFhTNc0abo");
        button_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WorkStationActivity.this,"正在进入收集进度查询",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,uri_schedule);
                startActivity(intent);
            }
        });

    }
}
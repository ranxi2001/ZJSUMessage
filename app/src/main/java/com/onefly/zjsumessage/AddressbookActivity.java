package com.onefly.zjsumessage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddressbookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addressbook);
        //此处写底部四个按钮的相互跳转
        ImageButton button_message = (ImageButton) findViewById(R.id.imageButton_message);
        button_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddressbookActivity.this,"正在进入消息",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(AddressbookActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button_myprofile = (ImageButton) findViewById(R.id.imageButton_myprofile);
        button_myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddressbookActivity.this,"正在进入我的",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(AddressbookActivity.this, MineActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button_workstation = (ImageButton) findViewById(R.id.imageButton_workstation);
        button_workstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddressbookActivity.this,"正在进入工作台",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(AddressbookActivity.this, WorkStationActivity.class);
                startActivity(intent);
            }
        });
        //底部按钮功能完全体
    }
}
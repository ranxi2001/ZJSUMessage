package com.onefly.zjsumessage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class UserInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        //从名片页面进入聊天界面
        Button button_contact1 = (Button) findViewById(R.id.button_startchat_fy);
        button_contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserInformationActivity.this, ChatActivity.class);
                String name="余朝阳";
                String institute="信息2002";
                intent.putExtra("userId",2035020613);
                intent.putExtra("institute",institute);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

        //从名片页面返回通讯录界面
        ImageButton button_return_address = (ImageButton) findViewById(R.id.imageButton_return_addressbook);
        button_return_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserInformationActivity.this, AddressbookActivity.class);
                startActivity(intent);
            }
        });







    }
}
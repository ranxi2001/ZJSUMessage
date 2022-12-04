package com.onefly.zjsumessage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        //控制button左边图标大小
        Button button1 = (Button) findViewById(R.id.button_zjsu);
        Drawable drawable1 = getResources().getDrawable(R.mipmap.zjsu);
        drawable1.setBounds(0, 0, 85, 85);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        button1.setCompoundDrawables(drawable1, null, null, null);//只放左边
        Button button2 = (Button) findViewById(R.id.button_ggxy);
        Drawable drawable2 = getResources().getDrawable(R.mipmap.ggxy);
        drawable2.setBounds(0, 0, 85, 85);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
        button2.setCompoundDrawables(drawable2, null, null, null);//只放左边

        //从通讯录页面进入名片界面
        Button button_contact1 = (Button) findViewById(R.id.button_chatperson1_address);
        button_contact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddressbookActivity.this, UserInformationActivity.class);
                startActivity(intent);
            }
        });
    }
}
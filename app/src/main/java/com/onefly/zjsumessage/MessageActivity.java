package com.onefly.zjsumessage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        //此处写底部四个按钮的相互跳转
        ImageButton button_workstation = (ImageButton) findViewById(R.id.imageButton_workstation);
        button_workstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MessageActivity.this,"正在进入工作台",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MessageActivity.this, WorkStationActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button_myprofile = (ImageButton) findViewById(R.id.imageButton_myprofile);
        button_myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MessageActivity.this,"正在进入我的",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MessageActivity.this, MineActivity.class);
                startActivity(intent);
            }
        });
        ImageButton button_addressbook = (ImageButton) findViewById(R.id.imageButton_addressBook);
        button_addressbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MessageActivity.this,"正在进入通讯录",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MessageActivity.this, AddressbookActivity.class);
                startActivity(intent);
            }
        });
        //底部按钮功能完全体
        //按钮左图大小
        Button button1 = (Button) findViewById(R.id.button_chatperson1);
        Drawable drawable1 = getResources().getDrawable(R.drawable.yuchaoyang);
        drawable1.setBounds(30, 0, 150, 120);//第一0是距左边距离，第二0是距上边距离，
        button1.setCompoundDrawables(drawable1, null, null, null);//只放左边
        //按钮左图大小
        Button button2 = (Button) findViewById(R.id.button_chatperson2);
        Drawable drawable2 = getResources().getDrawable(R.drawable.wagnjinhong);
        drawable2.setBounds(30, 0, 150, 120);//第一0是距左边距离，第二0是距上边距离，
        button2.setCompoundDrawables(drawable2, null, null, null);//只放左边
        //按钮左图大小
        Button button3 = (Button) findViewById(R.id.button_chatperson3);
        Drawable drawable3 = getResources().getDrawable(R.drawable.zuchengxi);
        drawable3.setBounds(30, 0, 150, 120);//第一0是距左边距离，第二0是距上边距离，
        button3.setCompoundDrawables(drawable3, null, null, null);//只放左边

    }


}
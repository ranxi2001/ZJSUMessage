package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Faculty_Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_contact);
        Button button_edu= findViewById(R.id.mange_edu);
        Button button_pripage=findViewById(R.id.pri_page);
        ImageButton button_facultycon_back = findViewById(R.id.fac_con_back);
        button_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//管工学院按钮进入管工学院
                Toast.makeText(Faculty_Contact.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Faculty_Contact.this, WorkStationActivity.class);
                startActivity(intent);
            }
        });

        //返回按钮跳转回到主界面
        button_pripage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Faculty_Contact.this,"正在返回通讯录",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Faculty_Contact.this, AddressbookActivity.class);
                startActivity(intent);
            }
        });

    }
}
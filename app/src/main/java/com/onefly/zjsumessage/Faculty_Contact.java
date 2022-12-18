package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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
        Button button_edu= findViewById(R.id.mange_edu);        //管工学院
        ImageButton button_facultycon_back = findViewById(R.id.grade_con_back);

        //弄点学院院徽
        //按钮左图大小
        Button button1 = (Button) findViewById(R.id.mange_edu);
        Drawable drawable1 = getResources().getDrawable(R.mipmap.ggxy);
        drawable1.setBounds(50, 0, 180, 130);//第一是距左边距离，第二是距上边距离，
        button1.setCompoundDrawables(drawable1, null, null, null);//只放左边
        Button button2 = (Button) findViewById(R.id.mercy_edu);
        Drawable drawable2 = getResources().getDrawable(R.drawable.charity);
        drawable2.setBounds(30, 0, 200, 170);//第一0是距左边距离，第二0是距上边距离，
        button2.setCompoundDrawables(drawable2, null, null, null);//只放左边
        Button button3 = (Button) findViewById(R.id.math_edu);
        Drawable drawable3 = getResources().getDrawable(R.drawable.math);
        drawable3.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button3.setCompoundDrawables(drawable3, null, null, null);//只放左边
        Button button4 = (Button) findViewById(R.id.infomation_edu);
        Drawable drawable4 = getResources().getDrawable(R.drawable.information);
        drawable4.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button4.setCompoundDrawables(drawable4, null, null, null);//只放左边
        Button button5 = (Button) findViewById(R.id.eco_edu);
        Drawable drawable5 = getResources().getDrawable(R.drawable.economics);
        drawable5.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button5.setCompoundDrawables(drawable5, null, null, null);//只放左边
        Button button6 = (Button) findViewById(R.id.computer_edu);
        Drawable drawable6 = getResources().getDrawable(R.drawable.computer);
        drawable6.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button6.setCompoundDrawables(drawable6, null, null, null);//只放左边

        button_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//管工学院按钮进入管工学院
                Toast.makeText(Faculty_Contact.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Faculty_Contact.this, CollegeTeacherActivity.class);
                startActivity(intent);
            }
        });

        //返回按钮跳转回到主界面
        button_facultycon_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Faculty_Contact.this,"正在返回通讯录",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Faculty_Contact.this, AddressbookActivity.class);
                startActivity(intent);
            }
        });

    }
}
package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Shangda_Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shangda_student);
        //setContentView(R.layout.activity_buffer_contact);
        //线程缓冲区组件
        //TextView button_buff_schoolname=findViewById(R.id.which_school);
        //线程缓冲区组件

        Button button_2016=findViewById(R.id.grade2016);  //2016年级按钮
        Button button_2017=findViewById(R.id.grade2017);  //2017年级按钮
        Button button_2018=findViewById(R.id.grade2018);  //2018年级按钮
        Button button_2019=findViewById(R.id.grade2019);  //2019年级按钮
        Button button_2020=findViewById(R.id.grade2020);  //2020年级按钮
        Button button_2021=findViewById(R.id.grade2021); //2021年级按钮

        Intent temp_intent=getIntent();  //获取跳转前的学院页面 ，定义为中间页面
        String School_name = temp_intent.getStringExtra("School_infomation"); //学院名获取
        Log.d("Shangda_Student",School_name);
       //2016年级--------------------部分的编写----------------------------------------------------
        button_2016.setOnClickListener(new View.OnClickListener() {//点击2016级开始跳转
            @Override
            public void onClick(View v) {
                String grade_information = (String) button_2016.getText().toString();
                Intent intent_grade2016 =new Intent(Shangda_Student.this,Buffer_contact.class);
                intent_grade2016.putExtra("grade_information",grade_information);
                intent_grade2016.putExtra("School_infomation",School_name);
                startActivity(intent_grade2016);

            }
        });
        //2016年级--------------------部分的编写----------------------------------------------------

















       // ImageButton grade_back= findViewById(R.id.grade_con_back);//返回键
      //  grade_back.setOnClickListener(new View.OnClickListener() {//从年级页面返回学院页面
          //  @Override
            //public void onClick(View v) {
              //  Intent intent_back=new Intent(Shangda_Student.this, CollegeStudentActivity.class);
                //startActivity(intent_back);
         //   }
      //  });
    }
}
package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CollegeTeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_teacher);

        Button fy_tutor=findViewById(R.id.button_tutor1); //fengyi
        fy_tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mange_edu_teacher.this,"正在进入",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(CollegeTeacherActivity.this, tutor_personpage.class);
                startActivity(intent);
            }
        });
        //返回上一级
        ImageButton mange_edu_back=findViewById(R.id.button_teacher_back);//返回键
        mange_edu_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CollegeTeacherActivity.this,Faculty_Contact.class);
                startActivity(intent);
            }
        });

    }
}
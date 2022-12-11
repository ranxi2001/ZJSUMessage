package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Shangda_Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shangda_student);
        ImageButton grade_back= findViewById(R.id.grade_con_back);
        grade_back.setOnClickListener(new View.OnClickListener() {//从年级页面返回学院页面
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Shangda_Student.this, CollegeStudentActivity.class);
                startActivity(intent);
            }
        });
    }
}
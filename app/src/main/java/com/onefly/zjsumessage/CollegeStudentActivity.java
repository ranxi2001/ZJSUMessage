package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CollegeStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_student);
        Button button_manage= findViewById(R.id.mange_edu1);        //管工学院
        button_manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//管工学院按钮进入管工学院
                Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_manage.getText().toString();
               //Log.d("CollegeStudentActivity",School_information);
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);
                startActivity(intent_school);
            }
        });















        //返回部分不用处理，封死即可
        ImageButton button_collegecon_back = findViewById(R.id.college_con_back);
//返回按钮跳转回到通讯录
        button_collegecon_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CollegeStudentActivity.this, AddressbookActivity.class);
                startActivity(intent);
            }
        });
    }
}

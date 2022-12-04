package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class mange_edu_teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mange_edu_teacher);
        ImageButton mange_edu_back=findViewById(R.id.edu_teacher_back);//返回键
        Button fy_tutor=findViewById(R.id.tutor1); //fengyi



        fy_tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mange_edu_teacher.this,"正在进入",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(mange_edu_teacher.this, tutor_personpage.class);
                startActivity(intent);
            }
        });

    }
}
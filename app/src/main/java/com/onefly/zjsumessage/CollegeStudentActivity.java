package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        Button button_mercy =findViewById(R.id.mercy_edu1);          //慈善学院
        Button button_math =findViewById(R.id.math_edu1);            //数学学院
        Button button_info =findViewById(R.id.infomation_edu1);       //信息学院
        Button button_eco =findViewById(R.id.eco_edu1);               //经济学院
        Button button_cp=findViewById(R.id.computer_edu1);            //计算机学院







        //----------------进入管工学院之后-----------------------------------------------------------
        button_manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//管工学院按钮进入管工学院
                Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_manage.getText();
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);//读取学院按钮text，传到下个页面
                startActivity(intent_school);
            }
        });

        //-------------------------------管工学院部分------------------------------------------------

        //---------------------------------进入慈善学院之后------------------------------
        button_mercy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_mercy.getText();
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);//读取学院按钮text，传到下个页面
                startActivity(intent_school);
            }
        });
        //--------------------------------------------------------------------------------------

        //------------------------------------数院----------------------------------------------

        button_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_math.getText();
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);//读取学院按钮text，传到下个页面
                startActivity(intent_school);
            }
        });
       //-----------------------------------数院--------------------------------------------------
       //-------------------------------------信息学院-------------------------------
        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_info.getText();
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);//读取学院按钮text，传到下个页面
                startActivity(intent_school);
            }
        });
    //--------------------------------------信息学院------------------------------------------------------

        //--------------------------------经济学院-----------------------------------------------------
        button_eco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_eco.getText();
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);//读取学院按钮text，传到下个页面
                startActivity(intent_school);
            }
        });

        //----------------------------------经济学院-----------------------------------------------------------

        //----------------------------------计算机学院-------------------------------------------
        button_cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(CollegeStudentActivity.this,"正在进入管工学院",Toast.LENGTH_SHORT).show();
                String School_information = (String) button_cp.getText();
                Intent intent_school=new Intent(CollegeStudentActivity.this, Shangda_Student.class);
                intent_school.putExtra("School_information",School_information);//读取学院按钮text，传到下个页面
                startActivity(intent_school);
            }
        });
        //---------------------------------计算机学院-----------------------------------------------------








        //返回部分不用处理，封死即可
        ImageButton button_collegecon_back = findViewById(R.id.college_con_back);
//返回按钮跳转回到通讯录
        button_collegecon_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent back_address=new Intent(CollegeStudentActivity.this,AddressbookActivity.class);
                    startActivity(back_address);
            }
        });
    }
}

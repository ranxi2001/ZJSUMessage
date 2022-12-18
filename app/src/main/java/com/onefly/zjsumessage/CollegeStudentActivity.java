package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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
        Button button_cp=findViewById(R.id.computer_edu1);            //信电学院

        //弄点学院院徽
        //按钮左图大小
        Button button1 = (Button) findViewById(R.id.mange_edu1);
        Drawable drawable1 = getResources().getDrawable(R.mipmap.ggxy);
        drawable1.setBounds(50, 0, 180, 130);//第一是距左边距离，第二是距上边距离，
        button1.setCompoundDrawables(drawable1, null, null, null);//只放左边
        Button button2 = (Button) findViewById(R.id.mercy_edu1);
        Drawable drawable2 = getResources().getDrawable(R.drawable.charity);
        drawable2.setBounds(30, 0, 200, 170);//第一0是距左边距离，第二0是距上边距离，
        button2.setCompoundDrawables(drawable2, null, null, null);//只放左边
        Button button3 = (Button) findViewById(R.id.math_edu1);
        Drawable drawable3 = getResources().getDrawable(R.drawable.math);
        drawable3.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button3.setCompoundDrawables(drawable3, null, null, null);//只放左边
        Button button4 = (Button) findViewById(R.id.infomation_edu1);
        Drawable drawable4 = getResources().getDrawable(R.drawable.information);
        drawable4.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button4.setCompoundDrawables(drawable4, null, null, null);//只放左边
        Button button5 = (Button) findViewById(R.id.eco_edu1);
        Drawable drawable5 = getResources().getDrawable(R.drawable.economics);
        drawable5.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button5.setCompoundDrawables(drawable5, null, null, null);//只放左边
        Button button6 = (Button) findViewById(R.id.computer_edu1);
        Drawable drawable6 = getResources().getDrawable(R.drawable.computer);
        drawable6.setBounds(45, 0, 190, 145);//第一0是距左边距离，第二0是距上边距离，
        button6.setCompoundDrawables(drawable6, null, null, null);//只放左边




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

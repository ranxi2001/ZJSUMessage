package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SDTX_person_buff extends AppCompatActivity {
    public static final int SDTX_person=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdtx_person_buff);
        //---------------获取上个界面的信息-----------------------------------
        Intent buff_temp= getIntent();
        String School_information= buff_temp.getStringExtra("School_information"); //学员信息
        String grade_information =buff_temp.getStringExtra("grade_information");   //年级信息
        String class_information = buff_temp.getStringExtra("class_information");  //班级信息
        String gradeclass=grade_information+class_information;    //年级+班级

        //----------------获取上个界面的信息--------------------------------------

        //----------------back键位--------------------------------------------------------
        ImageButton SDTX_back=findViewById(R.id.SDTX_buff_back);
       //-----------------back------------------------------------------------------------

        //-----------把两个TextView加载进来跑线程-----------------------------------
        TextView School_name =findViewById(R.id.School_name);    //学院名
        TextView grade_class=findViewById(R.id.grade_class);     //年级+班级
        //----------把两个TextView加载进来跑线程------------------------------------
        //--------------------单线程---------------------------------------------------------

        Handler handler =new Handler(){
            public  void handleMessage(Message msg){
                switch(msg.what){
                    case SDTX_person://线程里需要的操作
                        // 年级 grade_information
                        //学院  School_information
                        //班级 class_information
                        School_name.setText(School_information);   //xx学院
                        grade_class.setText(gradeclass); //xx学院xx年级


                        break;
                    default:
                        break;
                }
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                message.what=SDTX_person;
                handler.sendMessage(message);
            }
        }).start();
        //--------------------单线程-----------------------------------------------------

        //----------------------返回键--------------------------------------------------
        SDTX_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //---------------------返回键------------------------------------------------
    }
}
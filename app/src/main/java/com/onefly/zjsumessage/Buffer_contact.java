package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Buffer_contact extends AppCompatActivity {
   public static final int buff=1;
   //此class主要解决 系名和班级名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffer_contact);
        TextView buff_school_name=findViewById(R.id.which_school);     //学院名称title
        TextView buff_composed = findViewById(R.id.class1);       //存放xx学院xx年级
        TextView class1=findViewById(R.id.real_class1);   //第一个班级textview的赋值
        ImageButton buff_back=findViewById(R.id.button_buffer_back);   //返回键


        //---------------------------取出上个界面的信息-------------------------------------------
        Intent buffer_intent = getIntent();
        String grade_infomation=buffer_intent.getStringExtra("grade_information");
        String School_information = buffer_intent.getStringExtra("School_information");
        String school_grade = grade_infomation+School_information ;  //class1的xx学院xx年级

        //--------------------------上一块主要是存放需要用到的字符串信息------------------------------




        //Log.d("Buffer_contact",School_information);

        //----------------------------------编写UI界面的线程----------------------------------------
        Handler handler =new Handler(){
            public  void handleMessage(Message msg){
                switch(msg.what){
                    case buff://线程里需要的操作
                        // 年级 grade_information
                        //学院  School_information

                        buff_school_name.setText(School_information);   //xx学院
                        buff_composed.setText(school_grade); //xx学院xx年级
                        //接下来根据学院查询班级（一般有三个班级)

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
                message.what=buff;
                handler.sendMessage(message);
            }
        }).start();
        //---------------------更改UI界面的线程编写完毕-------------------------------------

        //---------------------接下来编写按钮的跳转-----------------------------------------







       //----------------------按钮的跳转编写完毕-----------------------------------------


        //------------------------------返回上个界面------------------------------
        buff_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //------------------------------返回上个界面----------------------------

    }
}
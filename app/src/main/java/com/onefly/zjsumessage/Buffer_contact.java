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
   public static final int buff=1;   //线程无需和任何按钮关联，直接调用！
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffer_contact);
        TextView buff_school_name=findViewById(R.id.which_school);  //主标题---显示学院名
        TextView buff_grade1 = findViewById(R.id.real_class1);//第一个系班级
        TextView buff_grade2=findViewById(R.id.class2);//第二个系班级

        ImageButton buff_back=findViewById(R.id.button_buffer_back);

        Intent buffer_intent = getIntent();
        String grade_infomation=buffer_intent.getStringExtra("grade_information");//年级信息获取
        String School_information = buffer_intent.getStringExtra("School_infomation");//学院名称
        //Log.d("Buffer_contact",School_information);
        //-------------------------从年级界面跳进来就要改Title----------------------------------
        Handler handler =new Handler(){
            public  void handleMessage(Message msg){
                switch(msg.what){
                    case buff:
                        buff_school_name.setText(School_information);
                        buff_grade1.setText("");
                        buff_grade2.setText("");
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
                message.what=buff;//启动标志，默认
                handler.sendMessage(message);
            }
        }).start();
        //---------------------------------------------------------------------------------
        //返回间back的编写
        buff_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent frombuffback = new Intent(Buffer_contact.this,Shangda_Student.class);
                startActivity(frombuffback);
            }
        });

    }
}
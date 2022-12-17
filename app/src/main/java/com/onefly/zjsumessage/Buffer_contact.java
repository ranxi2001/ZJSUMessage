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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffer_contact);
        TextView buff_school_name=findViewById(R.id.which_school);     //学院名称title
        TextView class1=findViewById(R.id.real_class1);   //第一个班级textview的赋值
        ImageButton buff_back=findViewById(R.id.button_buffer_back);   //返回键

        Intent buffer_intent = getIntent();
        String grade_infomation=buffer_intent.getStringExtra("grade_information");
        String School_information = buffer_intent.getStringExtra("School_information");
        //Log.d("Buffer_contact",School_information);
        Handler handler =new Handler(){
            public  void handleMessage(Message msg){
                switch(msg.what){
                    case buff:
                        buff_school_name.setText(School_information);

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
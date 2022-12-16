package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class Buffer_contact extends AppCompatActivity {
   public static final int buff=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buffer_contact);
        TextView buff_school_name=findViewById(R.id.which_school);


        Intent buffer_intent = getIntent();
        String grade_infomation=buffer_intent.getStringExtra("grade_information");
        String School_information = buffer_intent.getStringExtra("School_infomation");
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
    }
}
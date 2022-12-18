package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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

        //-------------------------------按钮部分加载--------------------------------------
        Button pclass1 =findViewById(R.id.class1_stu1);         //第一个系第一个班级
        Button pclass2 =findViewById(R.id.class1_stu2);         //第一个系第二个班级

        Button pclass3 =findViewById(R.id.class2_stu1);         //第二个系第一个班级
        Button pclass4 =findViewById(R.id.class2_stu2);         //第二个系第二个班级

        Button pclass5 =findViewById(R.id.class3_stu1);         //第二个系第一个班级
        Button pclass6 =findViewById(R.id.class3_stu2);         //第二个系第二个班级





        //-------------------------------按钮部分加载--------------------------------------


        //---------------------------取出上个界面的信息-------------------------------------------
        Intent buffer_intent = getIntent();
        String grade_infomation=buffer_intent.getStringExtra("grade_information");
        String School_information = buffer_intent.getStringExtra("School_information");
        String school_grade = School_information+grade_infomation ;  //xx学院xx年级
            //通过数据库的查询获得pclass1~pclass6的名字字符串：eg.信息2002
                String class_information ="信息2002";

            //通过数据库的查询获得pclass1~pclass6的名字字符串：eg.信息2002

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
        //---第一个班级-------------------------------------------------------------------
        pclass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSDTX_buff = new Intent(Buffer_contact.this,SDTX_person_buff.class);
                toSDTX_buff.putExtra("School_infomation",School_information);//学院名
                toSDTX_buff.putExtra("grade_information",grade_infomation);//年级
                toSDTX_buff.putExtra("class_information",class_information);//班级信息
                startActivity(toSDTX_buff);

            }
        });









        //---第一个班级-------------------------------------------------------------------






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
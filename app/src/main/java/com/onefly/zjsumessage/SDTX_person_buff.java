package com.onefly.zjsumessage;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import cn.leancloud.LCObject;
import cn.leancloud.LCQuery;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SDTX_person_buff extends AppCompatActivity {
    public static final int SDTX_person=1;

    Button[] buttons=new Button[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdtx_person_buff);
        //---------------获取上个界面的信息-----------------------------------
        Intent buff_temp= getIntent();
        String School_information= buff_temp.getStringExtra("School_information"); //学院信息
        String grade_information =buff_temp.getStringExtra("grade_information");   //年级信息
        String class_information = buff_temp.getStringExtra("class_information");  //班级信息
        String gradeclass=grade_information+class_information;    //年级+班级
        buttons[1]=findViewById(R.id.mate1);
        buttons[2]=findViewById(R.id.mate2);
        buttons[3]=findViewById(R.id.mate3);
        buttons[4]=findViewById(R.id.mate4);
        buttons[5]=findViewById(R.id.mate5);
        buttons[6]=findViewById(R.id.mate6);
        buttons[7]=findViewById(R.id.mate7);
        buttons[8]=findViewById(R.id.mate8);
        buttons[9]=findViewById(R.id.mate9);
        buttons[10]=findViewById(R.id.mate10);
        buttons[11]=findViewById(R.id.mate11);
        buttons[12]=findViewById(R.id.mate12);
        buttons[13]=findViewById(R.id.mate13);
        buttons[14]=findViewById(R.id.mate14);

        Intent intent =getIntent();
        String userId=intent.getStringExtra("userId");


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
        LCQuery<LCObject> query =new LCQuery<>("Student");
        query.whereEqualTo("grade",grade_information);
        query.whereEqualTo("class",class_information);
        query.findInBackground().subscribe(new Observer<List<LCObject>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<LCObject> lcObjects) {

                int k=lcObjects.size();
                int number_user=k;
                int number_button=14;
                int ipoint=0;
                int ip=1;
                while(k>0&&number_button>0&&ipoint<number_user&&ip<14){
                    buttons[ip].setText(lcObjects.get(ipoint).getString("name"));
                    ip++;
                    ipoint++;
                    k--;
                    number_button--;
                }


            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[1].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("userId",userId);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[2].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[3].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[4].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[5].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[6].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[7].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[8].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[9].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[10].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[11].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[12].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[13].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

        buttons[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = buttons[14].getText().toString();
                String institute = School_information;
                Intent intent =new Intent(SDTX_person_buff.this,ChatActivity.class);
                intent.putExtra("userId",userId);
                intent.putExtra("name",name);
                intent.putExtra("institute",institute);
                startActivity(intent);
            }
        });

    }
}
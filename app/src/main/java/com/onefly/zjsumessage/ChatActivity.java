package com.onefly.zjsumessage;

import static com.onefly.zjsumessage.R.layout.activity_chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

import cn.leancloud.LCObject;
import cn.leancloud.LCQuery;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ChatActivity extends AppCompatActivity {
    ImageButton btnSend;
    EditText messageText;
    messageDao messageDao;
    TextView name_text,tv6;
    TextView[] textViews=new TextView[1000];
    //int mid=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_chat);
        tv6=findViewById(R.id.textView6);
        name_text=findViewById(R.id.textView_chatobj);
        Intent intent =getIntent();
        String institute=intent.getStringExtra("institute");
        String name_user=intent.getStringExtra("name");
        String name_del_user=intent.getStringExtra("userId");
        name_text.setText(name_user);
        tv6.setText(institute);

        btnSend = findViewById(R.id.imageButton_send);
        messageText = findViewById(R.id.editText_chat);
        textViews[1]=findViewById(R.id.textView23);
        textViews[2]=findViewById(R.id.textView24);
        textViews[3]=findViewById(R.id.textView28);
        textViews[4]=findViewById(R.id.textView29);
        textViews[5]=findViewById(R.id.textView30);
        textViews[6]=findViewById(R.id.textView31);
        textViews[7]=findViewById(R.id.textView32);
        textViews[8]=findViewById(R.id.textView33);
        textViews[9]=findViewById(R.id.textView34);
        textViews[10]=findViewById(R.id.textView35);
        textViews[11]=findViewById(R.id.textView36);
        textViews[12]=findViewById(R.id.textView37);
        textViews[13]=findViewById(R.id.textView38);
        textViews[14]=findViewById(R.id.textView39);
        textViews[15]=findViewById(R.id.textView40);

        String username_del=name_del_user;
        String username=name_user;

        //final String[] password_true = new String[1000];

        LCQuery<LCObject> query =new LCQuery<>("message");
        query.whereContainedIn("username_del", Arrays.asList(username,username_del));
        query.whereContainedIn("username",Arrays.asList(username,username_del));
        query.orderByDescending("createdAt");
        query.findInBackground().subscribe(new Observer<List<LCObject>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<LCObject> lcObjects) {
                int number_text=15;//布局中的text最大数量
                int k=lcObjects.size();
                int number_message=k;
                int ipoint=0;
                while(k>0&&number_text>0&&ipoint<number_message){
                    textViews[k].setText(lcObjects.get(ipoint).getString("message_send"));
                    ipoint++;
                    k--;
                    number_text--;
                }

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });


        btnSend.setOnClickListener(v->{

            String message_send=messageText.getText().toString();
            LCObject message=new LCObject("message");
            message.put("username_del",username_del);
            message.put("username",username);
            message.put("message_send",message_send);
            message.saveInBackground().subscribe(new Observer<LCObject>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(LCObject lcObject) {
                    System.out.println("保存成功");
                }

                @Override
                public void onError(Throwable e) {
                    System.out.println("保存失败");
                }

                @Override
                public void onComplete() {

                }
            });

            LCQuery<LCObject> query1 =new LCQuery<>("message");
            query1.whereContainedIn("username_del", Arrays.asList(username,username_del));
            query1.whereContainedIn("username",Arrays.asList(username,username_del));
            query1.orderByDescending("createdAt");
            query1.findInBackground().subscribe(new Observer<List<LCObject>>() {
                @Override
                public void onSubscribe(Disposable d) {

                }

                @Override
                public void onNext(List<LCObject> lcObjects) {
                    int number_text=15;//布局中的text最大数量
                    int k=lcObjects.size();
                    while(k>0&&number_text>0){
                        textViews[k].setText(lcObjects.get(0).getString("message_send"));
                        k--;
                        number_text--;
                    }

                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onComplete() {

                }
            });

        });

//        final String[] message = new String[1];
//
//        LCQuery<LCObject> query =new LCQuery<>("Account");
//        query.whereEqualTo("username",username);
//        query.findInBackground().subscribe(new Observer<List<LCObject>>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(List<LCObject> lcObjects) {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

//        String username="ranxi";
//        String username_del="yuchaoyang";
//        messageDao = messageDatabase.getInstance(this).messageDao();
//
//        //String message_current=getMessage(username,username_del);
//        //tv1.setText(message_current);
//
//        updatediary(name_del_user,name_user);
//
//        btnSend.setOnClickListener(v->{
//
//            String message_send=messageText.getText().toString();
//
//
//            if(addmessage(message_send,username,username_del)){
//                Toast.makeText(this, "发送成功", Toast.LENGTH_SHORT).show();
//            }
//            else{
//                Toast.makeText(this,"发送失败",Toast.LENGTH_SHORT).show();
//            }
//            updatediary(name_del_user,name_user);
//            //String message_current1=getMessage(username,username_del);
//            //tv2.setText(message_current1);
//        });

        //从聊天页面返回消息页面
        ImageButton button_return = (ImageButton) findViewById(R.id.imageButton_backmessage);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChatActivity.this, MessageActivity.class);
                intent.putExtra("userId",name_del_user);
                startActivity(intent);
            }
        });









    }

//    private void updatediary(String name_del_user,String name_user) {
//        List<message> messageList=messageDao.getAll();//列表数据拉取
//        int len=messageList.size();
//        int k=len-5;
//        message message1,message2,message3,message4,message5;
//        message1=messageList.get(k);
//        k++;
//        tv1.setText(name_del_user+"->"+name_user+":  "+message1.message_send);
//        message2=messageList.get(k);
//        k++;
//        tv2.setText(name_del_user+"->"+name_user+":  "+message2.message_send);
//        message3=messageList.get(k);
//        k++;
//        tv3.setText(name_del_user+"->"+name_user+":  "+message3.message_send);
//        message4=messageList.get(k);
//        k++;
//        tv4.setText(name_del_user+"->"+name_user+":  "+message4.message_send);
//        message5=messageList.get(k);
//        k++;
//        tv5.setText(name_del_user+"->"+name_user+":  "+message5.message_send);
//    }

    boolean addmessage(String message_send,String username, String username_del) {

        message message1=new message();

        message1.username = username;
        message1.username_del = username_del;
        message1.message_send = message_send;
        messageDao.insertAll(message1);
        return true;

    }

    String getMessage(String username,String username_del){
        message message= messageDao.findByName(username);
        return message.message_send;
    }


}
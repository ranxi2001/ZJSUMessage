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

public class ChatActivity extends AppCompatActivity {
    ImageButton btnSend;
    EditText messageText;
    messageDao messageDao;
    TextView tv1,tv2,tv3,tv4,tv5,name_text,tv6;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_chat);

        tv6=findViewById(R.id.textView6);
        name_text=findViewById(R.id.textView_chatobj);
        Intent intent =getIntent();
        String institute=intent.getStringExtra("institute");
        String name_user=intent.getStringExtra("name");
        name_text.setText(name_user);
        tv6.setText(institute);
        btnSend = findViewById(R.id.imageButton_send);
        messageText = findViewById(R.id.editText_chat);
        tv1=findViewById(R.id.textView18);
        tv2=findViewById(R.id.textView22);
        String username="ranxi";
        String username_del="yuchaoyang";
        messageDao = messageDatabase.getInstance(this).messageDao();
        String message_current=getMessage(username,username_del);
        tv1.setText(message_current);

        btnSend.setOnClickListener(v->{

            String message_send=messageText.getText().toString();


            if(addmessage(message_send,username,username_del)){
                Toast.makeText(this, "发送成功", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"发送失败",Toast.LENGTH_SHORT).show();
            }

            String message_current1=getMessage(username,username_del);
            tv2.setText(message_current1);
        });

        //从聊天页面返回消息页面
        ImageButton button_return = (ImageButton) findViewById(R.id.imageButton_backmessage);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChatActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });









    }

    boolean addmessage(String message_send,String username, String username_del) {
        if (messageDao.findByName(username) == null) {
            message message1=new message();
            message1.username = username;
            message1.username_del = username_del;
            message1.message_send = message_send;
            messageDao.insertAll(message1);
            return true;
        }

        return false;
    }

    String getMessage(String username,String username_del){
        message message= messageDao.findByName(username);
        return message.message_send;
    }


}
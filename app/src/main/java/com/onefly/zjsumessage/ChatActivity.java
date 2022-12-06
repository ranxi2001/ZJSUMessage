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

import java.util.List;

public class ChatActivity extends AppCompatActivity {
    ImageButton btnSend;
    EditText messageText;
    messageDao messageDao;
    TextView tv1,tv2,tv3,tv4,tv5,name_text,tv6;
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
        name_text.setText(name_user);
        tv6.setText(institute);

        btnSend = findViewById(R.id.imageButton_send);
        messageText = findViewById(R.id.editText_chat);
        tv1=findViewById(R.id.textView18);
        tv2=findViewById(R.id.textView22);
        tv3=findViewById(R.id.textView20);
        tv4=findViewById(R.id.textView23);
        tv5=findViewById(R.id.textView24);

        String username="ranxi";
        String username_del="yuchaoyang";
        messageDao = messageDatabase.getInstance(this).messageDao();

        //String message_current=getMessage(username,username_del);
        //tv1.setText(message_current);

        updatediary();

        btnSend.setOnClickListener(v->{

            String message_send=messageText.getText().toString();


            if(addmessage(message_send,username,username_del)){
                Toast.makeText(this, "发送成功", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"发送失败",Toast.LENGTH_SHORT).show();
            }
            updatediary();
            //String message_current1=getMessage(username,username_del);
            //tv2.setText(message_current1);
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

    private void updatediary() {
        List<message> messageList=messageDao.getAll();//列表数据拉取
        int len=messageList.size();
        int k=len-5;
        message message1,message2,message3,message4,message5;
        message1=messageList.get(k);
        k++;
        tv1.setText(message1.username+"->"+message1.username_del+":  "+message1.message_send);
        message2=messageList.get(k);
        k++;
        tv2.setText(message2.username+"->"+message2.username_del+":  "+message2.message_send);
        message3=messageList.get(k);
        k++;
        tv3.setText(message3.username+"->"+message3.username_del+":  "+message3.message_send);
        message4=messageList.get(k);
        k++;
        tv4.setText(message4.username+"->"+message4.username_del+":  "+message4.message_send);
        message5=messageList.get(k);
        k++;
        tv5.setText(message5.username+"->"+message5.username_del+":  "+message5.message_send);
    }

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
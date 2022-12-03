package com.onefly.zjsumessage;

import static com.onefly.zjsumessage.R.layout.activity_chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_chat);

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



}
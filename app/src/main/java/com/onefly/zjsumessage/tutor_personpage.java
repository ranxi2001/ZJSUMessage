package com.onefly.zjsumessage;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class tutor_personpage extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_personpage);
        btn=findViewById(R.id.button_startchat_fy);
        Intent intent =new Intent(tutor_personpage.this,ChatActivity.class);
        String name_fy="封毅";
        String institute="管工学院";
        intent.putExtra("institute",institute);
        intent.putExtra("name",name_fy);
        startActivity(intent);
    }
}
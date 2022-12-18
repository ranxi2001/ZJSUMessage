package com.onefly.zjsumessage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //返回我的按钮
        ImageButton button_return = (ImageButton) findViewById(R.id.imageButton_return_setting);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this,"正在进入我的",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SettingActivity.this,MineActivity.class);
                startActivity(intent);
            }
        });
        //跳转到隐私按钮
        Button button_privacy = (Button) findViewById(R.id.button_privacy);
        button_privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this,PrivacyActivity.class);
                startActivity(intent);
            }
        });







    }

}
package com.onefly.zjsumessage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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

        //跳转到设置按钮
        ImageButton button_return = (ImageButton) findViewById(R.id.imageButton_returnmine);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this,"正在进入我的",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SettingActivity.this,MineActivity.class);
                startActivity(intent);
            }
        });












    }

}
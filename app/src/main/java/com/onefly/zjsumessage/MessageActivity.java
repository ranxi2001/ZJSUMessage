package com.onefly.zjsumessage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ImageButton button_workstation = (ImageButton) findViewById(R.id.imageButton_workstation);
        button_workstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MessageActivity.this,"正在进入工作台",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MessageActivity.this, WorkStaionActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "正在进入通讯系统", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MessageActivity.this, ChatActivity.class);
                startActivity(intent);
                break;
            case R.id.remove_item:
                Toast.makeText(this, "正在进入文件传输系统", Toast.LENGTH_SHORT).show();
                Intent intent1 =new Intent(MessageActivity.this,file_transfer.class);
                startActivity(intent1);
                break;
            case R.id.apk:
                Toast.makeText(this,"正在返回主界面",Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(MessageActivity.this,file_transfer.class);
            default:
        }
        return true;

    }
}
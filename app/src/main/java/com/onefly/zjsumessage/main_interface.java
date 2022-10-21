package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class main_interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "正在进入通讯系统", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(main_interface.this,communicate.class);
                startActivity(intent);
                break;
            case R.id.remove_item:
                Toast.makeText(this, "正在进入文件传输系统", Toast.LENGTH_SHORT).show();
                Intent intent1 =new Intent(main_interface.this,file_transfer.class);
                startActivity(intent1);
                break;
            case R.id.apk:
                Toast.makeText(this,"正在返回主界面",Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(main_interface.this,file_transfer.class);
            default:
        }
        return true;

    }
}
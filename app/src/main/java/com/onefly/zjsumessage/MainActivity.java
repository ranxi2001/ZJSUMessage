package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button1 = (Button) findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"欢迎使用商大联系通",Toast.LENGTH_SHORT).show();
//                Intent intent =new Intent("com.example.activitytest.ACTION_START");
//                startActivity(intent);
//            }
//        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "正在进入通讯系统", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,communicate.class);
                startActivity(intent);
                break;
            case R.id.remove_item:
                Toast.makeText(this, "正在进入文件传输系统", Toast.LENGTH_SHORT).show();
                Intent intent1 =new Intent(MainActivity.this,file_transfer.class);
                startActivity(intent1);
                break;
            default:
        }
        return true;

    }
}
package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    private Button btn;
    private EditText ed1,ed2,ed3;
    private LoginActivity.MyDatabaseHelper dbhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=findViewById(R.id.button1);
        ed1=findViewById(R.id.account);
        ed2=findViewById(R.id.password);
        ed3=findViewById(R.id.password1);
        dbhelper=new LoginActivity.MyDatabaseHelper(this,"account.db",null,2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2.getText().toString().equals(ed3.getText().toString())){
                    Toast.makeText(register.this, "账号注册成功！", Toast.LENGTH_SHORT).show();
                    SQLiteDatabase db=dbhelper.getWritableDatabase();
                    ContentValues values=new ContentValues();
                    values.put("account1",ed1.getText().toString());
                    values.put("password",ed2.getText().toString());
                    db.insert("account",null,values);
                    values.clear();
                }
                else{
                    Toast.makeText(register.this,"两次输入密码不一致，请重新输入！",Toast.LENGTH_SHORT).show();
                    ed2.setText("");
                    ed3.setText("");
                }
            }
        });

    }

    public void register2(View view){
        Intent intent =new Intent(register.this,LoginActivity.class);
        startActivity(intent);
    }
}

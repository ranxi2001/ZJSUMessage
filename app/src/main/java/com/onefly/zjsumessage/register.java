package com.onefly.zjsumessage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    private Button btn;
    private EditText ed1,ed2,ed3;
    //private MydatabaseHelper mydatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=findViewById(R.id.button1);
        ed1=findViewById(R.id.account);
        ed2=findViewById(R.id.password);
        ed3=findViewById(R.id.password1);
        //mydatabaseHelper=new MydatabaseHelper(this);
        //mydatabaseHelper.getWritableDatabase();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed2.getText().toString().equals(ed3.getText().toString())){
                    //Toast.makeText(register.this, "账号注册成功！", Toast.LENGTH_SHORT).show();
//                    account_ori p = new account_ori();
//                    p.setAccount(ed1.getText().toString());
//                    p.setPassword(ed2.getText().toString());

                    //long rowed=mydatabaseHelper.insertData(p);
                    //if(rowed!=-1) {
                     //   Toast.makeText(register.this, "添加成功！", Toast.LENGTH_SHORT).show();
                    //}
                    //else{
                    //    Toast.makeText(register.this, "添加失败！！", Toast.LENGTH_SHORT).show();
                    //}

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

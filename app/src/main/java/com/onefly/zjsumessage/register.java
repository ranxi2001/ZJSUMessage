package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    private Button btn;
    private EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=findViewById(R.id.button1);
        ed1=findViewById(R.id.account);
        ed2=findViewById(R.id.password);
        ed3=findViewById(R.id.password1);
        String account =ed1.getText().toString();
        String password=ed2.getText().toString();
        String password1=ed3.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.equals(password1)){
                    Toast.makeText(register.this,"两次输入密码不一致，请重新输入！",Toast.LENGTH_SHORT).show();
                    ed1.setText("");
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
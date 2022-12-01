package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    Button btn;
    EditText ed1,ed2,ed3;
    UserDao userDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn=findViewById(R.id.button1);
        ed1=findViewById(R.id.account);
        ed2=findViewById(R.id.password);
        ed3=findViewById(R.id.password1);

        userDao = AppDatabase.getInstance(this).userDao();


        btn.setOnClickListener(v->{
            String username=ed1.getText().toString();
            String password=ed2.getText().toString();
            String password_confirm=ed3.getText().toString();
            if(!password.equals(password_confirm)){
                Toast.makeText(this, "两次密码不一致！", Toast.LENGTH_SHORT).show();
            }
            else if(addUser(username,password)){
                Toast.makeText(this,"注册成功！",Toast.LENGTH_SHORT).show();
                finish();
            }
            else{
                Toast.makeText(this,"注册失败！",Toast.LENGTH_SHORT).show();
            }
        });



    }

    boolean addUser(String username, String password) {
        if (userDao.findByName(username) == null) {
            User user = new User();
            user.username = username;
            user.password = password;
            userDao.insertAll(user);
            return true;
        }

        return false;
    }

    public void register2(View view){
        Intent intent =new Intent(register.this,LoginActivity.class);
        startActivity(intent);
    }
}

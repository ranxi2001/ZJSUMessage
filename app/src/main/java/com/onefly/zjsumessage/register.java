package com.onefly.zjsumessage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.leancloud.LCObject;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableCache;

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

        LCObject user = new LCObject("Account");

// 为属性赋值

        btn.setOnClickListener(v->{
            String username=ed1.getText().toString();
            String password=ed2.getText().toString();
            String password_confirm=ed3.getText().toString();
            user.put("username",   username);
            user.put("password", password);
            if(password.equals(password_confirm)){
                user.saveInBackground().subscribe(new Observer<LCObject>() {
                    public void onSubscribe(Disposable disposable) {}
                    public void onNext(LCObject user) {
                        // 成功保存之后，执行其他逻辑
                        System.out.println("保存成功。objectId：" + user.getObjectId());
                        Toast.makeText(register.this, "注册成功", Toast.LENGTH_SHORT).show();
                        Intent intent =new Intent(register.this,LoginActivity.class);
                        startActivity(intent);
                    }
                    public void onError(Throwable throwable) {
                        System.out.println("保存失败");
                        Toast.makeText(register.this, "注册失败", Toast.LENGTH_SHORT).show();
                        // 异常处理
                    }
                    public void onComplete() {}
                });
            }

// 将对象保存到云端

        });


        //userDao = AppDatabase.getInstance(this).userDao();






//        btn.setOnClickListener(v->{
//            String username=ed1.getText().toString();
//            String password=ed2.getText().toString();
//            String password_confirm=ed3.getText().toString();
//            if(!password.equals(password_confirm)){
//                Toast.makeText(this, "两次密码不一致！", Toast.LENGTH_SHORT).show();
//            }
//            else if(addUser(username,password)){
//                Toast.makeText(this,"注册成功！",Toast.LENGTH_SHORT).show();
//                finish();
//            }
//            else{
//                Toast.makeText(this,"注册失败！",Toast.LENGTH_SHORT).show();
//            }
//        });



    }
//注释的代码为原先采用room数据库时调用的代码
//    boolean addUser(String username, String password) {
//        if (userDao.findByName(username) == null) {
//            User user = new User();
//            user.username = username;
//            user.password = password;
//            userDao.insertAll(user);
//            return true;
//        }
//
//        return false;
//    }

    public void register2(View view){
        Intent intent =new Intent(register.this,LoginActivity.class);
        startActivity(intent);
    }
}

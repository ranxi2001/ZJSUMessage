package com.onefly.zjsumessage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import cn.leancloud.LCObject;

public class LoginActivity extends AppCompatActivity {
    private CheckBox rememberPass;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private EditText accountedit;
    private EditText passwordedit;
    private UserDao userDao;
    private static final String TAG = "LoginActivity";
    private static final String USERNAME_KEY = "username";
    private static final String PASSWORD_KEY = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        Button button1 = (Button) findViewById(R.id.button1);
        userDao = AppDatabase.getInstance(this).userDao();
        rememberPass =findViewById(R.id.checkBox3);
        accountedit=findViewById(R.id.account);
        passwordedit=findViewById(R.id.password);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=accountedit.getText().toString();
                String password=passwordedit.getText().toString();
                if (checkLogin(username, password)) {
                    Intent intent = new Intent(LoginActivity.this,MessageActivity.class);
                    intent.putExtra("userId",username);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this,"登录失败！",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    public void register1(View view){
        Intent intent=new Intent(LoginActivity.this,register.class);
        startActivity(intent);
    }

    boolean checkLogin(String username, String password) {
        List<User> users = userDao.getAll();
        for (User user: users) {
            Log.d(TAG, "checkLogin: " + user.username + ": " + user.password);
        }

        User user = userDao.findByName(username);
        return user != null && user.username.equals(username) && user.password.equals(password);
    }
    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        String username = prefs.getString(USERNAME_KEY, "");
        accountedit.setText(username);

        String password = prefs.getString(PASSWORD_KEY, "");
        passwordedit.setText(password);
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        String username = accountedit.getText().toString();
        String password = passwordedit.getText().toString();

        editor.putString(USERNAME_KEY, username);
        editor.putString(PASSWORD_KEY, password);

        editor.apply();
    }

}
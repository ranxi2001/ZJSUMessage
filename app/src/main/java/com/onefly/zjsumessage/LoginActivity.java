package com.onefly.zjsumessage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private CheckBox rememberPass;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private EditText accountedit;
    private EditText passwordedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pref = PreferenceManager.getDefaultSharedPreferences(this);
        Button button1 = (Button) findViewById(R.id.button1);
        rememberPass =findViewById(R.id.checkBox3);
        accountedit=findViewById(R.id.account);
        passwordedit=findViewById(R.id.password);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=accountedit.getText().toString();
                String password=passwordedit.getText().toString();
                if(account.equals("yuchaoyang")&&password.equals("200206")){
                    editor= pref.edit();
                    if(rememberPass.isChecked()){
                        editor.putBoolean("remember_password",true);
                        editor.putString("account",account);
                        editor.putString("password",password);
                    }
                    else{
                        editor.clear();
                    }
                    editor.apply();
                }
                Toast.makeText(LoginActivity.this,"欢迎使用商大联系通",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(LoginActivity.this, MessageActivity.class);
                startActivity(intent);
            }
        });
        Boolean isremember=pref.getBoolean("checkBox3",false);
        if(isremember){
            String account=pref.getString("account","");
            String password=pref.getString("password","");
            accountedit.setText(account);
            passwordedit.setText(password);
        }

    }


}
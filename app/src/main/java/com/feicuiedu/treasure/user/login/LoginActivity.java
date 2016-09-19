package com.feicuiedu.treasure.user.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.feicuiedu.treasure.R;

/**
 * 登陆视图, 纯种视图
 * <p/>
 * 我们的登陆业务， 是不是只要针对LoginView来做就行了
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
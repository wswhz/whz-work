package com.example.myapplication; // 包名

import androidx.appcompat.app.AppCompatActivity; // 导入 AppCompatActivity 类

import android.content.Intent; // 导入 Intent 类
import android.os.Bundle; // 导入 Bundle 类
import android.view.View; // 导入 View 类
import android.widget.TextView; // 导入 TextView 类

public class LoginActivity extends AppCompatActivity { // 登录活动类

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 重写 onCreate() 方法
        super.onCreate(savedInstanceState); // 调用父类的 onCreate() 方法
        setContentView(R.layout.activity_main); // 设置布局文件

        // 获取忘记密码文本框
        TextView tvForgetPwd = (TextView) findViewById(R.id.tvForgetPwd);

        // 设置忘记密码文本框的点击事件
        tvForgetPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // 忘记密码文本框被点击时
                // 创建一个 Intent 对象，跳转到忘记密码活动
                Intent intent = new Intent(LoginActivity.this, ForgetPwdActivity.class);

                // 启动忘记密码活动
                startActivity(intent);
            }
        });

        // 获取 QQ 注册文本框
        TextView tvRegisterQQ = (TextView) findViewById(R.id.tvRegistQQ);

        // 设置 QQ 注册文本框的点击事件
        tvRegisterQQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // QQ 注册文本框被点击时
                // 创建一个 Intent 对象，跳转到 QQ 注册活动
                Intent intent = new Intent(LoginActivity.this, RegisterQQ.class);

                // 启动 QQ 注册活动
                startActivity(intent);
            }
        });
    }
}
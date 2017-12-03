package com.fayne.android.learngreenrobot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fayne.android.learngreenrobot.bean.DaoMaster;
import com.fayne.android.learngreenrobot.bean.DaoSession;
import com.fayne.android.learngreenrobot.bean.User;
import com.fayne.android.learngreenrobot.bean.UserDao;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(getApplicationContext(), "fan.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        UserDao userDao = daoSession.getUserDao();

        User user = new User(null, "zhangsan", "张三");
        userDao.insert(user);
    }
}

package com.example.leeco.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.leeco.myapplication.jsons.UserInfo;
import com.example.leeco.myapplication.jsons.Users;
import com.example.leeco.myapplication.leecoviews.LeecoTextView;
import com.example.leeco.myapplication.utils.PlayVoice;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        LeecoTextView leText = (LeecoTextView) findViewById(R.id.leeco_textView);
        Toast.makeText(this,"toast for debug",Toast.LENGTH_SHORT).show();

//        UserInfo userInfo = new UserInfo();
//        userInfo.setAge(20);
//        userInfo.setName("circle");
//        String jsonStr = JSON.toJSONString(userInfo);
//        String jsonStr = "{\"age\":20,\"name\":\"circle\"}";
//        UserInfo userInfo = JSON.parseObject(jsonStr,UserInfo.class);
//        Log.d(TAG,userInfo.getName() + "---" + userInfo.getAge());

//        Users.MessagesBean messagesBean = new Users.MessagesBean();
//        messagesBean.setName("wang");
//        messagesBean.setGender("nan");
//        messagesBean.setId("one");
//
//        Users.MessagesBean messagesBean1 = new Users.MessagesBean();
//        messagesBean1.setName("yuan");
//        messagesBean1.setGender("nv");
//        messagesBean1.setId("two");
//
//        List<Users.MessagesBean> lists = new ArrayList<Users.MessagesBean>();
//        lists.add(messagesBean);
//        lists.add(messagesBean1);
//        Users users = new Users();
//        users.setMessages(lists);
//
//        String jsonStr = JSON.toJSONString(users);
        String jsonStr = "{\"messages\":[{\"gender\":\"nan\",\"id\":\"one\",\"name\":\"wang\"},{\"gender\":\"nv\",\"id\":\"two\",\"name\":\"yuan\"}]}";
        PlayVoice.getInstance().playVoice(this,"takeabreak.mp3");
        Toast.makeText(this,"",Toast.LENGTH_SHORT).setGravity();
        Log.d(TAG,jsonStr);


    }

}

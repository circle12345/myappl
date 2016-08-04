package com.example.leeco.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.leeco.myapplication.jsons.UserInfo;
import com.example.leeco.myapplication.leecoviews.LeecoTextView;

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
        String jsonStr = "{\"age\":20,\"name\":\"circle\"}";
        //update mainactivity from server
        UserInfo userInfo = JSON.parseObject(jsonStr,)

        Log.d(TAG,userInfo.getName() + "---" + userInfo.getAge());
    }

}

package com.org.rxutillibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.vise.log.ViseLog;
import com.vise.netexpand.request.ApiPostRequest;
import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.callback.ACallback;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.act_tv_test).setOnClickListener(this);
        findViewById(R.id.act_tv_test1).setOnClickListener(this);
        findViewById(R.id.act_tv_test2).setOnClickListener(this);
        findViewById(R.id.act_tv_test3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.act_tv_test:
                test();
                break;
            case R.id.act_tv_test1:
                test1();
                break;
            case R.id.act_tv_test2:

                break;
            case R.id.act_tv_test3:

                break;
        }
    }

    private void test() {
        ViseHttp.BASE(new ApiPostRequest()).suffixUrl("web-ssm/user/quaryUser").request(new ACallback<List<UserBean>>() {
            @Override
            public void onSuccess(List<UserBean> userList) {
                ViseLog.i("request onSuccess!" + userList);
                ((TextView) findViewById(R.id.act_tv_test)).setText(userList.get(0).getUserName());
            }

            @Override
            public void onFail(int errCode, String errMsg) {
                ViseLog.e("request errorCode:" + errCode + ",errorMsg:" + errMsg);
            }
        });
    }

    private void test1() {
        ViseHttp.GET().suffixUrl("web-ssm/user/postAuthor").request(new ACallback<TestBean>() {
            @Override
            public void onSuccess(TestBean data) {
                ((TextView) findViewById(R.id.act_tv_test1)).setText(data.getData());
            }

            @Override
            public void onFail(int errCode, String errMsg) {

            }
        });
    }
}

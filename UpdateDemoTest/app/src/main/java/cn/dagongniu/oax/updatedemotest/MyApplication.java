package cn.dagongniu.oax.updatedemotest;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;


/**
 * Created by 程序入口 on 2017/12/19.
 */

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";


    private static MyApplication instance;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

}

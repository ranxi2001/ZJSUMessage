package com.onefly.zjsumessage;

import android.app.Application;

import cn.leancloud.LCObject;
import cn.leancloud.LeanCloud;


public class LeanCloud_My extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 提供 this、App ID、App Key、Server Host 作为参数
        // 注意这里千万不要调用 cn.leancloud.core.LeanCloud 的 initialize 方法，否则会出现 NetworkOnMainThread 等错误。
        LeanCloud.initialize(this, "p7Fj9kwMMU8nfWz292BfPJFt-gzGzoHsz", "ofUBBp0Ua965PNfM15nfkNAN", "https://p7fj9kwm.lc-cn-n1-shared.com");
        LCObject testObject = new LCObject("TestObject");
        testObject.put("words", "Hello world!");
        testObject.saveInBackground().blockingSubscribe();
    }
}

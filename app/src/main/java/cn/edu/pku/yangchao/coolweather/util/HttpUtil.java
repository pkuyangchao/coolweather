package cn.edu.pku.yangchao.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 完成和服务器的交互
 * Created by YangChao on 2018/11/1.
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

package com.org.utillib.utils;

import android.content.Context;

import com.org.utillib.loader.FrescoLoader;
import com.vise.log.ViseLog;
import com.vise.log.inner.LogcatTree;
import com.vise.netexpand.convert.GsonConverterFactory;
import com.vise.utils.assist.SSLUtil;
import com.vise.xsnow.http.ViseHttp;
import com.vise.xsnow.http.interceptor.HttpLogInterceptor;
import com.vise.xsnow.loader.LoaderManager;

import java.util.HashMap;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * @Created: xiaoyu  on 2017.12.20 16:39.
 * @Describe：
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2017.12.20 16:39.
 * @Blog:http://blog.csdn.net/noteschapter
 * @Github:https://github.com/mrxiaoyu100001
 * @Resources:
 * @Remark:
 */

public class HttpManager {

    private HttpManager() {
        new RuntimeException("Not init this!!!");
    }

    /**
     * 初始化全局变量
     *
     * @param context 全局变量
     * @param BaseUrl 域名
     */
    public static void builder(Context context, String BaseUrl) {
        initLog(true, false);
        initNet(context, BaseUrl);
        LoaderManager.setLoader(new FrescoLoader());//外部定制图片加载库Fresco
        LoaderManager.getLoader().init(context);
    }

    /**
     * @param allowLog    是否输出日志
     * @param showBorders 是否排版显示
     */
    public static void initLog(boolean allowLog, boolean showBorders) {
        ViseLog.getLogConfig()
                .configAllowLog(allowLog)
                .configShowBorders(showBorders);
        ViseLog.plant(new LogcatTree());//添加打印日志信息到Logcat的树
    }

    /**
     * 初始化网络请求工具类
     *
     * @param context 全局变量
     * @param BaseUrl 域名
     */
    public static void initNet(Context context, String BaseUrl) {
        ViseHttp.init(context);
        ViseHttp.CONFIG()
                //配置请求主机地址
                .baseUrl(BaseUrl)
                //配置全局请求头
                .globalHeaders(new HashMap<String, String>())
                //配置全局请求参数
                .globalParams(new HashMap<String, String>())
                //配置读取超时时间，单位秒
                .readTimeout(30)
                //配置写入超时时间，单位秒
                .writeTimeout(30)
                //配置连接超时时间，单位秒
                .connectTimeout(30)
                //配置请求失败重试次数
                .retryCount(3)
                //配置请求失败重试间隔时间，单位毫秒
                .retryDelayMillis(1000)
                //配置是否使用cookie
                .setCookie(true)
                //配置自定义cookie
//                .apiCookie(new ApiCookie(this))
                //配置是否使用OkHttp的默认缓存
                .setHttpCache(true)
                //配置OkHttp缓存路径
//                .setHttpCacheDirectory(new File(ViseHttp.getContext().getCacheDir(), ViseConfig.CACHE_HTTP_DIR))
                //配置自定义OkHttp缓存
//                .httpCache(new Cache(new File(ViseHttp.getContext().getCacheDir(), ViseConfig.CACHE_HTTP_DIR), ViseConfig.CACHE_MAX_SIZE))
                //配置自定义离线缓存
//                .cacheOffline(new Cache(new File(ViseHttp.getContext().getCacheDir(), ViseConfig.CACHE_HTTP_DIR), ViseConfig.CACHE_MAX_SIZE))
                //配置自定义在线缓存
//                .cacheOnline(new Cache(new File(ViseHttp.getContext().getCacheDir(), ViseConfig.CACHE_HTTP_DIR), ViseConfig.CACHE_MAX_SIZE))
                //配置开启Gzip请求方式，需要服务器支持
//                .postGzipInterceptor()
                //配置应用级拦截器
                .interceptor(new HttpLogInterceptor()
                        .setLevel(HttpLogInterceptor.Level.BODY))
                //配置网络拦截器
//                .networkInterceptor(new NoCacheInterceptor())
                //配置转换工厂
                .converterFactory(GsonConverterFactory.create())
                //配置适配器工厂
                .callAdapterFactory(RxJava2CallAdapterFactory.create())
                //配置请求工厂
//                .callFactory(new Call.Factory() {
//                    @Override
//                    public Call newCall(Request request) {
//                        return null;
//                    }
//                })
                //配置连接池
//                .connectionPool(new ConnectionPool())
                //配置主机证书验证
                .hostnameVerifier(new SSLUtil.UnSafeHostnameVerifier("http://192.168.1.100/"))
                //配置SSL证书验证
                .SSLSocketFactory(SSLUtil.getSslSocketFactory(null, null, null))
        //配置主机代理
//                .proxy(new Proxy(Proxy.Type.HTTP, new SocketAddress() {}))
        ;

    }
}

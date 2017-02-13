package com.qiang.senior.androidsenior;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orhanobut.logger.Logger;
import com.qiang.senior.ystenbasemoudule.json.FastJsonHelper;
import com.qiang.senior.ystenbasemoudule.net.wrapokhttp.OkHttpUtils;
import com.qiang.senior.ystenbasemoudule.net.wrapokhttp.callback.Callback;
import com.qiang.senior.ystenbasemoudule.net.wrapokhttp.callback.StringCallback;

import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/**
 * 分支增加的注释
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "wangQ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        setContentView(R.layout.fresco);
        Logger.init(TAG);

//        Intent mIntent = new Intent(this, DispatchEventActivity.class);
//        this.startActivity(mIntent);
//        initOkHttp();
//        testGetOkhttp();
//        initFrecso();

        setFrecso(lisenterFresco());
    }

    private void testGetOkhttp() {
        String url = "http://cosepg.public.taipan.bcs.ottcn.com:8084/ysten-epg/epg/getDetail.shtml?psId=1084370&abilityString=%7B%22deviceGroupIds%22%3A%5B%221436%22%5D%2C%22userGroupIds%22%3A%5B%5D%2C%22districtCode%22%3A%22110000%22%2C%22abilities%22%3A%5B%5D%2C%22businessGroupIds%22%3A%5B%5D%7D&templateId=21600137";
        Activity mActivity = this;
        Callback callBack = new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {
                Log.d(TAG, "onError() called with: call = [" + call + "], e = [" + e + "]");
            }

            @Override
            public void onResponse(String response) {

                Logger.json(response);
                testJson(response);
            }
        };
        testGet(url, mActivity, callBack);
    }

    private void testJson(String json) {
        Bean bean = null;
        bean = FastJsonHelper.parseJson2Obj(json, Bean.class);
        Logger.e(bean.getCode());
        Log.e(TAG, "ppvid:" + bean.getData().getPpvId());
        Logger.e("ppvid:" + bean.getData().getPpvId());
        Log.e(TAG, "name" + bean.getData().getChannelName());
        Logger.e("name" + bean.getData().getChannelName());
        Logger.e("id = " + bean.getData().getSources().get(0).getId());
    }

    /**
     *
     剩下的，Fresco会替你完成:
     显示占位图直到加载完成；
     下载图片；
     缓存图片；
     图片不再显示时，从内存中移除；
     */
    private void initFrecso() {
        Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/logo.png");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        draweeView.setImageURI(uri);
    }

    public void setFrecso(ControllerListener controllerListener){
        SimpleDraweeView mSimpleDraweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);

        Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/logo.png");
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setControllerListener(controllerListener)
                .setUri(uri)
                // other setters
                .build();
        mSimpleDraweeView.setController(controller);
    }
    private  ControllerListener lisenterFresco(){
        ControllerListener mControllerListener = new BaseControllerListener(){
            @Override
            public void onFinalImageSet(String id, Object imageInfo, Animatable animatable) {
                super.onFinalImageSet(id, imageInfo, animatable);
                Logger.i(imageInfo.toString());
            }

            @Override
            public void onFailure(String id, Throwable throwable) {
                super.onFailure(id, throwable);
                Logger.i(""+getClass()+throwable+"id = "+id);
            }

            @Override
            public void onIntermediateImageSet(String id, Object imageInfo) {
                super.onIntermediateImageSet(id, imageInfo);
                Logger.i("Intermediate image received会在每个扫描被解码后回调");
            }
        };
        return mControllerListener;
    }

    private void initOkHttp() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(10, TimeUnit.SECONDS)//设置写的超时时间
                .connectTimeout(10, TimeUnit.SECONDS)//设置连接超时时间
                .build();
        OkHttpUtils.initClient(okHttpClient);
    }

    private void testGet(String url, Activity mActivity, Callback callBack) {
        try {
            OkHttpUtils.get()
                    .url(url)
                    .tag(mActivity)
                    .build()
                    .execute(callBack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

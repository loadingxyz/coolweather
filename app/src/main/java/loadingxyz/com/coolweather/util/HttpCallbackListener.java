package loadingxyz.com.coolweather.util;

/**
 * Created by Administrator on 2016/6/4 0004.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}

package com.aspire.daydreaming.core.app.other;import com.aspire.daydreaming.core.app.RestApi;import com.aspire.daydreaming.core.base.BaseEntity;import com.aspire.daydreaming.core.model.info.ActivityInfo;import com.aspire.daydreaming.core.model.info.Data;import com.aspire.daydreaming.core.model.info.ImageItem;import com.aspire.daydreaming.core.model.info._User;import com.aspire.daydreaming.core.model.leancloud.ActivityModel;import java.io.IOException;import okhttp3.RequestBody;import retrofit2.Response;import rx.Observable;/** * @Name: AppApiImpl * @Author: yeliang * @Date: 2016/8/24 */public class AppApiImpl implements AppApi {    public AppApiImpl() {    }    @Override    public Observable<Data<_User>> getAllUser(int skip, int limit) {        Observable.empty().subscribe();        return Observable.create(subscriber -> {            try {                Response<Data<_User>> response = RestApi.getInstance().appService.getAllUser(skip, limit).execute();                if (response.isSuccessful()) {                    subscriber.onNext(response.body());                    subscriber.onCompleted();                } else {//                    Log.i(TAG, "login: " + response.errorBody().string());                    subscriber.onError(new Throwable("用户名或密码错误"));                    subscriber.onCompleted();                }            } catch (IOException e) {                e.printStackTrace();                subscriber.onError(new Throwable("登录失败"));                subscriber.onCompleted();            }        });    }    @Override    public Observable<Data<ImageItem>> getMainImages() {        Observable.empty().subscribe();        return Observable.create(subscriber -> {            try {                Response<Data<ImageItem>> response = RestApi.getInstance().appService.getMainImages().execute();                if (response.isSuccessful()) {                    subscriber.onNext(response.body());                    subscriber.onCompleted();                } else {                    subscriber.onError(new Throwable("获取首页图片失败"));                    subscriber.onCompleted();                }            } catch (IOException e) {                e.printStackTrace();                subscriber.onError(new Throwable("连接失败"));                subscriber.onCompleted();            }        });    }    @Override    public Observable<BaseEntity.BaseBean> upFile(String type, RequestBody body) {        Observable.empty().subscribe();        return Observable.create(subscriber -> {            try {                Response<BaseEntity.BaseBean> response = RestApi.getInstance().appService.upFile(type, body).execute();                if (response.isSuccessful()) {                    subscriber.onNext(response.body());                    subscriber.onCompleted();                } else {                    subscriber.onError(new Throwable("上传图片失败"));                    subscriber.onCompleted();                }            } catch (IOException e) {                e.printStackTrace();                subscriber.onError(new Throwable("上传图片失败"));                subscriber.onCompleted();            }        });    }    @Override    public Observable<ActivityInfo> createActivity(ActivityModel activityModel) {        Observable.empty().subscribe();        return Observable.create(subscriber -> {            try {                Response<ActivityInfo> response = RestApi.getInstance().appService.createActivity(activityModel).execute();                if (response.isSuccessful()) {                    subscriber.onNext(response.body());                    subscriber.onCompleted();                } else {                    subscriber.onError(new Throwable("创建活动失败"));                    subscriber.onCompleted();                }            } catch (IOException e) {                e.printStackTrace();                subscriber.onError(new Throwable("创建失败"));                subscriber.onCompleted();            }        });    }    @Override    public Observable<Data<ActivityInfo>> getActivities(String include) {        Observable.empty().subscribe();        return Observable.create(subscriber -> {            try {                Response<Data<ActivityInfo>> response = RestApi.getInstance().appService.getActivity(include).execute();                if (response.isSuccessful()) {                    subscriber.onNext(response.body());                    subscriber.onCompleted();                } else {                    subscriber.onError(new Throwable("获取活动失败"));                    subscriber.onCompleted();                }            } catch (IOException e) {                e.printStackTrace();                subscriber.onError(new Throwable("获取活动失败"));                subscriber.onCompleted();            }        });    }}
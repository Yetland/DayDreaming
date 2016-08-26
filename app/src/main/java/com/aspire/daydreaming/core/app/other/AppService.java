package com.aspire.daydreaming.core.app.other;import com.aspire.daydreaming.core.base.BaseEntity;import com.aspire.daydreaming.core.model.info.ActivityInfo;import com.aspire.daydreaming.core.model.info.Data;import com.aspire.daydreaming.core.model.info.ImageItem;import com.aspire.daydreaming.core.model.info._User;import com.aspire.daydreaming.core.model.leancloud.ActivityModel;import okhttp3.RequestBody;import retrofit2.Call;import retrofit2.http.Body;import retrofit2.http.GET;import retrofit2.http.Headers;import retrofit2.http.POST;import retrofit2.http.Path;import retrofit2.http.Query;/** * @Name: AppService * @Author: yeliang * @Date: 2016/8/23 */public interface AppService {    @GET("users")    Call<Data<_User>> getAllUser(@Query("skip") int skip, @Query("limit") int limit);    @GET("classes/ImageItem")    Call<Data<ImageItem>> getMainImages();    @Headers("Content-Type: image/png")    @POST("files/{name}")    Call<BaseEntity.BaseBean> upFile(@Path("name") String type, @Body RequestBody body);    @POST("classes/Activity")    Call<ActivityInfo> createActivity(@Body ActivityModel activityModel);    @GET("classes/Activity")    Call<Data<ActivityInfo>> getActivity(@Query("include")String creator);}
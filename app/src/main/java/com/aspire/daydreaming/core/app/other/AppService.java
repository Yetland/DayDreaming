package com.aspire.daydreaming.core.app.other;import android.media.Image;import com.aspire.daydreaming.core.model.Data;import com.aspire.daydreaming.core.model.UserModel;import okhttp3.RequestBody;import retrofit2.http.Body;import retrofit2.http.Path;import retrofit2.http.Query;import rx.Observable;/** * @Name: AppService * @Author: yeliang * @Date: 2016/8/23 */public interface AppService {    Observable<UserModel> login(@Query("username") String username, @Query("password") String password);    Observable<CreatedResult> createUser(@Body UserModel user);    Observable<Data<UserModel>> getAllUser(@Query("skip") int skip, @Query("limit") int limit);    Observable<Data<Image>> getAllImages(@Query("where") String where, @Query("order") String order, @Query("skip") int skip, @Query("limit") int limit);    Observable<CreatedResult> upFile(@Path("name") String name, @Body RequestBody body);}
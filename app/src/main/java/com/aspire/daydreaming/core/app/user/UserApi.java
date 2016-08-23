package com.aspire.daydreaming.core.app.user;import com.aspire.daydreaming.core.base.BaseEntity;import com.aspire.daydreaming.core.model.UserModel;import retrofit2.http.Body;import retrofit2.http.Query;import rx.Observable;/** * @Name: UserApi * @Author: yeliang * @Date: 2016/8/23 */interface UserApi {    Observable<UserModel> login(@Query("username") String username, @Query("password") String password);    Observable<BaseEntity.BaseBean> createUser(@Body UserModel user);}
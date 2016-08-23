package com.aspire.daydreaming.bundle.login;import com.aspire.daydreaming.core.app.ApiServiceImpl;import com.aspire.daydreaming.core.base.RxSchedulers;import com.aspire.daydreaming.core.model.UserModel;import rx.Observable;/** * @Name: LoginModel * @Author: yeliang * @Date: 2016/8/23 */public class LoginModel implements LoginContract.Model {    @Override    public Observable<UserModel> login(String username, String password) {        return new ApiServiceImpl().login(username, password)                .compose(RxSchedulers.io_main());    }}
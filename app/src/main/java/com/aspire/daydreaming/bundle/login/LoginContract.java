package com.aspire.daydreaming.bundle.login;import com.aspire.daydreaming.core.base.BaseModel;import com.aspire.daydreaming.core.base.BasePresenter;import com.aspire.daydreaming.core.base.BaseView;import com.aspire.daydreaming.core.model.info._User;import rx.Observable;/** * @Name: LoginContract * @Author: yeliang * @Date: 2016/8/23 */public interface LoginContract {    interface View extends BaseView {        void onLoading(String msg);        void login(String username, String password);        void onComplete(_User user);        void loginSuccess();        void onError(String errorMsg);    }    interface Model extends BaseModel {        Observable<_User> login(String username, String password);    }    abstract class Presenter extends BasePresenter<Model, View> {        public abstract void login(String username, String password);        @Override        public void onStart() {        }    }}
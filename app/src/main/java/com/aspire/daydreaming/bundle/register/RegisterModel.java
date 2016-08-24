package com.aspire.daydreaming.bundle.register;import com.aspire.daydreaming.core.app.user.UserApiImpl;import com.aspire.daydreaming.core.base.BaseEntity;import com.aspire.daydreaming.core.base.RxSchedulers;import com.aspire.daydreaming.core.model.User;import rx.Observable;/** * @Name: RegisterModel * @Author: yeliang * @Date: 2016/8/23 */class RegisterModel implements RegisterContract.Model {    @Override    public Observable<BaseEntity.BaseBean> register(User user) {        return new UserApiImpl().createUser(user).compose(RxSchedulers.io_main());    }}
package com.aspire.daydreaming.bundle.register;import com.aspire.daydreaming.core.model.User;/** * @Name: RegisterPresenter * @Author: yeliang * @Date: 2016/8/23 */class RegisterPresenter extends RegisterContract.Presenter {    @Override    public void register(User user) {        rxManager.add(mModel.register(user).subscribe(baseBean -> {            mView.onComplete(baseBean);        }, throwable -> {            mView.onError(throwable.getMessage());        }));    }}
package com.aspire.daydreaming.bundle.myActivity.createActivity;import com.aspire.daydreaming.core.base.BaseModel;import com.aspire.daydreaming.core.base.BasePresenter;import com.aspire.daydreaming.core.base.BaseView;/** * @Name: CreateActivityContract * @Author: yeliang * @Date: 2016/8/24 */public interface CreateActivityContract {    interface View extends BaseView {    }    interface Model extends BaseModel {    }    abstract class Presenter extends BasePresenter<Model, View> {        @Override        public void onStart() {        }    }}
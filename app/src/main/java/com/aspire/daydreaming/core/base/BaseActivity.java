package com.aspire.daydreaming.core.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.aspire.daydreaming.core.utils.TUtil;

import butterknife.ButterKnife;

/**
 * Created by yeliang
 * On 2016/7/25
 */
public abstract class BaseActivity<T extends BasePresenter, E extends BaseModel> extends AppCompatActivity {
    public static final String TAG = "BaseActivity";
    public T mPresenter;
    public E mModel;
    public Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.getLayoutId());
        ButterKnife.bind(this);
        Log.i(TAG, "onCreate: ");
        mContext = this;
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        if (this instanceof BaseView) mPresenter.setVM(this, mModel);
        this.initView(savedInstanceState);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) mPresenter.onDestroy();
        ButterKnife.unbind(this);
    }

    public abstract int getLayoutId();

    protected abstract void initView(Bundle savedInstanceState);
}

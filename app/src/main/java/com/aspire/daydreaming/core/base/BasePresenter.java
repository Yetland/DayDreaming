package com.aspire.daydreaming.core.base;

/**
 * Created by yeliang
 * On 2016/7/25
 */
public abstract class BasePresenter<E, T> {
    public E mModel;
    public T mView;
    public RxManager rxManager = new RxManager();

    public void setVM(T v, E m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public abstract void onStart();

    public void onDestroy() {
        rxManager.clear();
    }
}

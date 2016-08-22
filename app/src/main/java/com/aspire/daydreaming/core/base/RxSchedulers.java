package com.aspire.daydreaming.core.base;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by baixiaokang
 * On 16/5/6
 */
public class RxSchedulers {
    public static <T> Observable.Transformer<T, T> io_main() {
        return tObservable -> tObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
    public static <T> Observable.Transformer<T, T> new_thread() {
        return tObservable -> tObservable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
    }
}

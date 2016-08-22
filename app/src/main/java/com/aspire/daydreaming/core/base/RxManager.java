package com.aspire.daydreaming.core.base;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by yeliang
 * On 2016/7/25
 */
public class RxManager {

    public RxBus mRxBus = RxBus.newInstance();
    private Map<String, Observable<?>> observables = new HashMap<>();
    private CompositeSubscription compositeSubscription = new CompositeSubscription();

    public void on(String eventName, Action1<Object> action1) {
        Observable<?> observable = mRxBus.register(eventName);
        observables.put(eventName, observable);
        compositeSubscription.add(observable.observeOn(AndroidSchedulers.mainThread())
                .subscribe(action1, Throwable::printStackTrace));
    }

    public void add(Subscription subscription) {
        compositeSubscription.add(subscription);
    }

    public void clear() {
        compositeSubscription.unsubscribe();
        for (Map.Entry<String, Observable<?>> entry : observables.entrySet()) {
            mRxBus.unregister(entry.getKey(), entry.getValue());
        }
    }

    public void post(Object tag, Object content) {
        mRxBus.post(tag, content);
    }
}

package com.aspire.daydreaming.core.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;
import rx.subjects.Subject;

/**
 * Created by yeliang
 * On 2016/7/25
 */
public class RxBus {

    private static RxBus instance;

    public static synchronized RxBus newInstance() {
        if (null == instance) {
            instance = new RxBus();
        }
        return instance;
    }

    public RxBus() {
    }

    private ConcurrentHashMap<Object, List<Subject>> subjectMapper = new ConcurrentHashMap<>();

    public RxBus onEvent(Observable<?> observable, Action1<Object> action1) {
        observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.newThread())
                .subscribe(action1, Throwable::printStackTrace);
        return newInstance();
    }


    public <T> Observable<T> register(Object tag) {
        List<Subject> subjectList = subjectMapper.get(tag);
        if (null == subjectList) {
            subjectList = new ArrayList<>();
            subjectMapper.put(tag, subjectList);
        }

        Subject<T, T> subject;
        subjectList.add(subject = PublishSubject.create());
        return subject;
    }

    public RxBus unregister(Object tag, Observable<?> observable) {
        if (observable == null) {
            return newInstance();
        }
        List<Subject> subjects = subjectMapper.get(tag);
        if (null != subjects) {
            subjects.remove(observable);
            if (!isEmpty(subjects)) {
                subjectMapper.remove(tag);
            }
        }
        return newInstance();
    }


    public void post(Object tag, Object content) {
        List<Subject> subjectList = subjectMapper.get(tag);
        if (!isEmpty(subjectList)) {
            for (Subject subject : subjectList) {
                subject.onNext(content);
            }
        }
    }

    public static boolean isEmpty(Collection<Subject> collection) {
        return null == collection || collection.isEmpty();
    }
}

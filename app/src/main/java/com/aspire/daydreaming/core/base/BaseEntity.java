package com.aspire.daydreaming.core.base;

import java.io.Serializable;
import java.util.Map;

import rx.Observable;

/**
 * Created by yeliang
 * On 2016/7/25
 */
public interface BaseEntity {
    class BaseBean implements Serializable {
        public String objectId;
        public String updatedAt;
        public String createdAt;
        public String url;
        public Map<String, String> param;
    }

    interface IListBean {
        Observable getPageAt(int page);

        void setParam(Map<String, String> param);
    }

    abstract class ListBean extends BaseBean implements IListBean {
        @Override
        public void setParam(Map<String, String> param) {

        }
    }
}

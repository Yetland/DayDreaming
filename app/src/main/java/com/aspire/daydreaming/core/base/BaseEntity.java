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
        public long id;
        public int code;
        public String error;
        public String objectId;
        public Map<String, String> param;

        @Override
        public String toString() {
            return "BaseBean{" +
                    "id=" + id +
                    ", code=" + code +
                    ", error='" + error + '\'' +
                    ", objectId='" + objectId + '\'' +
                    ", param=" + param +
                    '}';
        }
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

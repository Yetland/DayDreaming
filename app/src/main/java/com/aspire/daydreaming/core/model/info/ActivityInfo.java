package com.aspire.daydreaming.core.model.info;

import com.aspire.daydreaming.core.base.BaseEntity;

import java.io.Serializable;

public class ActivityInfo extends BaseEntity.BaseBean implements Serializable {

    private String title;// 活动的标题
    private String contentMessage;// 活动内容简介
    private _User creator;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentMessage() {
        return contentMessage;
    }

    public void setContentMessage(String contentMessage) {
        this.contentMessage = contentMessage;
    }

    public _User getCreator() {
        return creator;
    }

    public void setCreator(_User creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "ActivityInfo{" +
                "title='" + title + '\'' +
                ", contentMessage='" + contentMessage + '\'' +
                ", creator=" + creator +
                '}';
    }
}
package com.aspire.daydreaming.core.model.info;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yeliang on 2016/4/27.
 */
public class MessageModel implements Serializable {

    private List<_User> fromUsers;
    private _User toUser;
    private List<MessageBoard> messageBoard;

    public List<_User> getFromUsers() {
        return fromUsers;
    }

    public void setFromUsers(List<_User> fromUsers) {
        this.fromUsers = fromUsers;
    }

    public _User getToUser() {
        return toUser;
    }

    public void setToUser(_User toUser) {
        this.toUser = toUser;
    }

    public List<MessageBoard> getMessageBoard() {
        return messageBoard;
    }

    public void setMessageBoard(List<MessageBoard> messageBoard) {
        this.messageBoard = messageBoard;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "fromUsers=" + fromUsers +
                ", toUser=" + toUser +
                ", messageBoard=" + messageBoard +
                '}';
    }
}

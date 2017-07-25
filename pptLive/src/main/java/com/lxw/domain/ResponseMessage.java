package com.lxw.domain;

import com.google.gson.Gson;

/**
 * Created by lxw on 2017/7/25.
 */
public class ResponseMessage {

    private int state  ;
    private String message ;

    public ResponseMessage(int state, String message) {
        this.state = state;
        this.message = message;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this) ;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

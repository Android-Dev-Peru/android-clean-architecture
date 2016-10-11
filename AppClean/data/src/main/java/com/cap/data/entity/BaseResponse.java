package com.cap.data.entity;


/**
 * Created by CAP on 01/10/2016.
 */

public class BaseResponse {

    private static final int SUCCESS=0;
    private int code;
    private String message;

    public boolean respSucces(){
        if(this.code==SUCCESS){
            return true;
        }else{
            return false;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

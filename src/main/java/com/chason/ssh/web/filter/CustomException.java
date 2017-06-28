package com.chason.ssh.web.filter;

/**
 * Created by chason on 2017/6/17.
 */
public class CustomException extends Exception{
    private String message ;

    public CustomException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "message='" + message + '\'' +
                '}';
    }
}

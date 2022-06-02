package com.example.localstorage;

public class DataModel {
    private String msg;

    //empty constructor
    public DataModel() {
    }
    //constructor
    public DataModel(String msg) {

        this.msg = msg;
    }
    //Getter and Setter
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //toString method for printing
    @Override
    public String toString() {
        return "DataModel{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

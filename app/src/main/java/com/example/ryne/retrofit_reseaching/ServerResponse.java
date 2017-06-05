package com.example.ryne.retrofit_reseaching;

/**
 * Created by ryne on 05/06/2017.
 */

public class ServerResponse {
    private String userName;
    private String passWord;
    private String message;
    private int resonseCode;

    public ServerResponse(String userName, String passWord, String message, int resonseCode) {
        this.userName = userName;
        this.passWord = passWord;
        this.message = message;
        this.resonseCode = resonseCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResonseCode() {
        return resonseCode;
    }

    public void setResonseCode(int resonseCode) {
        this.resonseCode = resonseCode;
    }
}

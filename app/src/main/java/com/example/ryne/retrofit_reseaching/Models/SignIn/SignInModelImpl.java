package com.example.ryne.retrofit_reseaching.Models.SignIn;

import android.content.Context;

import com.example.ryne.retrofit_reseaching.Entities.User;

import java.util.ArrayList;

/**
 * Created by ryne on 05/06/2017.
 */

public class SignInModelImpl implements ISignInModel {
    @Override
    public void SignIn(final User user,final Context mContext,final OnFinishListener onFinishListener) {
       final ArrayList<String> message = new ArrayList<>();
        String email = user.getEmail();
        String password = user.getPassword();
        boolean cancel = false;

        // check valid email here

//        if(!isEmailValid(email)){
//            message.add("Inval");
//        }
    }

    public boolean isEmailValid(String email){
        boolean emailValid = true;
        if (!email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")) {
            if (!email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.+[a-zA-Z0-9]+")) {
                emailValid = false;
            }
        }
        if (email.substring(0, 1).matches("[._-]")) {
            emailValid = false;
        }
        if (email.contains("..")) {
            emailValid = false;
        }
        if (email.contains(".@")) {
            emailValid = false;
        }
        return emailValid;
    }
}

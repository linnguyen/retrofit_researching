package com.example.ryne.retrofit_reseaching.Models.SignIn;

import android.content.Context;

import com.example.ryne.retrofit_reseaching.Entities.User;

import java.util.ArrayList;

/**
 * Created by ryne on 05/06/2017.
 */

public interface ISignInModel {
    interface OnFinishListener{
        void onLogInWithChangePassword();
        void onLogInSuccess();
        void onLogInError(ArrayList<String> message);
    }

    void SignIn(User user, Context mContext, OnFinishListener onFinishListener);
}

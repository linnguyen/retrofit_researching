package com.example.ryne.retrofit_reseaching.Presenters.SignIn;

import android.content.Context;

import com.example.ryne.retrofit_reseaching.Entities.User;

/**
 * Created by ryne on 05/06/2017.
 */

public interface ISignInPresenter {
    void checkAccount(User user, Context context);
    void checkSignInPreference(Context context);
}

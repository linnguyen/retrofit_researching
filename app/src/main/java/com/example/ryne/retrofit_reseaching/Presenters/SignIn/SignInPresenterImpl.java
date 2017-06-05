package com.example.ryne.retrofit_reseaching.Presenters.SignIn;

import android.content.Context;

import com.example.ryne.retrofit_reseaching.Entities.User;
import com.example.ryne.retrofit_reseaching.Models.SignIn.ISignInModel;
import com.example.ryne.retrofit_reseaching.Models.SignIn.SignInModelImpl;
import com.example.ryne.retrofit_reseaching.Views.SignIn.ISignIn;

import java.util.ArrayList;

/**
 * Created by ryne on 05/06/2017.
 */

public class SignInPresenterImpl implements ISignInPresenter, ISignInModel.OnFinishListener{
    private ISignIn mView;
    private SignInModelImpl mSignInModel;
    public SignInPresenterImpl(){
        mSignInModel = new SignInModelImpl();
    }
    @Override
    public void checkAccount(User user, Context context) {
        mSignInModel.SignIn(user, context, this);
    }

    @Override
    public void checkSignInPreference(Context context) {

    }

    @Override
    public void onLogInWithChangePassword() {

    }

    @Override
    public void onLogInSuccess() {

    }

    @Override
    public void onLogInError(ArrayList<String> message) {

    }
}

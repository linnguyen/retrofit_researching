package com.example.ryne.retrofit_reseaching.Views.SignIn;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ryne.retrofit_reseaching.Entities.User;
import com.example.ryne.retrofit_reseaching.Helper.Helper;
import com.example.ryne.retrofit_reseaching.Presenters.SignIn.SignInPresenterImpl;
import com.example.ryne.retrofit_reseaching.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ryne on 05/06/2017.
 */

public class SignInActivity extends SignInSocial implements ISignIn {
    private Context mContext = this;
    @BindView(R.id.userNameInput)
    EditText edtUserName;
    @BindView(R.id.passwordInput)
    EditText edtPassword;
    private SignInPresenterImpl mSignInPresenter;

        @Override
    protected int getLayoutResource() {
        return R.layout.activity_signin;
    }

    @Override
    protected void initialize() {
        mSignInPresenter = new SignInPresenterImpl();
        super.initialize();
    }

    @Override
    protected void hideInputKeyBoard() {
        super.hideInputKeyBoard();
    }

    @OnClick(R.id.buttomSignin)
    public void signIn(){
        hideInputKeyBoard();
        User user = new User(edtUserName.getText().toString().trim(), edtPassword.getText().toString().trim(),"123abc@");
        if (Helper.isNetworkAvailable(this)){
            mSignInPresenter.checkAccount(user, mContext);
        }else {

        }
    }
    @Override
    public void showProgressDialog() {

    }

    @Override
    public void dismissProgressbarDialog() {

    }

    @Override
    public void showHome() {

    }
}

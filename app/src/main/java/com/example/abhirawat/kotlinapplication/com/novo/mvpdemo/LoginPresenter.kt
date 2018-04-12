package com.example.abhirawat.kotlinapplication.com.novo.mvpdemo

/**
 * Created by Abhi Rawat on 11-04-2018.
 */

class LoginPresenter(loginView: LoginView?) : PresenterInterface {
var loginView : LoginView? = null
    init {
        this.loginView = loginView
    }
    override fun onLoginBtnClick() {

        if (loginView?.getUsername().equals("") ) {
            loginView?.showErrorWhenUsernameIsEmpty("Please Enter Username")
            return
        }
        if(loginView?.getPassword().equals(""))
        {
            loginView?.showErrorWhenPasswordIsEmpty("Please Enter Password")
            return

        }
         if(loginView?.getUsername().equals("Ranjeet",ignoreCase = true) && loginView?.getPassword().equals("123456",ignoreCase = true))
         {
          loginView?.onSuccessfullLogin("Welcome User")

         }
        else
         {
               loginView?.onUserLoginFailed("Please Enter Correct Credentials")
         }


    }
}

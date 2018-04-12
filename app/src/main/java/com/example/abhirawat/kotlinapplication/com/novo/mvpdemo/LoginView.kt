package com.example.abhirawat.kotlinapplication.com.novo.mvpdemo

/**
 * Created by Abhi Rawat on 11-04-2018.
 */

 interface LoginView {
    fun showErrorWhenUsernameIsEmpty(error: String)
    fun showErrorWhenPasswordIsEmpty(error: String)
    fun onSuccessfullLogin(error: String)
    fun onUserLoginFailed(error: String)
   fun getUsername() : String
   fun getPassword(): String

}

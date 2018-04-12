package com.example.abhirawat.kotlinapplication.com.novo.mvpdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.abhirawat.kotlinapplication.R

class MainActivity : AppCompatActivity() ,View.OnClickListener,LoginView{
    override fun getPassword(): String {
        return edUsername?.text.toString()
    }

    override fun getUsername() : String {
      return edPassword?.text.toString()
    }

    override fun onUserLoginFailed(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show()
    }

    override fun showErrorWhenUsernameIsEmpty(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show()

    }

    override fun showErrorWhenPasswordIsEmpty(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show()

    }

    override fun onSuccessfullLogin(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_LONG).show()

    }

    private var edUsername: EditText? = null

    private var edPassword: EditText? = null

    private var btnLogin: Button? = null
    private var presenter : LoginPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edUsername = findViewById<EditText>(R.id.edUsername) as EditText
        edPassword = findViewById<EditText>(R.id.edPassword) as EditText
        btnLogin = findViewById<Button>(R.id.btnLogin) as Button
        btnLogin?.setOnClickListener(this)
        presenter = LoginPresenter(this)
    }
    override fun onClick(p0: View?) {
        if(p0 != null) {
            when(p0.id){
                R.id.btnLogin->
                {
                    var username = edUsername?.text.toString()
                    var passsword = edPassword?.text.toString()
                    presenter!!.onLoginBtnClick()
                }
            }
        }

    }



}

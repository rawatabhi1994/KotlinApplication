package com.example.abhirawat.kotlinapplication.com.novo.mvpdemo

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify

/**
 * Created by Abhi Rawat on 11-04-2018.
 */
class MainActivityTest
{
    @Mock
    var loginview : LoginView? = null
    private var presenter : LoginPresenter? = null
    @Before
    fun setUp() {
        presenter = LoginPresenter(loginview)
    }
    @After
    fun tearDown()
    {}

    @Test
    fun showErrorWhenUsernameIsEmpty()
    {

         `when`(loginview?.getUsername()).thenReturn("")
        presenter?.onLoginBtnClick()
       verify(loginview)?.showErrorWhenUsernameIsEmpty("Please Enter Username")



    }
    @Test
    fun showErrorWhenPasswordIsEmpty()
    {
       `when`(loginview?.getPassword()).thenReturn("")
        presenter?.onLoginBtnClick()

       verify(loginview)?.showErrorWhenPasswordIsEmpty("Please Enter Password")


    }

}
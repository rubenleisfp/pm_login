package com.mouredev.aristidevslogin.ui.login.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mouredev.aristidevslogin.ui.login.data.LoginData

/**
 * Created by Your name on 11/01/2024.
 */
data class LoginUiState (
    val loginEnable : Boolean = false,
    val loginMessage : String = "",
    val loginChecked: Boolean = false,
    val loginData: LoginData = LoginData("","")
)
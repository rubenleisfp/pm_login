package com.mouredev.aristidevslogin.ui.login.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by Your name on 11/01/2024.
 */
data class LoginUiState (
    val loginEnable : Boolean = false,
    val loginMessage : String = "",
    val loginChecked: Boolean = false
)
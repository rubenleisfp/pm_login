package com.mouredev.aristidevslogin.ui.login.ui

import android.util.Log
import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mouredev.aristidevslogin.ui.login.data.LoginData

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * Created by Your name on 11/01/2024.
 */

class LoginViewModel : ViewModel() {

    //Valores que están relacionados directamente con el estado de la aplicación:
    //campos que sirven para determinar si se debe mostrar alguna vista
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    //no se guarda dentro del UIState es que es un detalle específico de la interfaz de usuario
    //y no afecta directamente al estado general del juego.
    var loginData by mutableStateOf(LoginData())
        private set

    fun onLoginChanged(email: String, password: String) {
        Log.d(TAG_LOG, "onLoginChanged")
        loginData = loginData.copy(email = email)
        loginData = loginData.copy(password = password)

        var areFieldsValid = isValidEmail(email) && isValidPassword(password)
        Log.d(TAG_LOG, "areFieldsValid $areFieldsValid")
        _uiState.update { currentState -> currentState.copy(loginEnable = areFieldsValid) }
    }

    private fun isValidPassword(password: String): Boolean = password.length > 6

    private fun isValidEmail(email: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()

    suspend fun onLoginSelected() {
        Log.d(TAG_LOG, "OnLoginSelected")

        var loginMessage = "Login Ok"
        if (!isValidLogin()) {
            loginMessage = "Login incorrecto, revise las credenciales"
        }
        //Se hará recompose por haber cambiado el uiState
        _uiState.update { currentState ->
            currentState.copy(loginChecked = true).copy(loginMessage = loginMessage)
        }
    }

    fun onToastShowed() {
        //Una vez lanzado el toast quitamos el flag para mostrarlo
        _uiState.update { currentState -> currentState.copy(loginChecked = false) }
    }

    private fun isValidLogin(): Boolean {
        var isValidLogin: Boolean = false
        isValidLogin = (loginData.email == "a@b.com") && (loginData.password == "12345678")
        return isValidLogin
    }
}


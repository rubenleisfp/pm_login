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

    //Estado que representa la informacion que vemos en la pantalla
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    /**
     * Actualiza el valor de loginData con los valores recibidos como argumento
     * Si son validos actualza el valor de loginEnable en el UIState
     */
    fun onLoginChanged(email: String, password: String) {
        //TODO:
        //1.-Crear un nuevo objeto LoginData que sustituira al actual de _uiState
        //2. Comprobar si los campos email y password son validos.
        // Si son campos validos, entonces habilitamos boton de login
    }

    /**
     * Indica si es valor el password, longitud mayor de 6
     */
    private fun isValidPassword(password: String): Boolean = password.length > 6

    /**
     * Indica si es valido el email
     */
    private fun isValidEmail(email: String): Boolean =
        Patterns.EMAIL_ADDRESS.matcher(email).matches()

    /**
     * Se invoca cuando el usuario hace click en login
     * Comprueba que el login sea valido, es decir, que las credenciales sean Ok
     * Actualiza el UIState con el mensaje de login "Login Ok / Login incorrecto, revise las credenciales".
     * Actualiza tambien la variable loginChecked a true para que la vista sepa que hacer
     */
    fun onLoginSelected() {
        //TODO
        //1.- Comprobar si el login fue correcto o no y en consecuencia rellenar el loginMessage
        //2.- Actualizar el valor de loginChecked
    }

    /**
     * Actualizamos en el UI State loginChecked a false
     */
    fun onToastShowed() {
        //TODO
        //Una vez lanzado el toast quitamos el flag para mostrarlo
    }

    /**
     * Valida que el email sea a@b.com y el password 12345678
     */
    private fun isValidLogin(): Boolean {
        //TODO
        return false
    }
}


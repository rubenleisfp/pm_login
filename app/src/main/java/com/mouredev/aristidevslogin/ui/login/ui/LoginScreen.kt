package com.mouredev.aristidevslogin.ui.login.ui

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mouredev.aristidevslogin.R
import com.mouredev.aristidevslogin.ui.login.data.LoginData

/**
 *
 * Cuando el usuario ha introducido un email correcto y un password de 7 caracteres
 * se habilita el boton de login
 *
 * Cuando el usuario pulsa sobre el boton de login se comprueba que las credenciales
 * introducidas son correctas (a@b.com / 12345678)
 *
 * Inmediatamente se muestra un toast indicando si fueron correctas o no las credenciales
 *
 * Created by Your name on 11/01/2024.
 */

const val TAG_LOG: String = "LoginScreen"

@Composable
fun LoginScreen(loginViewModel: LoginViewModel) {
    val loginUiState by loginViewModel.uiState.collectAsState()
    LoginForm(loginUiState = loginUiState,
        onLoginChanged = {login: String, password:String -> loginViewModel.onLoginChanged(login, password)},
        onLoginSelected = { loginViewModel.onLoginSelected()},
        onToastedShow = {loginViewModel.onToastShowed()})
}

/**
 * Representa el formulario de login
 * el cual esta contenida dentro de un box
 *
 * @loginUiState contiene los datos del estado
 * @onLoginChanged accion que se lanza cuando cambia algun valor del password o email
 * @onLoginSelected accion que se lanza al enviar el formulario
 * @onToastedShow util para mostrar y ocultar el toast que muestra el mensaje ok/ko de inicio
 * de sesion
 */
@Composable
fun LoginForm(
    loginUiState: LoginUiState,
    onLoginChanged: (String, String) -> Unit,
    onLoginSelected: () -> Unit,
    onToastedShow: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        //TODO
        //1.- Definir un mContext para el Toast: val mContext = LocalContext.current
        //2.- Definir una columna con los siguientes elementos: HeaderImage, EmailField, PasswordField, ForgotPassword, LoginButton
        //3.- Si se hizo login, habra que mostrar el toast y llamar al metodo onToasteShowed del viewModel
        // para hacer que desaparezca de nuestra vista una vez se ha mostrado

    }
}

/**
 * Representa el logo de la pantalla de login
 */
@Composable
fun HeaderImage(modifier: Modifier) {
    //TODO
    //1.- Mostrar la imagen que guste en tu app

}

/**
 * Funcion generica para mostrar informacion de un toast
 */
private fun mToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}

/**
 * Representa el boton de login
 *
 * @loginEnable sirve para habilitar el boton cuando los campos cumpla con los
 * requisitos exigidos
 * @onLoginSelected evento del VM que se lanzara al hacer click en login
 */
@Composable
fun LoginButton(loginEnable: Boolean, onLoginSelected: () -> Unit) {
    //TODO
    //1. Crear un boton. Cuando se hace click se llamara a onLoginSelected. Solo estara habilitado cuando lo diga LoginEnable
    //2. Proporciona los estilos que gustes a los botones

}

/**
 * Representa el texto de "Olvide mi contraseña"
 */
@Composable
fun ForgotPassword(modifier: Modifier) {
    //TODO
    //1.- Caja de texto con olvidaste contraseña pero sin accion asociada

}

/**
 * Caja de texto de email
 *
 * @loginData: contiene los valores email y password para mostrarlos en su campo correspondiente
 * @onLoginChanged: evento del VM que se invocará cada vez que haya un cambio en las cajas
 *          de texto de login
 *
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailField(loginData: LoginData, onLoginChanged: (String) -> Unit) {
    //TODO
    //1.- Crear un TextField para el email, cada vez que cambie el valor del TextField, se llamara a onLoginChanged
    //2.- Aplicar la estetica visual que gustes
    //https://stackoverflow.com/questions/67320990/android-jetpack-compose-cant-set-backgroundcolor-for-outlinedtextfield

}

/**
 * Caja de texto de password
 *
 * @loginData: contiene los valores email y password para mostrarlos en su campo correspondiente
 * @onLoginChanged: evento del VM que se invocará cada vez que haya un cambio en las cajas
 *          de texto de login
 *
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordField(loginData: LoginData, onLoginChanged: (String) -> Unit) {
    //1.- Crear un TextField para el password, cada vez que cambie el valor del TextField, se llamara a onLoginChanged
    //2.- Aplicar la estetica visual que gustes
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreenPreview() {
    val viewModel = LoginViewModel()
    LoginScreen(viewModel)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginAppPreview(


) {
    val loginViewModel = LoginViewModel()
    val loginUiState by loginViewModel.uiState.collectAsState()
    LoginForm(loginUiState = loginUiState,
        onLoginChanged = {login: String, password:String -> loginViewModel.onLoginChanged(login, password)},
        onLoginSelected = { loginViewModel.onLoginSelected()},
        onToastedShow = {loginViewModel.onToastShowed()})
}
package com.mouredev.aristidevslogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mouredev.aristidevslogin.ui.login.ui.LoginScreen
import com.mouredev.aristidevslogin.ui.login.ui.LoginViewModel
import com.mouredev.aristidevslogin.ui.theme.AristiDevsLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AristiDevsLoginTheme {
                val viewModel =  LoginViewModel()
                LoginScreen(viewModel)
            }
        }
    }
}



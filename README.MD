# AristiDevsLogin

Proyecto de ejemplo de una pantalla de login con Jetpack Compose

## Contenidos

- [Pantalla de login](#pantalla-de-login)

## Pantalla de login

La pantalla de login se ha implementado en la clase `LoginScreen` en el paquete `com.mouredev.aristidevslogin.ui.login.ui`.

En esta pantalla, se encuentra un formulario de login con los siguientes campos:

- Email
- Password
- Botón de olvidaste contraseña
- Botón de inicio de sesión

También se encuentra un header con una imagen de un átomo.

Cuando el usuario introduce sus credenciales y pulsa el botón de inicio de sesión, se llama al 
método `onLoginSelected` del `LoginViewModel` que comprueba si el login es válido o no. 
Si es válido, se muestra un mensaje de "Login Ok" y si no lo es, se muestra un mensaje de "Login incorrecto, revise las credenciales".
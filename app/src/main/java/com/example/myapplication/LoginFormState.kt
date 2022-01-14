package com.example.myapplication

//作成者：軽野

/**
 * Data validation state of the login form.
 */
data class LoginFormState(
    val usernameError: Int? = null,
    val usernamelengthError: Int? = null,
    val passwordError: Int? = null,
    val isDataValid: Boolean = false
)
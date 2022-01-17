package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.Patterns
import com.example.myapplication.model.LoginRepository
import com.example.myapplication.model.Result
import java.sql.Types.NULL

//作成者：軽野

class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {

    private val _loginForm = MutableLiveData<LoginFormState>()
    val loginFormState: LiveData<LoginFormState> = _loginForm

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult

    fun login(username: String, password: String) {
        // can be launched in a separate asynchronous job
        val result = loginRepository.login(username, password)

        if (result is Result.Success) {
            _loginResult.value =
                LoginResult(success = LoggedInUserView(displayName = result.data.displayName))
        } else {
            _loginResult.value = LoginResult(error = R.string.login_failed)
        }
    }

    fun loginDataChanged(username: String, password: String) {
        if (!isUserNameValid(username)) {
                _loginForm.value = LoginFormState(usernameError = R.string.invalid_username)
        } else if (!isUserNameLength(username)) {
            _loginForm.value = LoginFormState(usernameError = R.string.invalid_usernamelength)
        } else if (!isPasswordMax(password)) {
            _loginForm.value = LoginFormState(passwordError = R.string.invalid_password)
        } else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }

    // A placeholder username validation check
    private fun isUserNameValid(username: String): Boolean {
        return if (username.contains('@')) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('.'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains(','))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('#'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('$'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('%'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('&'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('-'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('+'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('('))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains(')'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('*'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('"'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains(';'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains(':'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('!'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('?'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('_'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains('/'))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else if (username.contains("'"))  {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }

    private fun isUserNameLength(username: String): Boolean {
        return username.length == 5
    }

//    private fun isUserNameType(username: String): Boolean {
//        return if (username.contains()
//    }

    // A placeholder password validation check
//    private fun isPasswordMin(password: String): Boolean {
//        return password.length >= 6
//    }

    private fun isPasswordMax(password: String): Boolean {
        return password.length <= 8
    }
}
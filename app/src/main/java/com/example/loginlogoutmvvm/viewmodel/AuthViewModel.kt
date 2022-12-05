package com.example.loginlogoutmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.loginlogoutmvvm.repo.AuthRepository

class AuthViewModel(
    private val repository: AuthRepository
) : ViewModel() {

}
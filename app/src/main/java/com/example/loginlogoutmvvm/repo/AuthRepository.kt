package com.example.loginlogoutmvvm.repo

import com.example.loginlogoutmvvm.service.AuthApi

class AuthRepository(
    private val api: AuthApi
) : BaseRepository() {
    suspend fun login(
        email: String,
        password: String
    ) = safeApiCall {
        api.login(email, password)
    }
}
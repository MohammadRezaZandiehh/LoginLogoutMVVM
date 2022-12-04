package com.example.loginlogoutmvvm.model

data class TokenResponse(
    val access_token: String?,
    val refresh_token: String?
)
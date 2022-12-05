package com.example.loginlogoutmvvm.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.loginlogoutmvvm.R
import com.example.loginlogoutmvvm.databinding.FragmentLoginBinding
import com.example.loginlogoutmvvm.repo.AuthRepository
import com.example.loginlogoutmvvm.service.AuthApi
import com.example.loginlogoutmvvm.ui.base.BaseFragment
import com.example.loginlogoutmvvm.viewmodel.AuthViewModel

class LoginFragment : BaseFragment<AuthViewModel, FragmentLoginBinding, AuthRepository>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun getViewModel() = AuthViewModel::class.java

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() = AuthRepository(remoteDataSource.buildApi(AuthApi::class.java))
}
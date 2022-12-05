package com.example.loginlogoutmvvm

import android.app.Application
import android.content.SharedPreferences
import com.example.loginlogoutmvvm.repo.AuthRepository
import com.example.loginlogoutmvvm.service.RemoteDataSource
import com.example.loginlogoutmvvm.viewmodel.AuthViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App: Application() {


    override fun onCreate() {
        super.onCreate()

        val myModules = module {
            single<SharedPreferences> { this@App.getSharedPreferences("app_settings", MODE_PRIVATE) }

            single { RemoteDataSource() }
            factory { AuthRepository(get()) }
            viewModel { AuthViewModel(get()) }

        }


        startKoin {
            androidContext(this@App)
            modules(myModules)
        }
    }
}
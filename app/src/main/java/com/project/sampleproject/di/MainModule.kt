package com.project.sampleproject.di

import com.project.sampleproject.ui.main.MainRepository
import com.project.sampleproject.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    factory { MainRepository() }

    viewModel { MainViewModel(repository = get()) }

}
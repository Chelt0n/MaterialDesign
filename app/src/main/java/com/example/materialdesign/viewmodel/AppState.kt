package com.example.materialdesign.viewmodel

import com.example.materialdesign.repository.NASAImageResponse

sealed class AppState {

    data class Success(val serverResponseData: NASAImageResponse) : AppState()
    data class Error(val error: Throwable) : AppState()
    data class Loading(val progress: Int?) : AppState()
}


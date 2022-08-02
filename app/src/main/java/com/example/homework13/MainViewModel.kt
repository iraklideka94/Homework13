package com.example.homework13

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _data = MutableSharedFlow<Items>()
    val data: SharedFlow<Items> get() = _data

    fun getData() {
        viewModelScope.launch {
            val response =RetrofitInstance.getInstance().getItmes()
            if (response.isSuccessful && response.body() != null){
                val data = response.body()!!
                _data.emit(data)
            }

        }
    }
}
package com.example.messagespractice

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MessageViewModel: ViewModel() {
    var message by  mutableStateOf("")
    var texts by mutableStateOf(listOf<String>())
}
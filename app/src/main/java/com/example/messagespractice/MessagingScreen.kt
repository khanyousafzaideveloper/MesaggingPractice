package com.example.messagespractice

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview



@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun messagingScreen(){
    var message by remember { mutableStateOf("") }
    Column() {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Send")
        }

        OutlinedTextField(value =message , onValueChange = {message=it})
    }

}
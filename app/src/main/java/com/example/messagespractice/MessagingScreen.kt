package com.example.messagespractice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun messagingScreen(){
    var message by remember { mutableStateOf("") }
    var messagesList by remember { mutableStateOf(listOf(message)) }
    Column(modifier= Modifier.fillMaxSize()) {
        Card(modifier= Modifier
            .padding(16.dp)
            .background(Color.Blue)) {
            chatbox(message = message)
        }
//        LazyColumn(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth()
//        ) {
//            items(message) { message ->
//                chatbox(message = message)
//            }
//        }
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(8.dp), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center) {
            
            OutlinedTextField(value =message , onValueChange = {message=it}, Modifier.padding(end = 4.dp))
            Button(onClick = { message }) {
                Text(text = "Send")
            }
        }
      }

}
@Composable
fun chatbox(message: String){
    Text(text = message, fontSize = 32.sp, fontWeight = FontWeight(400))
}
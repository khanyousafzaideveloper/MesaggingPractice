package com.example.messagespractice

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MessagingScreen() {
    Column (modifier= Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top){


        var message by remember { mutableStateOf("") }
        var texts by remember {
            mutableStateOf(listOf<String>())
        }

        LazyColumn(modifier = Modifier
            .weight(1f)
            .fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            items(texts) { messages ->
                Row(modifier = Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.End) {
                    Card(
                        modifier = Modifier
                            .padding(16.dp)
                            .background(Color.Blue)
                            .fillMaxWidth(0.45f)
                    ) {
                        Text(
                            text = messages,
                            fontWeight = FontWeight(500),
                            modifier = Modifier
                                .padding(8.dp)
                                .align(Alignment.Start)
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(16.dp)
                        .background(Color.Magenta)
                ) {
                    Text(text = messages, fontWeight = FontWeight(500), modifier = Modifier
                        .padding(8.dp) .background(Color(66 ,133, 244, 43, )))
                }
            }
        }
        fun OnSend() {
            if (message.isNotBlank()) {
                texts = texts + message
                message = ""
            }

        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center
            ) {

                OutlinedTextField(
                    value = message,
                    onValueChange = { message = it },
                    Modifier.padding(end = 4.dp)
                )
                Button(onClick = { OnSend() }) {
                    Text(text = "Send")
                }
            }
        }
    }
//@Composable
//fun Chatbox(message: String){
//    Text(text = message, fontSize = 32.sp, fontWeight = FontWeight(400))
//}


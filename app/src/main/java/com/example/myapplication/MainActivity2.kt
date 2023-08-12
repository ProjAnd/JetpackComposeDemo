package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //sendMessage(name = "Hi Android")
            Surface(modifier = Modifier.fillMaxSize()){
                sendMessage(name = "Hi Android")
            }
        }

    }

    @Composable
    fun sendMessage(name: String, modifier: Modifier = Modifier) {
        MyApplicationTheme() {
            Row (modifier = Modifier.padding(all = 8.dp)){
                Box {

                    Text(
                        fontSize = 32.sp,
                        text = "I am Composable activity",
                        modifier = modifier,
                        color = Color.Cyan,
                        style =  MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Surface(modifier = Modifier.fillMaxSize()) {
            sendMessage("Hi Android")
        }
    }

}
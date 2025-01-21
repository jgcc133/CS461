package com.example.cs461

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.cs461.practices.ClickBehaviour


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            JetPackComposeTutorial()
//            TaskManagerTutorial()
//            ComposeQuadrant()
            ClickBehaviour()

        }
    }
}
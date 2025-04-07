package com.example.task3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.task3.ui.theme.Task3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task3Theme {
                App()
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun App() {
    val navController = rememberNavController()
    Surface(color = MaterialTheme.colorScheme.background) {
        Navigation(navController = navController)
    }
}

package com.example.basic_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basic_compose.ui.theme.Basic_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Basic_composeTheme {

                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Composable
fun HomeGreetingCard(name: String) {
    Text(text = "Hey $name , Good moring")
    Text(text = "You are in hyderabadd")
    Text(text = "Search for some cool vibes")
    Text(text = "Hey $name , Good moring")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Basic_composeTheme {
        Greeting("Android")
    }
}

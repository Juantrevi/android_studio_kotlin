package com.stu71563.firstapp

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.stu71563.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}

/*
* @Composable
* is a function that defines a UI component.
* It is a function that takes in data and returns a UI component.
* */
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    FirstAppTheme {
        BirthdayCard(message = "Happy Birthday!")
    }
}

@Composable
fun BirthdayCard(message: String, modifier: Modifier = Modifier) {
    Text(
        text = "Happy Birthday!"
    )
}
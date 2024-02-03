package com.stu71563.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
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
                    GreetingText(message = "Happy Birthday Sam!", from = "From: Stuart")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    FirstAppTheme {
        GreetingText(message = "Happy Birthday Sam!", from = "From: Stuart")
    }
}

/*
* @Composable
* is a function that defines a UI component.
* It is a function that takes in data and returns a UI component.
* */
/*
* GreetingText()
* function displays text in the UI. It does so by calling the Text() composable function.
* */
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
        )
    Text(
        text = from,
        fontSize = 36.sp,
    )
    }
}
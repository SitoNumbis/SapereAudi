package com.sito.sapereaudi.ui.views

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.sito.sapereaudi.ui.theme.SapereAudiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context=LocalContext.current as Activity
            SapereAudiTheme {
                MainMenu { id ->
                    mainMenuClickHandler(context = context , id)
                }
            }
        }
    }
}

fun mainMenuClickHandler(context: Context, who: Int) {
    Toast.makeText(context,who.toString(),Toast.LENGTH_SHORT).show()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SapereAudiTheme {
       // MainMenu(mainMenuClickHandler())
    }
}
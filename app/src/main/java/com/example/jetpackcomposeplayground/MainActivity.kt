package com.example.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.Height
import androidx.ui.layout.Spacing
import androidx.ui.res.imageResource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun NewsStory() {
    val image = imageResource(R.drawable.header)
    Column(
        modifier = Spacing(16.dp)
    ) {
        val imageModifier = Height(180.dp)

        /*Image(image, modifier = imageModifier,
                contentScale = ContentScale.Crop)*/

        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }
}
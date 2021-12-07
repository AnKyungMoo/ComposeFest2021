package com.km.mylayoutinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.km.mylayoutinjetpackcompose.ui.theme.MyLayoutInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLayoutInJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LayoutsCodelab()
                }
            }
        }
    }
}

@Composable
fun LayoutsCodelab() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "LayoutsCodelab") },
                actions = { IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Favorite, contentDescription = null)
                } }
            )
        }
    ) { innerPadding ->
        BodyContents(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun BodyContents(modifier: Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Text("Hi there!")
        Text(text = "Thanks for going through the Layouts codelab")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyLayoutInJetpackComposeTheme {
        LayoutsCodelab()
    }
}
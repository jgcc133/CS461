package com.example.cs461.practices

/*
All the four practices from Week 1 in one kt file
*/

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cs461.R


@Composable
fun JCTContent(headerBanner: Int, headerString: String, contentString1: String, contentString2: String, modifier: Modifier=Modifier){
    val bannerModifier = Modifier.size(150.dp)
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row(){
            Image(
                painter=painterResource(headerBanner),
                contentDescription = "Practise Banner for Jetpack Compose Tutorial",
                contentScale = ContentScale.Fit
            )
        }
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = headerString,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
        Row (
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        ) {
            Text(
                text = contentString1,
                textAlign = TextAlign.Justify
            )
        }
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = contentString2,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetPackComposeTutorial() {
    val headerBanner = R.drawable.practise_banner
    val headerString = "Jetpack Compose tutorial"
    val contentString1 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs."
    val contentString2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."

    JCTContent (
        headerBanner = headerBanner,
        headerString = headerString,
        contentString1 = contentString1,
        contentString2 = contentString2
    )

}

@Composable
fun TMContent(img: Int, content1: String, content2: String, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Row() {
            Image(
                painter = painterResource(img),
                contentDescription = "All Tasks Completed"
            )
        }
        Row() {
            Text(
                text = content1,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
            )

        }
        Row(){
            Text(
                text = content2,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerTutorial() {
    val img = R.drawable.ic_task_completed
    val content1 = "All tasks completed"
    val content2 = "Nice work!"
    TMContent(
        img = img,
        content1 = content1,
        content2 = content2
    )
}

@Composable
fun CQContent(
    tlTextA: String, tlTextB: String,
    trTextA: String, trTextB: String,
    blTextA: String, blTextB: String,
    brTextA: String, brTextB: String
) {
    Row(
        modifier = Modifier.fillMaxSize()
    ){
        Column(modifier = Modifier.fillMaxWidth(fraction = 0.5F)
        ){
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight(fraction = 0.5F)
                    .background(color = Color(0xFFEADDFF))
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(16.dp)) {
                    Row() {
                        Text(text=tlTextA,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 16.dp))
                    }
                    Row() {
                        Text(text = tlTextB,
                            textAlign = TextAlign.Justify)
                    }
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight(fraction = 1F)
                    .background(color = Color(0xFFB69DF8))
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(16.dp)) {
                    Row() {
                        Text(text=blTextA,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 16.dp))
                    }
                    Row() {
                        Text(text = blTextB,
                            textAlign = TextAlign.Justify)
                    }
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth(fraction = 1F)) {
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight(fraction = 0.5F)
                    .background(color = Color(0xFFD0BCFF))
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(16.dp)) {
                    Row() {
                        Text(text=trTextA,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 16.dp))
                    }
                    Row() {
                        Text(text = trTextB,
                            textAlign = TextAlign.Justify)
                    }
                }

            }
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxHeight(fraction = 1F)
                    .background(color = Color(0xFFF6EDFF))
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(16.dp)) {
                    Row() {
                        Text(text=brTextA,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 16.dp))
                    }
                    Row() {
                        Text(text = brTextB,
                            textAlign = TextAlign.Justify)
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrant() {
    val tl1 = "Text composable"
    val tl2 = "Displays text and follows the recommended Material Design guidelines."
    val tr1 = "Image composable"
    val tr2 = "Creates a composable that lays out and draws a given Painter class object."
    val bl1 = "Row composable"
    val bl2 = "A layout composable that places its children in a horizontal sequence."
    val br1 = "Column composable"
    val br2 = "A layout composable that places its children in a vertical sequence."
    CQContent(
        tlTextA = tl1, tlTextB = tl2,
        trTextA = tr1, trTextB = tr2,
        blTextA = bl1, blTextB = bl2,
        brTextA = br1, brTextB = br2
    )
}
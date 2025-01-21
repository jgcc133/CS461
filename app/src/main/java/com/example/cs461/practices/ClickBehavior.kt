package com.example.cs461.practices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.cs461.R
import com.example.cs461.ui.theme.CS461Theme

@Composable
fun Lemon(name: String, modifier: Modifier = Modifier) {
    val squeezeClicks = (5..10).random()
    var squeezeClicked = 0
    var result by remember{ mutableIntStateOf(1) }
    val res = when(result){
        1 -> Pair(R.drawable.lemon_tree, R.string.str_start)
        2 -> Pair(R.drawable.lemon_squeeze, R.string.str_squeeze)
        3 -> Pair(R.drawable.lemon_drink, R.string.str_start)
        else -> Pair(R.drawable.lemon_restart, R.string.str_again)
    }
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(
            Modifier.fillMaxHeight(0.1F)
                .background(androidx.compose.ui.graphics.Color.Yellow)
        ){
            Text(
                text = name,
                fontSize = 32.sp
            )
        }

        Row(
            Modifier.fillMaxHeight(0.6F),
            verticalAlignment = Alignment.CenterVertically
        ){

            Image(
                painter = painterResource(res.first),
                contentDescription = result.toString(),
                Modifier.clickable {
                    if (result == 4) {
                        result = 1
                    }else if (result == 2) {
                        squeezeClicked += 1
                        if (squeezeClicked == squeezeClicks){
                            result += 1
                        }
                    }else{
                        result += 1
                    }
                }
            )

        }
        Row() {
            Text(stringResource(res.second))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ClickBehaviour() {
    CS461Theme {
        Lemon("Lemonade")
    }
}
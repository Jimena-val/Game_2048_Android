package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.MyTextView
import java.text.Normalizer

@Preview(showBackground = true)
@Composable

fun Filas() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "1")
        VerticalDivider()
        Spacer(Modifier.height(height = 20.dp))

        Column() {
            Text(text = "2")
            Spacer(Modifier.height(height = 20.dp))
            Text(text = "4")
            Spacer(Modifier.height(height = 20.dp))
            Text(text = "5")
            Spacer(Modifier.height(height = 20.dp))
            Text(text = "6")
        }

        Column(Modifier.width(width = 100.dp)) {
            Text(text = "3")
            Row() {
                Row(Modifier
                    .background(Color.Red)
                    .width(width = 20.dp)
                    .height(height = 20.dp)) {
                }
                Row(Modifier
                    .background(Color.Blue)
                    .width(width = 40.dp)
                    .height(height = 20.dp)) { }
            }
            Row() {
                Row(
                    Modifier
                        .background(Color.Black)
                        .width(width = 40.dp)
                        .height(height = 20.dp)
                ) { }

                Row(
                    Modifier
                        .background(Color.Red)
                        .width(width = 20.dp)
                        .height(height = 20.dp)
                ) { }
            }
        }
    }
}

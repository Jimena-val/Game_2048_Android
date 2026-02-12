package com.example.moviles.componentes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.ui.theme.coloramarilllo
import java.security.KeyStore


@Preview(showBackground = true)
@Composable
fun Modificador (){
    Text(text = "Jimena Valencia",
        modifier = Modifier.fillMaxSize()
            .background(Color(0xFFBD471C))
            .padding(all = 7.dp)
            //.background(Color.LightGray)
            .padding(top = 14.dp)
            .alpha(alpha = 0.5f)
            .blur(0.8.dp)//difuminado
            .border(2.dp, Color.DarkGray)
            .shadow(elevation = 20.dp)
            .rotate(180f),
        color = coloramarilllo,
        fontSize =20.sp,

    )
}
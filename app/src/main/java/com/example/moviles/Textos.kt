package com.example.moviles

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(){
    val myFontColor = Color.Magenta
    val tamanoFuente = 20.sp
    Text( text = stringResource(R.string.saludo_txt),
            color = myFontColor,
            fontSize = tamanoFuente,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.Cursive,
            letterSpacing = 0.sp, //espacio entre letras
            lineHeight = 3.sp, //espacio entre renglones
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Justify,
            maxLines = 1, //maximo de lineas
            minLines = 1, //minimo de líneas
            overflow = TextOverflow.Ellipsis //agregar tres puntos cuando hay mas texto (...)
        )
}
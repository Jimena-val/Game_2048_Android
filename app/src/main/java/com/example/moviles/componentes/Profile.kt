package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Composable
@Preview(showBackground = true)
fun InterfazCastan() {
    Column(modifier = Modifier.background(Color.DarkGray)
    ) {
        Box(modifier = Modifier.fillMaxWidth().height(200.dp).background(Color(0xFF074679))
        ) {
            // AVATAR (imagen circular)
            Box(modifier = Modifier.size(100.dp).background(Color.LightGray).align(Alignment.BottomCenter)) {
                Box(modifier = Modifier.fillMaxSize().background(Color.DarkGray), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "Avatar"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(60.dp))
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "MULTI SERVICIOS", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color.White)
            Text(text = "CASTAN", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(top = 4.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Multiservicios Castan:", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White)
            Text(text = "Soluciones para tu hogar en Tampico", fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(top = 4.dp))
            Text(text = "128 seguidores • 1 seguidos", fontSize = 12.sp, color = Color.Gray, modifier = Modifier.padding(top = 8.dp))
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp), horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier.weight(1f).height(40.dp).background(Color(0xFF2196F3)), contentAlignment = Alignment.Center) {
                Text(text = "Mensaje", fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color.White)
            }
            Box(
                modifier = Modifier.weight(1f).height(40.dp).background(Color.LightGray), contentAlignment = Alignment.Center) {
                Text(text = "Seguir", fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color.Black)
            }
            Box(modifier = Modifier.weight(1f).height(40.dp).background(Color.LightGray), contentAlignment = Alignment.Center) {
                Text(text = "Buscar", fontSize = 14.sp, fontWeight = FontWeight.Medium, color = Color.Black)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
            Text(text = "En Multiservicios Castan ofrecemos todo tipo de servicios para el mantenimiento y reparación del hogar en Tampico, Tamaulipas. Desde aire acondicionado, pintura, plomeria y electricidad, hasta albañilería, herrería e impermeabilizado.",
                fontSize = 14.sp, color = Color.LightGray, lineHeight = 20.sp, textAlign = TextAlign.Justify)
        }

        Spacer(modifier = Modifier.height(16.dp))

    }
}
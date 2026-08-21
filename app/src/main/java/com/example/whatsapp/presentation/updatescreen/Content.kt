package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.ui.theme.GreenLight


@Composable

fun MyStatus() {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {


        Box {

            Image(
                painter = painterResource(id = R.drawable.salman_khan),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape)
            )

            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(25.dp)
                    .align(Alignment.BottomEnd)
                    .padding(2.dp)
                    .background(
                        GreenLight,
                        shape = RoundedCornerShape(12.dp)
                    )
            )
        }

        Spacer(Modifier.width(12.dp))

        Column() {

            Text("My Status", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text("Tap to add status", fontSize = 14.sp, color = Color.Gray)

        }


    }
}

data class StatusData(val image: Int, val name: String, val time: String)

@Composable
fun StatusItem(statusData: StatusData) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(statusData.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(shape = CircleShape)
                .padding(4.dp)
        )

        Spacer(Modifier.width(12.dp))

        Column() {

            Text(statusData.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(statusData.time, fontSize = 14.sp, color = Color.Gray)
        }

    }

}

@Composable
@Preview(showSystemUi = true)
fun ChannelItems() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(R.drawable.neat_roots),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(4.dp)

        )

        Spacer(Modifier.width(12.dp))

        Column() {
            Text("Neat Roots", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Latest news in tech", fontSize = 14.sp, color = Color.Gray)
        }


    }

}
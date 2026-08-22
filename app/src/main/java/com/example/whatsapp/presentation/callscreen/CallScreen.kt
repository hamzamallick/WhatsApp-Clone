package com.example.whatsapp.presentation.callscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.homescreen.BottomNaviContent
import com.example.whatsapp.ui.theme.GreenLight

@Composable
@Preview(showSystemUi = true)
fun CallScreen() {


    val sampleCall = listOf(
        Call(
            image = R.drawable.salman_khan,
            name = "Salman Khan",
            time = "Yesterday, 8:13 PM",
            isMissed = true
        ), Call(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha",
            time = "Monday, 8:13 PM",
            isMissed = false
        ), Call(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            time = "Sunday, 8:13 PM",
            isMissed = true
        ), Call(
            image = R.drawable.ajay_devgn,
            name = "Ajay",
            time = "Saturday, 8:12 PM",
            isMissed = true
        ), Call(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan Bam",
            time = "Friday, 8:19 AM",
            isMissed = false
        ), Call(
            image = R.drawable.carryminati,
            name = "Carry",
            time = "Today, 10:13 PM",
            isMissed = false
        )
    )

    Scaffold(
        topBar = {
            Column() {

                TopBarCall()
                HorizontalDivider()

            }
        },
        bottomBar = { BottomNaviContent() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = GreenLight,
                modifier = Modifier.size(60.dp),
                contentColor = Color.White
            ) {

                Icon(
                    painter = painterResource(R.drawable.add_call),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )

            }
        }

    ) {

        Column(
            modifier = Modifier
                .padding(it)
                .padding(vertical = 10.dp)
        ) {

            FavoriteSection()


            Spacer(Modifier.height(12.dp))

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = GreenLight
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Text(
                    "Start a new call",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }


            Text(
                "Recent Calls", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
            )

            LazyColumn() {

                items(sampleCall) { data ->
                    CallItemDesign(data)
                }
            }


        }
    }


}
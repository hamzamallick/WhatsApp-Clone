package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.homescreen.BottomNaviContent
import com.example.whatsapp.presentation.homescreen.HomeScreen
import com.example.whatsapp.ui.theme.GreenLight

@Composable
@Preview(showSystemUi = true)

fun UpdateScreen() {

    val scrollState = rememberScrollState()

    val sampleData = listOf(
        StatusData(
            image = R.drawable.tripti_dimri,
            name = "Tripti",
            time = "4:00 PM"
        ),
        StatusData(
            image = R.drawable.carryminati,
            name = "Carry",
            time = "8:00 PM"
        ),
        StatusData(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan",
            time = "7:00 AM"
        ),
        StatusData(
            image = R.drawable.ajay_devgn,
            name = "Ajay",
            time = "2:00 PM"
        )

    )

    val channelSampleItems = listOf(
        ChannelItems(
            image = R.drawable.neat_roots,
            channelName = "Neat Roots",
            description = "Latest news in tech"
        ),
        ChannelItems(
            image = R.drawable.bhuvan_bam,
            channelName = "Bhuvan Bam",
            description = "Comedy videos"
        ),
        ChannelItems(
            image = R.drawable.mrbeast,
            channelName = "Mr Beast",
            description = "Vlogs"
        ),
        ChannelItems(
            image = R.drawable.salman_khan,
            channelName = "Being Human",
            description = "Salman Vlogs"
        )
    )

    Scaffold(
        floatingActionButton = {

            FloatingActionButton(
                onClick = {},
                containerColor = GreenLight,
                modifier = Modifier.size(60.dp),
                contentColor = Color.White
            ) {

                Icon(
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )

            }
        },
        bottomBar = {
            BottomNaviContent()
        },
        topBar = {

            Column() {
                TopBarUpdate()
                HorizontalDivider()
            }

        }
    ) {

        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)

        ) {

            Text(
                "Status", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            MyStatus()

            sampleData.forEach {
                StatusItem(statusData = it)
            }

            HorizontalDivider(color = Color.Gray)

            Text(
                "Channels", fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Text(
                "Stay updated on topics that matters to you. Find channels to follow below",
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Text(
                "Find channels to follow",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            channelSampleItems.forEach {
                ChannelItems(channelitem = it)
            }


        }
    }
}
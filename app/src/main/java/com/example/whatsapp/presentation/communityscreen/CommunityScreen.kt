package com.example.whatsapp.presentation.communityscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.homescreen.BottomNaviContent
import com.example.whatsapp.ui.theme.GreenLight

@Composable
@Preview(showSystemUi = true)
fun CommunityScreen() {


    val sampleCommunities = listOf(
        Communities(
            image = R.drawable.img1,
            communityName = "Tech Enthusiast",
            communitymembers = "972"
        ),
        Communities(
            image = R.drawable.img1,
            communityName = "Wildlife Photography",
            communitymembers = "237"
        ),
        Communities(
            image = R.drawable.img1,
            communityName = "Weddings",
            communitymembers = "19"
        ),
        Communities(
            image = R.drawable.img1,
            communityName = "Daily Vlogs",
            communitymembers = "623"
        ),
    )

    Scaffold(
        topBar = {

            Column() {
                TopBarCommunity()
                HorizontalDivider()
            }

        },
        bottomBar = { BottomNaviContent() }
    ) {

        Column(modifier = Modifier.padding(it)) {

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = GreenLight
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Start a new Community", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(8.dp))

            Text(
                "Your Communities", fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            LazyColumn() {

                items(sampleCommunities) {
                    CommunityItemDesign(communities = it)
                }


            }


        }
    }

}



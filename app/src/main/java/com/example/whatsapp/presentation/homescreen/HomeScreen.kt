package com.example.whatsapp.presentation.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.R
import com.example.whatsapp.presentation.homescreen.dataclass.ChatDesignModel
import com.example.whatsapp.ui.theme.GreenLight

@Composable
@Preview(showSystemUi = true)
fun HomeScreen(
) {


    val chatData = listOf(
        ChatDesignModel(
            R.drawable.salman_khan,
            "Salman Khan",
            "10:00 AM",
            "Kahan ho Hamza"
        ),
        ChatDesignModel(
            R.drawable.rashmika,
            "Rashmika",
            "10:00 AM",
            "Kahan ho Hamza"
        ),
        ChatDesignModel(
            R.drawable.sharadha_kapoor,
            "Sharadha",
            "10:00 AM",
            "Kahan ho Hamza"
        ),
        ChatDesignModel(
            R.drawable.akshay_kumar,
            "Akshay",
            "10:00 AM",
            "hey"
        ),
        ChatDesignModel(
            R.drawable.mrbeast,
            "Mr Beast",
            "10:00 AM",
            "hey"
        ),
        ChatDesignModel(
            R.drawable.bhuvan_bam,
            "Bhuvan Bam",
            "10:00 AM",
            "hey"
        ),
        ChatDesignModel(
            R.drawable.carryminati,
            "Carry",
            "10:00 AM",
            "hey"
        ), ChatDesignModel(
            R.drawable.disha_patani,
            "Disha",
            "10:00 AM",
            "hey"
        ), ChatDesignModel(
            R.drawable.kartik_aaryan,
            "Kartik",
            "10:00 AM",
            "hey"
        ), ChatDesignModel(
            R.drawable.rajkummar_rao,
            "Rajkuman",
            "10:00 AM",
            "hey"
        ), ChatDesignModel(
            R.drawable.tripti_dimri,
            "Tripti",
            "10:00 AM",
            "hey"
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
                    painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )

            }
        },
        topBar = {

            Column(modifier = Modifier.padding(top = 20.dp)) {

                TopBarContent()

                HorizontalDivider()

            }
        },
        bottomBar = {
            BottomNaviContent()
        }


    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
        ) {
            items(chatData) {
                ChatDesign(chatDesignModel = it)
            }
        }

    }

}

@Composable
//@Preview(showBackground = true)
fun TopBarContent() {


    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            "WhatsApp",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = GreenLight,
            modifier = Modifier
                .padding(start = 16.dp, top = 10.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.End
        ) {


            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)

                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.search),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)

                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.more),
                    contentDescription = null,
                    modifier = Modifier.size(25.dp)

                )
            }


        }


    }

}

@Composable
//@Preview(showSystemUi = true)
fun BottomNaviContent() {

    BottomAppBar(tonalElevation = 15.dp, containerColor = Color.White) {

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column(
                modifier = Modifier.padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.message_4475881),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    "Message",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
            Column(
                modifier = Modifier.padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.update_icon),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    "Updates",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
            Column(
                modifier = Modifier.padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.communities_icon),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    "Communities",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
            Column(
                modifier = Modifier.padding(horizontal = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    "Calls",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
        }
    }
}
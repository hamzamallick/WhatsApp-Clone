package com.example.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.whatsapp.ui.theme.GreenLight

@Composable
@Preview(showSystemUi = true)

fun UpdateScreen() {

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

        Column(modifier = Modifier.padding(it)) { }
    }
}
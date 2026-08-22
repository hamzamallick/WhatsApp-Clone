package com.example.whatsapp.presentation.callscreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material3.Text
import com.example.whatsapp.R

@Composable
@Preview(showSystemUi = true)
fun FavoriteSection() {

    val sampleFavorites = listOf(
        FavoriteContact(
            image = R.drawable.salman_khan,
            name = "Salman Khan"
        ), FavoriteContact(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha"
        ), FavoriteContact(
            image = R.drawable.mrbeast,
            name = "Mr Beast"
        ), FavoriteContact(
            image = R.drawable.disha_patani,
            name = "Disha Pathani"
        ), FavoriteContact(
            image = R.drawable.rajkummar_rao,
            name = "Raj Kumar"
        ), FavoriteContact(
            image = R.drawable.ajay_devgn,
            name = "Ajay"
        ), FavoriteContact(
            image = R.drawable.akshay_kumar,
            name = "Akshay"
        ), FavoriteContact(
            image = R.drawable.carryminati,
            name = "Carry"
        ), FavoriteContact(
            image = R.drawable.kartik_aaryan,
            name = "Kartik"
        )
    )

    Column(Modifier.padding(start = 16.dp, bottom = 8.dp)) {

        Text(
            "Favourites", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {

            sampleFavorites.forEach {

                FavouriteItem(it)

            }
        }


    }

}

data class FavoriteContact(
    val image: Int,
    val name: String
)
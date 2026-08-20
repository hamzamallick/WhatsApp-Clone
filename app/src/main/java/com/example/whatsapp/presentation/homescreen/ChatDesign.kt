package com.example.whatsapp.presentation.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.wear.compose.material3.Text
import com.example.whatsapp.R
import com.example.whatsapp.presentation.homescreen.dataclass.ChatDesignModel

@Composable
fun ChatDesign(chatDesignModel: ChatDesignModel) {

    Row(
        modifier = Modifier.padding(15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = chatDesignModel.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.width(12.dp))

        Column() {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(text = chatDesignModel.name, fontSize = 22.sp, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(text = chatDesignModel.time, color = Color.Gray)
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = chatDesignModel.message, color = Color.Gray, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        }


    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewChat() {

}
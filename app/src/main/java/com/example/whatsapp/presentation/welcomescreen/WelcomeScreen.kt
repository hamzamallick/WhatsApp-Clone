package com.example.whatsapp.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.whatsapp.navigation.Routes
import com.example.whatsapp.ui.theme.GreenDark
import com.example.whatsapp.ui.theme.GreenLight


@Composable
fun WelcomeScreen(navHostController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Image(
            painter = painterResource(com.example.whatsapp.R.drawable.whatsapp_sticker),
            contentDescription = null,
            modifier = Modifier.size(300.dp),

            )

        Text(
            "Welcome To WhatsApp", fontSize = 22.sp,
            fontWeight = FontWeight.Bold,

            )

        Text(
            text = buildAnnotatedString {

                withStyle(
                    style = SpanStyle(
                        color = Color.Gray
                    )
                ) {

                    append("Read our ")

                }



                withStyle(
                    style = SpanStyle(
                        color = GreenLight
                    )
                ) {
                    append("Privacy Policy")
                }

                withStyle(
                    style = SpanStyle(
                        color = Color.Gray
                    )
                ) {
                    append(" Tap to agree and continue")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Gray
                    )
                ) {
                    append("\naccept the")
                }

                withStyle(
                    style = SpanStyle(
                        color = GreenLight
                    )
                ) {
                    append(" Terms of Service")
                }
            },
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = { navHostController.navigate(Routes.UserRegistrationScreen) },
            modifier = Modifier.size(280.dp, 45.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = GreenDark,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Agree and Continue",
                fontSize = 18.sp
            )
        }

    }

}
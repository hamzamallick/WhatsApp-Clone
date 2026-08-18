package com.example.whatsapp.presentation.userregistrationscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp.ui.theme.GreenDark
import com.example.whatsapp.ui.theme.GreenLight


@Composable
fun UserRegistrationScreen() {

    var expanded by remember {
        mutableStateOf(false)
    }

    var selectedCountry by remember {
        mutableStateOf("India")
    }

    var countryCode by remember {
        mutableStateOf("+91")
    }

    var phoneNumber by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Enter your phone number",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = GreenDark
        )

        Spacer(
            modifier = Modifier.height(28.dp)
        )

        Text(
            text = buildAnnotatedString {

                append("WhatsApp will need to verify your phone number. ")

                withStyle(
                    style = SpanStyle(
                        color = GreenLight
                    )
                ) {
                    append("What's\nmy number?")
                }
            },
            textAlign = TextAlign.Center
        )

        Spacer(
            modifier = Modifier.height(28.dp)
        )

        TextButton(
            onClick = {
                expanded = true
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.White
            )
        ) {

            Box(
                modifier = Modifier.width(230.dp)
            ) {

                Text(
                    text = selectedCountry,
                    color = Color.Black,
                    fontSize = 16.sp,
                    modifier = Modifier.align(Alignment.Center)
                )

                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = GreenLight,
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp),
            thickness = 2.dp,
            color = GreenLight
        )

        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }, modifier = Modifier.width(200.dp)) {
            listOf(
                "India",
                "China",
                "USA",
                "Japan",
                "Afghanistan",
                "Argentina",
                "Australia",
                "Saudi Arabia",
                "UAE",
                "Kuwait",
                "Bahrain",
                "Oman",
                "Canada",
                "Russia",
                "France",
                "Bangladesh",
                "Sri Lanka",
                "Pakistan",
                "Nepal",
                "Iran",
                "Iraq",
                "Italy",
                "New Zealand",
                "Qatar",
                "Singapore",
                "South Africa",
                "Switzerland",
                "Turkey"
            ).forEach { country ->
                DropdownMenuItem(text = { Text(text = country) }, onClick = {
                    selectedCountry = country
                    expanded = false
                })
            }
        }

        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            TextField(
                value = countryCode, onValueChange = {
                    countryCode = it
                }, modifier = Modifier.width(70.dp), singleLine = true,
                textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = GreenLight,
                    unfocusedIndicatorColor = GreenLight,
                    unfocusedContainerColor = Color.Transparent
                )
            )

            Spacer(Modifier.width(10.dp))

            TextField(
                value = phoneNumber, onValueChange = {
                phoneNumber = it
            }, placeholder = { Text("Phone Number") }, singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = GreenLight,
                    unfocusedIndicatorColor = GreenLight,
                    unfocusedContainerColor = Color.Transparent
                )
            )
        }

        Spacer(Modifier.height(16.dp))

        Text(
            "Carrier charges may apply",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = .6f)
        )

        Spacer(Modifier.height(28.dp))

        Button(onClick = {},
            shape = RoundedCornerShape(6.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = GreenDark
            )
        ) {
            Text("Next", fontSize = 16.sp)
        }


    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewUserRegs(){
    UserRegistrationScreen()
}
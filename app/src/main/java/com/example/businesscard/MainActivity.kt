package com.example.businesscard

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCard(
                        fullName = "Червов Виталий Андреевич",
                        title = "Андройд разработчик",
                        email = "MyEmail@gmail.com",
                        phone = "8989891312313",
                        place = "Место работые: Казань, КНИТУ-КАИ",
                        desciption = "Пишу программы на адройд очень много лет",
                        dateStarted = "Начал работать с: 02-09-2024",
                        modifier = Modifier.padding()
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(fullName: String,
                 title: String,
                 email: String,
                 phone: String,
                 desciption: String,
                 place: String,
                 dateStarted: String,
                 modifier: Modifier = Modifier) {
    Box(modifier
        .fillMaxSize()
        .background(Color.LightGray)){
        Column(modifier
            .fillMaxWidth()
            .padding(8.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.dog_png_22667),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
            )
            Text(
                text = fullName,
                color = Color.Cyan,
                modifier = modifier
            )
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = modifier
            )
            Text(
                text = dateStarted,
                modifier = modifier
            )

            Text(
                text = place,
                modifier = modifier
            )

            Text(
                text = desciption,
                modifier = modifier
            )
            Column(modifier = Modifier.padding(top=100.dp),
                verticalArrangement = Arrangement.Bottom){
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(R.drawable.phone),
                        contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Text(
                        text = phone,
                        modifier = modifier
                    )
                }
                Row(
                    modifier.padding(top=10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(R.drawable.message),
                        contentDescription = null,
                        modifier = Modifier.height(50.dp)
                    )
                    Text(
                        text = email,
                        modifier = modifier
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard(
            fullName = "Червов Виталий Андреевич",
            title = "Андройд разработчик",
            email = "MyEmail@gmail.com",
            phone = "8989891312313",
            place = "Место работы: Казань, КНИТУ-КАИ",
            desciption = "Пишу программы на адройд очень много лет",
            dateStarted = "Начал работать с: 02-09-2024",
        )
    }
}
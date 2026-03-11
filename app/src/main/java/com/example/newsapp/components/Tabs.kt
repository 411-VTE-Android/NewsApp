package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.DarkText
import com.example.newsapp.ui.theme.InnactiveTextGrey
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.ui.theme.PrimaryPurple

@Composable
fun Tabs() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Noticias",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = DarkText
            )
            Box(
                modifier = Modifier
                    .width(30.dp)
                    .height(3.dp)
                    .background(color = PrimaryPurple)
            )
        }

        Text(
            text = "Eventos",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = InnactiveTextGrey
        )
        Text(
            text = "Clima",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = InnactiveTextGrey
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun TabsPreview() {
    NewsAppTheme() {
        Tabs()
    }
}
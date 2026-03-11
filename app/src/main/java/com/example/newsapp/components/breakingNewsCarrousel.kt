package com.example.newsapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.models.News
import com.example.newsapp.models.breakingNewsList
import com.example.newsapp.ui.theme.DarkText
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun breakingNewsCarrousel(newsList: List<News>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Últimas noticias",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = DarkText,
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
        )
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 15.dp),
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(newsList) { news ->
                FeaturedNewsCard(news = news)
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun breakingNewsCarrouselPreview() {
    NewsAppTheme() {
        breakingNewsCarrousel(newsList = breakingNewsList)
    }
}
package com.example.newsapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.models.News
import com.example.newsapp.ui.theme.DarkText
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.models.breakingNewsList
import com.example.newsapp.models.worlwideNewsList
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun worldwideNewsSection(newsList: List<News>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Alrededor del mundo",
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            color = DarkText,
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 10.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(horizontal = 15.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(15.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
        ) {
            items(newsList) { news ->
                worldwideNewsCard(news = news)
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun worldwideNewsSectionPreview() {
    NewsAppTheme() {
        worldwideNewsSection(newsList = worlwideNewsList)
    }
}
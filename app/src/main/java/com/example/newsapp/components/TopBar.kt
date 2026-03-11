package com.example.newsapp.components

import android.R
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddHome
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AddHome
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.ui.theme.PrimaryPurple

@Composable
fun TopBar() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .border(
                width = 2.dp,
                color = PrimaryPurple,
                shape = RoundedCornerShape(25.dp)
            ),
        placeholder = {
            Text(
                "Buscar",
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.AddHome,
                contentDescription = "Buscar",
                tint = Color.Black
            )
        },
        shape = RoundedCornerShape(25.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent
        )
    )
}

@Preview(
    showBackground = true
)
@Composable
fun TopBarPreview() {
    NewsAppTheme() {
        TopBar()
    }
}
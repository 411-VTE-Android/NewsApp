package com.example.newsapp.models

import android.icu.text.CaseMap

data class News (
    val id : Int,
    val title : String,
    val date : String,
    val imageUrl : String
)

val breakingNewsList = listOf(
    News(1, "El presidente de EE.UU no muestra signos de arrepentimiento", "08/02/2024", ""),
    News(2, "Bañarse en la piscina del desierto de cleopatra", "09/02/2024", "")
)

val worlwideNewsList = listOf(
    News(1, "El presidente de EE.UU no muestra signos de arrepentimiento", "", "https://images.unsplash.com/photo-1585829365295-ab7cd400c167?q=80&w=500"),
    News(2, "Bañarse en la piscina del desierto de cleopatra", "", ""),
    News(3, "Gigantes tecnológicos y el uso de la IA", "", ""),
    News(4, "El rover de marte envía fotos impactantes", "", "")

)
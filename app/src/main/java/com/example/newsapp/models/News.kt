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
    News(2, "Bañarse en la piscina del desierto de cleopatra", "09/02/2024", ""),
    News(3, "Nuevo avance en computación cuántica revoluciona la seguridad", "11/03/2026", ""),
    News(4, "Descubren exoplaneta con condiciones similares a la Tierra", "10/03/2026", ""),
    News(5, "Bolsas mundiales cierran al alza tras nuevos acuerdos comerciales", "10/03/2026", ""),
    News(6, "Lanzamiento exitoso del nuevo satélite de observación climática", "09/03/2026", ""),
    News(7, "Desarrollan tratamiento prometedor para enfermedades autoinmunes", "08/03/2026", "")
)

val worlwideNewsList = listOf(
    News(1, "El presidente de EE.UU no muestra signos de arrepentimiento", "", "https://cdn.pixabay.com/photo/2016/10/18/18/35/dementia-1750965_1280.jpg"),
    News(2, "Bañarse en la piscina del desierto de cleopatra", "", "https://cdn.pixabay.com/photo/2024/03/21/23/15/ai-generated-8648646_1280.jpg"),
    News(3, "Gigantes tecnológicos y el uso de la IA", "", "https://cdn.pixabay.com/photo/2023/10/30/05/02/ai-generated-8351759_1280.png"),
    News(4, "El rover de marte envía fotos impactantes", "", "https://cdn.pixabay.com/photo/2026/02/26/18/56/mv-fotos-spacecraft-10145647_1280.png"),
    News(5, "Trenes de levitación magnética de nueva generación llegan a Europa", "", ""),
    News(6, "El renacimiento de la arquitectura sostenible en las grandes metrópolis", "", ""),
    News(7, "Misión al fondo del océano revela especies marinas nunca antes vistas", "", ""),
    News(8, "Histórico festival cultural en Japón rompe récord de asistencia", "", ""),
    News(9, "Cumbre global del clima establece nuevas metas de energía limpia para 2030", "", "")

)
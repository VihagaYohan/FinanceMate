package com.techtribeservices.financemate.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.techtribeservices.financemate.R

val RobotoFont = FontFamily(
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_thin, FontWeight.Thin),
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_black, FontWeight.Black)
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp
    ),
    displayLarge = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    titleLarge = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    titleMedium = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = RobotoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)
package com.udemy_android.firstapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.udemy_android.firstapp.R
//
//val CustomFont = FontFamily(
//    Font(R.font.notosanskr)
//)

object AppFont {
    val Noto = FontFamily(
        Font(R.font.notosanskr_variable)
    )
}



private val defaultTypography = Typography()

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = AppFont.Noto),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = AppFont.Noto),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = AppFont.Noto),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = AppFont.Noto),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = AppFont.Noto),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = AppFont.Noto),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = AppFont.Noto),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = AppFont.Noto),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = AppFont.Noto),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = AppFont.Noto),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = AppFont.Noto),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = AppFont.Noto),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = AppFont.Noto),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = AppFont.Noto),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = AppFont.Noto)
)
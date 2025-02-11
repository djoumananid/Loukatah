package com.example.loukatah.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = OceanBlue,
    secondary = SkyBlue,
    tertiary = Coral,
    background = CloudWhite,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = DeepCharcoal,
    onTertiary = Color.White,
    error = ErrorRed,
)

private val DarkColorScheme = darkColorScheme(
    primary = MidnightBlue,
    secondary = DeepTeal,
    tertiary = SoftCoral,
    background = Color(0xFF121212),
    surface = DeepCharcoal,
    onPrimary = CloudWhite,
    onSecondary = CloudWhite,
    onTertiary = CloudWhite,
    error = ErrorRed,


)

@Composable
fun LoukatahTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    // Choose color scheme based on theme mode
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
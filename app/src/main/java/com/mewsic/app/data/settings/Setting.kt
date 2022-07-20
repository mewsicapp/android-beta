package com.mewsic.app.data.settings

import androidx.compose.runtime.Composable
import com.mewsic.app.ui.themer.IThemer

sealed interface Setting<T : Any> {
    var value: T
    val name: String
    val themer: IThemer
    @Composable
    fun Box(
        globalTheme: IThemer,
    )
}
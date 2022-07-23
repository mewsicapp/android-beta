package com.mewsic.app.ui.components

import androidx.annotation.IntegerRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun QuickIcon(@IntegerRes icon: Int, onClick: () -> Unit = {}) {
    Icon(
        painterResource(id = icon),
        contentDescription = null,
        modifier = Modifier.clickable {
            onClick()
        }
    )
}
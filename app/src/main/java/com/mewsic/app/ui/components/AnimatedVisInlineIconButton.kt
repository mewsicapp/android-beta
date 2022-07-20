package com.mewsic.app.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

@Composable
inline fun AnimatedVisInlineIconButton(
    visible: Boolean,
    animVisModifier: Modifier = Modifier,
    enter: EnterTransition = EnterTransition.None,
    exit: ExitTransition = ExitTransition.None,
    iconButtonModifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String? = null,
    noinline onClick: () -> Unit
) {
    AnimatedVisibility(
        visible,
        animVisModifier,
        enter,
        exit
    ) {
        Row {
           IconButton(onClick, iconButtonModifier) {
               Icon(painter, contentDescription)
           }
        }
    }
}
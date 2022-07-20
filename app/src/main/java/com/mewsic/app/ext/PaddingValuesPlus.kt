package com.mewsic.app.ext

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.ui.unit.LayoutDirection


operator fun PaddingValues.plus(other: PaddingValues): PaddingValues {
    return PaddingValues(
        top = this.calculateTopPadding() + other.calculateTopPadding(),
        start = this.calculateStartPadding(LayoutDirection.Ltr) + other.calculateStartPadding(LayoutDirection.Ltr),
        end = this.calculateEndPadding(LayoutDirection.Ltr) + other.calculateEndPadding(LayoutDirection.Ltr),
        bottom = this.calculateBottomPadding() + other.calculateBottomPadding()
    )
}
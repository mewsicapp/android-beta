package com.mewsic.app.data.content

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.runtime.Composable
import com.mewsic.app.ui.components.HomepageContentItem

data class HomepageContentManifest(
    val title: String,
    val subtitle: String,
    val icon: @Composable () -> Unit,
    val onClick: () -> Unit = {}
) {
    @Composable
    fun asHomepageContentItem(thisRef: LazyItemScope) = HomepageContentItem(
        title = title,
        subtitle = subtitle,
        icon = icon,
        onClick = onClick,
        thisRef = thisRef
    )
}

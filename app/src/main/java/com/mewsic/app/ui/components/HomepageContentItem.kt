package com.mewsic.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@OptIn(ExperimentalMaterial3Api::class)
// Intended to be used in a LazyItemScope so we can use fillParentMaxSize and related functions.
fun HomepageContentItem(
    title: String,
    subtitle: String,
    icon: @Composable () -> Unit,
    onClick: () -> Unit,
    thisRef: LazyItemScope
) {
    with(thisRef) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .padding(4.dp)
                .width(120.dp)
                .height(190.dp)
                .clickable { onClick() }
        ) {

            Column(
                modifier = Modifier
                    .fillParentMaxSize()
                    .background(color = MaterialTheme.colorScheme.surfaceVariant),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                icon()
                Text(
                    text = title,
                    modifier = Modifier.padding(horizontal = 8.dp),
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 16.sp
                )
                Text(
                    text = subtitle,
                    modifier = Modifier.padding(horizontal = 8.dp),
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 13.sp
                )

            }
        }
    }
}
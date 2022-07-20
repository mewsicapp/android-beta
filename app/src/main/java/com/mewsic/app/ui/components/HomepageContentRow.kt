package com.mewsic.app.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mewsic.app.data.content.HomepageContentManifest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomepageContentRow(
    icon: @Composable () -> Unit,
    title: String,
    content: List<HomepageContentManifest>
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row {
            Spacer(Modifier.width(16.dp))
            Box(Modifier.height(16.dp)) { icon() }
            Text(
                text = title,
                modifier = Modifier.padding(horizontal = 8.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        LazyRow(modifier = Modifier.fillMaxWidth()) {
            items(content.size) { idx ->
                content[idx].asHomepageContentItem(thisRef = this)
                Spacer(modifier = Modifier.width(4.dp))
            }
        }
    }
}

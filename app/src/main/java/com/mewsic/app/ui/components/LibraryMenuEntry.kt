package com.mewsic.app.ui.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mewsic.app.data.content.LibraryMenuEntryManifest
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.mewsic.app.R
import com.mewsic.app.data.viewmodels.PlaylistViewModel
import com.mewsic.app.ui.pages.destinations.HomeDestination

@Composable
@Preview
fun LibraryMenuEntry(
    navigator: DestinationsNavigator? = null,
    manifest: LibraryMenuEntryManifest = LibraryMenuEntryManifest(
        "Test",
        {},
        HomeDestination,
        { PlaylistViewModel() }
    )
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_library),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.size(30.dp)
        )
    }
}
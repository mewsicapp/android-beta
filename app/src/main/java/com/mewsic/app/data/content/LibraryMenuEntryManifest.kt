package com.mewsic.app.data.content

import androidx.annotation.IntegerRes
import androidx.compose.runtime.Composable
import com.mewsic.app.data.viewmodels.PlaylistViewModel
import com.mewsic.app.ui.pages.destinations.Destination

data class LibraryMenuEntryManifest(
    val title: String,
    @IntegerRes val icon: Int,
    val to: Destination,
    val playlistVMBuilder: () -> PlaylistViewModel // FIXME: idk if this is a good way to do this but here we are
)

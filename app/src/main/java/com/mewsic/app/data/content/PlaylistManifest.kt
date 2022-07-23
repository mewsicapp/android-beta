package com.mewsic.app.data.content

import androidx.compose.runtime.Composable
import java.util.Collections.addAll

data class PlaylistManifest(
    var name: String,
    var description: String,
    var icon: @Composable () -> Unit,
) {
    val songs: List<SongManifest> = emptyList()
    constructor(
         name: String,
         description: String,
         icon: @Composable () -> Unit,
        vararg songs: SongManifest
    ) : this(name, description, icon) {
        this.songs.apply {
            addAll(songs.toMutableList())
        }
    }
}

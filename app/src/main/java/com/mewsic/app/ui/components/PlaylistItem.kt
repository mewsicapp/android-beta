package com.mewsic.app.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.danchoo.glideimage.GlideImage
import com.mewsic.app.data.content.SongManifest

@Composable
fun PlaylistItem(

    playerActivator: Unit = Unit, // TODO: implement player activator
    songManifest: SongManifest,
) {
    Row(
        modifier = Modifier
            .padding(
                2.dp
            )
            .fillMaxWidth()
    ) {
       GlideImage(data = songManifest.albumArt, modifier = Modifier.size(14.dp))
       Column() {
              Text(text = songManifest.title)
              Text(text = songManifest.artist)
       }

    }
}
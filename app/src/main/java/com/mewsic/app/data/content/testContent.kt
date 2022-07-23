package com.mewsic.app.data.content

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.danchoo.glideimage.GlideImage
import com.mewsic.app.R
import com.mewsic.app.data.viewmodels.PlaylistViewModel
import com.mewsic.app.ui.components.QuickIcon
import com.mewsic.app.ui.pages.destinations.HomeDestination

val testHomepageContent = buildList {
    add(
        HomepageContentManifest(
            title = "Your Song",
            subtitle = "Your Artist",
            icon = {
                GlideImage(
                    data = "https://placekitten.com/400/400",
                    modifier = Modifier
                        .aspectRatio(1f, true),
                    requestBuilder = {
                        this.centerCrop()
                    }
                )
            }
        )
    )
    add(
        HomepageContentManifest(
            title = "Your Song 2",
            subtitle = "Your Artist 2",
            icon = {
                GlideImage(
                    data = "https://placekitten.com/400/400",
                    modifier = Modifier
                        .aspectRatio(1f, true),
                    requestBuilder = {
                        this.centerCrop()
                    }
                )
            }
        )
    )
    add(
        HomepageContentManifest(
            title = "Your Song 3",
            subtitle = "Your Artist 3",
            icon = {
                GlideImage(
                    data = "https://placekitten.com/400/400",
                    modifier = Modifier
                        .aspectRatio(1f, true),
                    requestBuilder = {
                        this.centerCrop()
                    }
                )
            }
        )
    )
    add(
        HomepageContentManifest(
            title = "Your Song 4",
            subtitle = "Your Artist 4",
            icon = {
                GlideImage(
                    data = "https://placekitten.com/400/600",
                    modifier = Modifier
                        .aspectRatio(1f, true),
                    requestBuilder = {
                        this.centerCrop()
                    }
                )
            }
        )
    )
    add(
        HomepageContentManifest(
            title = "Your Song 5",
            subtitle = "Your Artist 5",
            icon = {
                GlideImage(
                    data = "https://placekitten.com/600/400",
                    modifier = Modifier
                        .aspectRatio(1f, true),
                    requestBuilder = {
                        this.centerCrop()
                    }
                )
            }
        )
    )
}

val testLibraryContent = buildList {
    add(
        LibraryMenuEntryManifest(
            "Top of All Time",
            R.drawable.ic_lastfm,
            HomeDestination,
            { PlaylistViewModel(testPlaylistContent["lastfm-topofalltime"]!!) }
        )
    )
    add(
        LibraryMenuEntryManifest(
            "Liked Music",
            R.drawable.ic_youtube_logo,
            HomeDestination,
            { PlaylistViewModel(testPlaylistContent["lastfm-topofalltime"]!!) }
        )
    )
}
val testPlaylistContent = buildMap {
    put(
        "lastfm-topofalltime",
        PlaylistManifest(
            "Top of All Time",
            "Your Last.fm Top of All Time",
            { QuickIcon(icon = R.drawable.ic_lastfm)},
            SongManifest(
                "REFLECT",
                "Gawr Gura",
                "https://lastfm.freetls.fastly.net/i/u/770x0/6869f6c40aa8df08c71933e5d44fca17.jpg"
            ),
            SongManifest(
                "higanbana milk tea",
                "Vane Lily",
                "https://lastfm.freetls.fastly.net/i/u/770x0/7e26dc05c13df3a658b28b39d00c9c9d.jpg"
            ),
            SongManifest(
                "Adipocere",
                "Iyowa",
                "https://lastfm.freetls.fastly.net/i/u/770x0/4b20aabf3581b296cfe03657502330fb.jpg"
            ),
            SongManifest(
                "City of Ashes",
                "Jhariah",
                "https://lastfm.freetls.fastly.net/i/u/770x0/8423a19a5fa1603f32b33891326f4b6f.jpg"
            ),
        )
    )
}
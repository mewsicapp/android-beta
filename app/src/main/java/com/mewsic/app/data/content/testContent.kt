package com.mewsic.app.data.content

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.Modifier
import com.danchoo.glideimage.GlideImage

val testContent = buildList {
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
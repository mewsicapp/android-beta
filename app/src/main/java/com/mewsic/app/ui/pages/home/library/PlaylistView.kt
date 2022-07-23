package com.mewsic.app.ui.pages.home.library

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.unit.sp
import com.danchoo.glideimage.GlideImage
import com.mewsic.app.data.viewmodels.PlaylistViewModel
import com.mewsic.app.ui.animations.SlideIntoSubmenuDestinationAnimation
import com.mewsic.app.ui.components.QuickIcon
import com.mewsic.app.ui.navgraphs.LibrarySubNavGraph
import com.mewsic.app.R
import com.mewsic.app.ui.components.PlaylistItem
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.intellij.lang.annotations.JdkConstants


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Destination(style = SlideIntoSubmenuDestinationAnimation::class)
@LibrarySubNavGraph
fun PlaylistView(
    nav: DestinationsNavigator?,
    playlistViewModel: PlaylistViewModel
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                navigationIcon = { QuickIcon(icon = R.drawable.ic_arrow_back) {
                    nav?.navigateUp()
                }},
                title = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text(
                            text = playlistViewModel.manifest.name,
                            fontSize = 24.sp
                        )
                        Text(
                            text = playlistViewModel.manifest.description,
                            fontSize = 16.sp
                        )

                    }
                }

            )

        }
    ) { paddingValues ->
        Box(modifier = Modifier
            .padding(paddingValues)) {
            playlistViewModel.manifest.songs.forEach {
                PlaylistItem(songManifest = it)
            }
        }
    }
}
package com.mewsic.app.ui.pages.home.library

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mewsic.app.data.content.testLibraryContent
import com.mewsic.app.ui.animations.SlideIntoSubmenuDestinationAnimation
import com.mewsic.app.ui.components.LibraryMenuEntry
import com.mewsic.app.ui.navgraphs.LibrarySubNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination(style=SlideIntoSubmenuDestinationAnimation::class)
@LibrarySubNavGraph(start=true, route="home/library/menu")
@Composable
fun Menu(
    navigator: DestinationsNavigator,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
//            .background(color = MaterialTheme.colorScheme.secondaryContainer)
    ) {
        testLibraryContent.forEach {
            LibraryMenuEntry(
                navigator,
                manifest = it
            )
        }

    }
}
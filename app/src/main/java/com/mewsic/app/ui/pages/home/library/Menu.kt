package com.mewsic.app.ui.pages.home.library

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mewsic.app.ui.animations.SlideIntoSubmenuDestinationAnimation
import com.mewsic.app.ui.navgraphs.LibrarySubNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination(style=SlideIntoSubmenuDestinationAnimation::class)
@LibrarySubNavGraph(start=true, route="home/library/menu")
@Composable
fun Menu(
    navigator: DestinationsNavigator,
) {

}
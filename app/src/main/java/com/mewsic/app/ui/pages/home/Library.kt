package com.mewsic.app.ui.pages.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.mewsic.app.ui.navgraphs.HomePageNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.mewsic.app.ui.animations.HomeSubpageAnimations
import com.mewsic.app.ui.pages.NavGraphs
import com.mewsic.app.ui.pages.destinations.MenuDestination
import com.mewsic.app.ui.pages.home.library.Menu
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine
import com.ramcosta.composedestinations.manualcomposablecalls.animatedComposable

@OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class,
    ExperimentalMaterialNavigationApi::class
)
@Destination(style = HomeSubpageAnimations::class)
@HomePageNavGraph(false, "home/library")
@Composable
fun Library(
    navigator: DestinationsNavigator
) {
    val animatedNavHost = rememberAnimatedNavHostEngine()
    DestinationsNavHost(navGraph = NavGraphs.librarySub, engine = animatedNavHost) {
        animatedComposable(MenuDestination) {
            Menu(navigator = navigator,)
        }
    }
}
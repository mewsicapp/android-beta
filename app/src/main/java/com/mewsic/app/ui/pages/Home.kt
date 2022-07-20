package com.mewsic.app.ui.pages

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.mewsic.app.data.enums.HomeSubpage
import com.mewsic.app.data.viewmodels.HomeSubpageControllerViewModel
import com.mewsic.app.ui.components.HomeSubpageController
import com.mewsic.app.ui.components.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.mewsic.app.ui.pages.destinations.DiscoverDestination
import com.mewsic.app.ui.pages.destinations.ForYouDestination
import com.mewsic.app.ui.pages.destinations.LibraryDestination
import com.mewsic.app.ui.pages.home.Discover
import com.mewsic.app.ui.pages.home.ForYou
import com.mewsic.app.ui.pages.home.Library
import com.mewsic.common.lang.Log
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.manualcomposablecalls.composable

@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalAnimationApi::class,
    ExperimentalMaterialNavigationApi::class
)
@Composable
@RootNavGraph(start = true)
@Destination
fun Home(
    navigator: DestinationsNavigator,
) {

    Scaffold(
        topBar={
            TopAppBar(navigator = navigator)
        }
    ) { paddingValues ->
        val hsmvm = HomeSubpageControllerViewModel()
        val animatedNavHost = rememberAnimatedNavHostEngine()


        Column(modifier = Modifier.padding(paddingValues)) {
            Spacer(modifier = Modifier.height(20.dp))
            HomeSubpageController(state = hsmvm)
            Spacer(modifier = Modifier.height(16.dp))


            DestinationsNavHost(navGraph = NavGraphs.homePage, engine = animatedNavHost) {
                composable(ForYouDestination) {
                    hsmvm.navigator = destinationsNavigator
                    hsmvm.subpage = HomeSubpage.ForYou
                    Log.e("ForYouDestination here")
                    ForYou()
                }
                composable(DiscoverDestination) {
                    hsmvm.navigator = destinationsNavigator
                    hsmvm.subpage = HomeSubpage.Discover
                    Log.e("DiscoverDestination here")
                    Discover()
                }
                composable(LibraryDestination) {
                    hsmvm.navigator = destinationsNavigator
                    hsmvm.subpage = HomeSubpage.Library
                    Log.e("LibraryDestination here")
                    Library(navigator = destinationsNavigator)
                }
            }
        }


    }
}

package com.mewsic.app.ui.animations

import androidx.compose.animation.*
import androidx.compose.ui.unit.IntOffset
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination
import com.mewsic.app.ui.pages.destinations.DiscoverDestination
import com.mewsic.app.ui.pages.destinations.ForYouDestination
import com.mewsic.app.ui.pages.destinations.LibraryDestination
import com.ramcosta.composedestinations.spec.DestinationStyle
import com.ramcosta.composedestinations.utils.destination

@OptIn(ExperimentalAnimationApi::class)
object HomeSubpageAnimations : DestinationStyle.Animated {

    override fun AnimatedContentScope<NavBackStackEntry>.enterTransition(): EnterTransition? {
        when(this.initialState.destination() to this.targetState.destination()) {
            DiscoverDestination to ForYouDestination -> {
                // going to the left
                return slideInHorizontally { -it }
            }
            DiscoverDestination to LibraryDestination -> {
                // going to the right
                return slideInHorizontally { it }
            }
            ForYouDestination to DiscoverDestination -> {
                // going to the right
                return slideInHorizontally { it }
            }
            ForYouDestination to LibraryDestination -> {
                // going to the right
                return slideInHorizontally { it }
            }
            LibraryDestination to DiscoverDestination -> {
                // going to the left
                return slideInHorizontally { -it }
            }
            LibraryDestination to ForYouDestination -> {
                // going to the left
                return slideInHorizontally { -it }
            }
            else -> return null
        }
    }
    override fun AnimatedContentScope<NavBackStackEntry>.exitTransition(): ExitTransition? {
        when (this.initialState.destination() to this.targetState.destination()) {
            DiscoverDestination to ForYouDestination -> {
                // going to the left
                return slideOutHorizontally { it }
            }
            DiscoverDestination to LibraryDestination -> {
                // going to the right
                return slideOutHorizontally { -it }
            }
            ForYouDestination to DiscoverDestination -> {
                // going to the right
                return slideOutHorizontally { -it }
            }
            ForYouDestination to LibraryDestination -> {
                // going to the right
                return slideOutHorizontally { -it }
            }
            LibraryDestination to DiscoverDestination -> {
                // going to the left
                return slideOutHorizontally { it }
            }
            LibraryDestination to ForYouDestination -> {
                // going to the left
                return slideOutHorizontally { it }
            }
            else -> return null
        }
    }

}
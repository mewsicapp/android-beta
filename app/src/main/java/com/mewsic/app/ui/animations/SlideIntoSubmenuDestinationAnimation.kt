package com.mewsic.app.ui.animations

import androidx.compose.animation.*
import androidx.navigation.NavBackStackEntry
import com.mewsic.app.ui.pages.destinations.MenuDestination
import com.ramcosta.composedestinations.spec.DestinationStyle
import com.ramcosta.composedestinations.utils.destination

@OptIn(ExperimentalAnimationApi::class)
object SlideIntoSubmenuDestinationAnimation : DestinationStyle.Animated {
    val slideInLeft = slideInHorizontally { -it }
    private val slideInRight = slideInHorizontally { it }
    private val slideOutLeft = slideOutHorizontally { it }
    private val slideOutRight = slideOutHorizontally { -it }

    override fun AnimatedContentScope<NavBackStackEntry>.enterTransition(): EnterTransition? =
        when (this.targetState.destination()) {
            MenuDestination -> slideInLeft
            else -> slideInRight
        }
    override fun AnimatedContentScope<NavBackStackEntry>.exitTransition(): ExitTransition? =
        when (this.targetState.destination()) {
            MenuDestination -> slideOutLeft
            else -> slideOutRight
        }
}
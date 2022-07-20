package com.mewsic.app.ui.components

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mewsic.app.R
import com.mewsic.app.data.enums.TopAppBarBackPlacementState
import com.mewsic.app.ui.pages.destinations.*
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    navigator: DestinationsNavigator,
    backPlacementState: TopAppBarBackPlacementState = TopAppBarBackPlacementState.None
) {
    var opened by remember { mutableStateOf(true) }
    CenterAlignedTopAppBar(title = {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            val (leftIcon: Int, leftOnClick: () -> Unit) = when (backPlacementState) {
                TopAppBarBackPlacementState.None -> {
                    R.drawable.ic_settings to {
                        navigator.navigate(SettingsDestination)
                    }
                }
                else -> {
                    R.drawable.ic_arrow_back to {
                        navigator.navigate(HomeDestination)
                        navigator.clearBackStack(when (backPlacementState) {
                            TopAppBarBackPlacementState.Settings -> SettingsDestination
                            TopAppBarBackPlacementState.Search -> SearchDestination
                            else -> throw IllegalStateException("Unknown back placement state")
                        })
                        Unit
                    }
                }
            }
            val (rightIcon: Int, rightOnClick: () -> Unit) = when (backPlacementState) {
                TopAppBarBackPlacementState.Search -> {
                    R.drawable.ic_settings to {
                        navigator.navigate(SettingsDestination)
                    }
                }
                else -> {
                    R.drawable.ic_search to {
                        navigator.navigate(SearchDestination)
                    }
                }
            }
            AnimatedVisInlineIconButton(
                visible = opened,
                animVisModifier = Modifier.padding(vertical = 0.dp, horizontal = 1.dp),
                enter = fadeIn() + slideInHorizontally(initialOffsetX = { it / 2 }),
                exit = fadeOut() + slideOutHorizontally(targetOffsetX = { it / 2 }),
                iconButtonModifier = Modifier
                    .size(44.dp)
                    .padding(horizontal = 10.dp),
                painter = painterResource(id = leftIcon),
                contentDescription = null,
                onClick = leftOnClick
            )
            IconButton(
                onClick = { opened = !opened },
                modifier = Modifier.size(60.dp),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_monochrome),
                    contentDescription = null
                )
            }
            AnimatedVisInlineIconButton(
                visible = opened,
                animVisModifier = Modifier.padding(vertical = 0.dp, horizontal = 1.dp),
                enter = fadeIn() + slideInHorizontally(initialOffsetX = { -it / 2 }),
                exit = fadeOut() + slideOutHorizontally(targetOffsetX = { -it / 2 }),
                iconButtonModifier = Modifier
                    .size(44.dp)
                    .padding(horizontal = 10.dp),
                painter = painterResource(id = rightIcon),
                contentDescription = null,
                onClick = rightOnClick
            )

        }
    })
}

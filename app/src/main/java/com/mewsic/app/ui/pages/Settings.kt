package com.mewsic.app.ui.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mewsic.app.data.enums.TopAppBarBackPlacementState
import com.mewsic.app.ui.components.TopAppBar
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Destination("settings")
fun Settings(
    navigator: DestinationsNavigator

) {
    Scaffold(
        topBar={
            TopAppBar(navigator = navigator, backPlacementState = TopAppBarBackPlacementState.Settings)
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            Text("Settings")
        }
    }
}
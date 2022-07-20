package com.mewsic.app.data.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mewsic.app.data.enums.HomeSubpage
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

class HomeSubpageControllerViewModel : ViewModel() {
    var subpage by mutableStateOf(HomeSubpage.ForYou) // initial state
    var navigator: DestinationsNavigator? by mutableStateOf(null) // does not exist on app launch, must be set separately.
}
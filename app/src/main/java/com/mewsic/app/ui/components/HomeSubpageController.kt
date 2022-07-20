package com.mewsic.app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import com.mewsic.app.data.enums.HomeSubpage
import com.mewsic.app.data.viewmodels.HomeSubpageControllerViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeSubpageController(
    state: HomeSubpageControllerViewModel
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "For You",
            textDecoration = if (state.subpage == HomeSubpage.ForYou) TextDecoration.Underline else TextDecoration.None,
            modifier = Modifier.clickable {
                state.navigator?.navigate(HomeSubpage.ForYou.route.route)
            }
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "Discover",
            textDecoration = if (state.subpage == HomeSubpage.Discover) TextDecoration.Underline else TextDecoration.None,
            modifier = Modifier.clickable {
                state.navigator?.navigate(HomeSubpage.Discover.route.route)
            }
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "Library",
            textDecoration = if (state.subpage == HomeSubpage.Library) TextDecoration.Underline else TextDecoration.None,
            modifier = Modifier.clickable {
                state.navigator?.navigate(HomeSubpage.Library.route.route)
            }
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}
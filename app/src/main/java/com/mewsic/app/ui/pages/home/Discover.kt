package com.mewsic.app.ui.pages.home

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.mewsic.app.data.content.testContent
import com.mewsic.app.ui.components.HomepageContentRow
import com.mewsic.app.ui.navgraphs.HomePageNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.mewsic.app.R
import com.mewsic.app.ui.animations.HomeSubpageAnimations

@Destination(style = HomeSubpageAnimations::class)
@HomePageNavGraph(false, "home/discover")
@Composable
fun Discover(

) {
        HomepageContentRow(icon = { Icon(painter = painterResource(R.drawable.ic_youtube_logo), contentDescription = null) }, title = "TEST CONTENT", content = testContent.shuffled())
}
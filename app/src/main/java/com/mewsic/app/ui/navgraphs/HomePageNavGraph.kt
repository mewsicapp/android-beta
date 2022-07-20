package com.mewsic.app.ui.navgraphs

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph
@NavGraph
annotation class HomePageNavGraph(
    val start: Boolean = false,
    val route: String = ""
)

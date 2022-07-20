package com.mewsic.app.ui.navgraphs

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@HomePageNavGraph(false, "home/library/")
@NavGraph
annotation class LibrarySubNavGraph(
    val start: Boolean = false,
    val route: String = ""
)

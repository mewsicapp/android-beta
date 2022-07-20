package com.mewsic.app.data.enums

import com.mewsic.app.ui.pages.destinations.Destination
import com.mewsic.app.ui.pages.destinations.DiscoverDestination
import com.mewsic.app.ui.pages.destinations.ForYouDestination
import com.mewsic.app.ui.pages.destinations.LibraryDestination

enum class HomeSubpage(val route: Destination) {
    ForYou(ForYouDestination),
    Discover(DiscoverDestination),
    Library(LibraryDestination)
}
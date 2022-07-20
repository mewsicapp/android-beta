package com.mewsic.app.data.settings

import androidx.compose.runtime.Composable
import com.mewsic.app.ui.themer.IThemer

object TopBarLayout : Setting<String> {
    override var value: String
        get() = TODO("Not yet implemented")
        set(value) {
            if (validate(value)) {

            }
        }
    override val name: String = "TopBarLayout"

    @Composable
    override fun Box(globalTheme: IThemer) {
        TODO("Not yet implemented")
    }
    private fun validate(value: String): Boolean {
        TODO("Not yet implemented")
    }

    override val themer: IThemer by /* currentGlobalTheme */ lazy {
        TODO("Not yet implemented")
    }
}
package com.mewsic.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.mewsic.app.ui.pages.NavGraphs
import com.mewsic.app.ui.theme.MewsicΒTheme
import com.mewsic.common.lang.Log
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialNavigationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("ayo log works")
        val androidModule = module {

        }
        startKoin {
            androidLogger()
            androidContext(this@MainActivity)
            modules(androidModule)
        }
        setContent {
            MewsicΒTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val animatedNavHost = rememberAnimatedNavHostEngine()
                    DestinationsNavHost(navGraph = NavGraphs.root, engine = animatedNavHost)
                }
            }
        }

    }
}
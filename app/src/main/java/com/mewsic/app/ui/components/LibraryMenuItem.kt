package com.mewsic.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.mewsic.app.data.content.LibraryMenuEntryManifest
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.mewsic.app.R
import com.mewsic.app.data.viewmodels.PlaylistViewModel
import com.mewsic.app.ui.pages.destinations.HomeDestination
import com.mewsic.app.ui.pages.destinations.PlaylistViewDestination
import com.ramcosta.composedestinations.navigation.navigate
import java.util.*

@Composable
fun LibraryMenuEntry(
    navigator: NavController? = null,
    manifest: LibraryMenuEntryManifest) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 5.dp)

        ,
    ) {
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .clickable {
                    navigator?.navigate(
                        PlaylistViewDestination(),
                    ) {

                    }
                }


        ) {
            Row(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.secondaryContainer)
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 3.dp)


                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center


            ) {
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(manifest.icon),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier.size(30.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = manifest.title,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    painter = painterResource(R.drawable.ic_chevron_right),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSecondaryContainer,
                )
            }
        }

    }
}
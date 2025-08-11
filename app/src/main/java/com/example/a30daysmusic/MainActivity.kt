package com.example.a30daysmusic

import android.R.attr.contentDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysmusic.data.Day
import com.example.a30daysmusic.data.days
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.compose._30DaysMusicTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.compose.*


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysMusicTheme {

                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = surfaceContainerLowLight

                ) {
                    _30DaysMusicApp()

                }
            }
        }
    }
}

@Composable

fun _30DaysMusicApp() {

    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) { innerPadding ->
        DayList(
            dayList = days,
            modifier = Modifier
                .padding(innerPadding)
        )
    }
}

@Composable
fun DayList( dayList: List<Day>, modifier: Modifier ) {
    //day card
    LazyColumn(modifier = modifier) {

        itemsIndexed(dayList) { index, day ->

            DayCard(
                day = day,
                dayNumber = index + 1,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}


@Composable

fun DayCard( day: Day, dayNumber: Int, modifier: Modifier) {

    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = dimensionResource(R.dimen.padding_medium))
            .padding(vertical = dimensionResource(R.dimen.padding_small))


    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(primaryContainerLight)
                .padding(dimensionResource(R.dimen.padding_small))


        ) {
            Gender(day.stringGenreResourceId, dayNumber)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Photo(day.imageResourceId)

                Spacer(modifier = Modifier.width(8.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(10.dp)) ///asdfvbg <3
                        .background(primaryContainerLightMediumContrast)
                        .padding(dimensionResource(R.dimen.padding_small))


                ) {
                    Recommendation(day.stringArtistNameResourceId, day.stringSongResourceId)

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ){

                        Flag(day.flagResourceId)
                        DescriptionButton(
                            expanded = expanded,
                            onClick = { expanded = !expanded },
                        )

                    }

                    }
                }
            //titlu : gen muzical + zi
            //photo + recomandare
        }
        if (expanded) {
            GendreDescription(
                day.stringDescriprionResourceId,
                modifier = Modifier
                    .background(color = secondaryLightMediumContrast)

            )
        }
    }
}

@Composable
fun Gender(
    @StringRes gender: Int,
    dayNumber: Int,
    modifier: Modifier = Modifier
) {

    Text(
        text = "${stringResource(gender)} - Day $dayNumber",
        modifier = modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
        color = onPrimaryContainerLight
    )
}

@Composable
fun Photo(
    @DrawableRes imageGender: Int,
    modifier: Modifier = Modifier
){

    Image(
        modifier = Modifier
            .width(170.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp)),


        painter = painterResource( imageGender),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

/**
 * Composable that displays a recommendation : artist + song
 * @param artistName is the resource ID for the string of the artist name
 * @param artistName is the resource ID for the string of the artist song
 * @param modifier modifiers to set to this composable
 */

@Composable
fun Recommendation(
    @StringRes artistName: Int,
    @StringRes artistSong: Int,
    modifier: Modifier = Modifier
){
    // artist + song
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(artistName),
            color = onPrimaryContainerLightMediumContrast,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = stringResource(artistSong),
            color = onPrimaryContainerLightMediumContrast,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Composable
private fun DescriptionButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,

    ) {

        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = stringResource(R.string.expand_button_content_description),
            )
    }
}

@Composable
fun GendreDescription(
    @StringRes gendreDescription: Int,
    modifier: Modifier = Modifier

) {

    Column(
        modifier = Modifier
            .padding(horizontal = dimensionResource(R.dimen.padding_medium))
            .padding(vertical = dimensionResource(R.dimen.padding_small))

    ) {
        Text(
            text = stringResource(R.string.about),
            color = primaryLightMediumContrast,
            style = MaterialTheme.typography.titleMedium

            )
        Text(
            text = stringResource(gendreDescription),
            color = onPrimaryContainerLight,
            style = MaterialTheme.typography.bodyLarge
            )
    }
}

@Composable
fun Flag(
    @DrawableRes imageFlag: Int,
    modifier: Modifier = Modifier
){

    Image(
        modifier = Modifier
            .height(20.dp),

        painter = painterResource(imageFlag),
        contentDescription = null
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(R.dimen.padding_small))
                        .clip(RoundedCornerShape(10.dp)),


                    painter = painterResource(R.drawable.banner),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds)


            }
        },
        modifier = modifier.height(100.dp)

    )
}



@Preview(showBackground = true)
@Composable
fun _30DaysMusicPreview() {
    _30DaysMusicTheme {
        _30DaysMusicApp()
    }
}
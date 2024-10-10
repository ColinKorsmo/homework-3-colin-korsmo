package com.example.homework3colinkorsmo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.homework3colinkorsmo.data.DataSource
import com.example.homework3colinkorsmo.model.Reminders
import com.example.homework3colinkorsmo.ui.theme.Homework3ColinKorsmoTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Homework3ColinKorsmoTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background)
                {
                   RemindersApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun RemindersApp() {
        RemindersList(DataSource.reminders)
}

@Composable
fun RemindersList(remindersList: List<Reminders>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier){
        items(remindersList){ reminders ->
            RemindersCard(
                reminder = reminders,
                modifier = Modifier.padding(8.dp)
            )

        }
    }
}

@Composable
fun RemindersCard(reminder: Reminders, modifier: Modifier = Modifier){
    Card(modifier = modifier) {
        Column {
            Text(
                text = stringResource(id = reminder.titleResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Image(
                painter = painterResource(id = reminder.imageResourceId),
                contentDescription = stringResource(id = reminder.stringResourceId),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
            )
            Text(
                text = stringResource(id = reminder.stringResourceId),
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun RemindersCardPreview(){
    RemindersCard(reminder = DataSource.reminders[0])
}


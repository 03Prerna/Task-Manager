package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                  // color = MaterialTheme.colorScheme.background
               ) {
                   GreetingImage(middle = "All Tasks completed" ,
                       ending = "Nice Work!")
               }
                }
            }
        }
    }

@Composable
fun GreetingImage(middle :String, ending :String,modifier :Modifier = Modifier){
    val image = painterResource(R.drawable.ic_task_completed)
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
      //  horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(160.dp).width(160.dp).align(alignment = Alignment.CenterHorizontally)
        )
        Greetingtext(
            middle = middle,
            ending = ending,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)

        )
    }
}
@Composable
fun Greetingtext(middle: String,ending :String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.Center,
             modifier = modifier) {
        Text(
            text = middle,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp).align(Alignment.CenterHorizontally)
        )
        Text(
            text = ending,
            fontSize = 24.sp,
            modifier =Modifier.align(Alignment.CenterHorizontally)
            )
    }
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
        GreetingImage(middle ="All Tasks completed" , ending = "Nice Work!")
    }
}
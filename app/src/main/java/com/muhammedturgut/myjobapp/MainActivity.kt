package com.muhammedturgut.myjobapp


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview
@Composable
fun Myui() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        bottomBar = {
            MyBottomBar()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                contentColor = Color.White,
                backgroundColor = Color(android.graphics.Color.parseColor("#fe5b52"))
            ) {
                Icon(
                    painter = painterResource(R.drawable.shopping_cart),
                    contentDescription = "add",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                )
            }
        },
        scaffoldState=scaffoldState,
        isFloatingActionButtonDocked=true,
        floatingActionButtonPosition = FabPosition.Center

    ) {
       Column(modifier = Modifier.fillMaxSize()
           .padding(20.dp)
           .verticalScroll(rememberScrollState())
           .padding(paddingValues = it),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally)
       {
           NameProfile()
           Title()
           Button()
           Banner()
       }
    }
}

@Composable
fun Banner() {
    Row(modifier = Modifier.padding(top = 16.dp)){
        Text(text="Popular Courses",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight=FontWeight.SemiBold,
            modifier = Modifier.weight(1f)
        )
        Text(text = "See all",
            color = Color.Black,
            fontSize = 16.sp)
    }

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .padding(top = 24.dp)
        .height(120.dp)
        .border(1.dp,Color(android.graphics.Color.parseColor("#fbe6dd")),
            shape = RoundedCornerShape(25.dp))
        .background(brush =
        Brush.horizontalGradient(colors = listOf(Color.White,
            Color(android.graphics.Color.parseColor("#fbe6dd")))),
            shape = RoundedCornerShape(25.dp)
        )) {
          val (img,text) = createRefs()
        Image(modifier = Modifier)
    }
}

@Composable
fun Button(){
    Row (modifier = Modifier
        .padding(top = 24.dp)
        .fillMaxWidth()
    ){
        Column(modifier = Modifier
            .weight(8.5f)
            .height(170.dp)
            .padding(end=12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#37c9bb")),
                shape = RoundedCornerShape(20.dp)
            ).padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
             Image(painter = painterResource(R.drawable.btn_1), contentDescription = null,
                 modifier = Modifier
                     .height(65.dp)
                     .width(65.dp)
             )

            Text(
                text = "Developing",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 12.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Column(modifier = Modifier
            .weight(8.5f)
            .height(170.dp)
            .padding(start=12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#ff9d43")),
                shape = RoundedCornerShape(20.dp)
            ).padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(R.drawable.btn_2), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )

            Text(
                text = "Designing",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 12.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }

    Row (modifier = Modifier
        .padding(top = 24.dp)
        .fillMaxWidth()
    ){
        Column(modifier = Modifier
            .weight(8.5f)
            .height(170.dp)
            .padding(end=12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#f36095")),
                shape = RoundedCornerShape(20.dp)
            ).padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(R.drawable.btn_3), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )

            Text(
                text = "AI ML",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 12.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Column(modifier = Modifier
            .weight(8.5f)
            .height(170.dp)
            .padding(start=12.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#389ef2")),
                shape = RoundedCornerShape(20.dp)
            ).padding(top = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(R.drawable.btn_4), contentDescription = null,
                modifier = Modifier
                    .height(65.dp)
                    .width(65.dp)
            )

            Text(
                text = "Explorer",
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 12.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Composable
fun Title(){
    Text(
        text = "What Would you like to\n learn today",
        color = Color.Black,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    )
}

@Composable
fun NameProfile() {
  Row (modifier = Modifier
      .fillMaxSize()
      .padding(top = 32.dp)) {

      Image(painter = painterResource(R.drawable.user_1),
          contentDescription = null, modifier =
          Modifier.width(55.dp)
              .height(55.dp)
              .clickable {}
      )
      Box(modifier = Modifier.fillMaxSize()
          .padding(start = 36.dp)
          .align(alignment = Alignment.CenterVertically)){

          Text(text="Hi, Alex",
              color = Color.Black,
              fontSize = 28.sp,
              fontWeight = FontWeight.SemiBold)
      }
  }
}

@Composable
fun MyBottomBar(){
    val bottomMenuItemsList = prepareBottomMenu()
    val contextForToast = LocalContext.current.applicationContext
    var selectedItem by remember {
        mutableStateOf("Profile")
    }

    BottomAppBar(cutoutShape = CircleShape, backgroundColor = Color(android.graphics.Color.parseColor("#F8F8F8")), elevation = 3.dp ) {
        bottomMenuItemsList.forEachIndexed { index, bottomMenuItem ->

            if (index == 2) {
                BottomNavigationItem(
                    selected = false,
                    onClick = {},
                    icon = {},
                    enabled = false
                )
            }
            BottomNavigationItem(
                selected = (selectedItem == bottomMenuItem.label),
                onClick = {
                    selectedItem = bottomMenuItem.label
                    Toast.makeText(contextForToast, bottomMenuItem.label, Toast.LENGTH_SHORT).show()
                },
                icon = {
                    Icon(
                        painter = bottomMenuItem.icon,
                        contentDescription = null,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                },
                label = {
                    Text(
                        text = bottomMenuItem.label,
                        modifier = Modifier.padding(top = 14.dp)
                    )
                },
                alwaysShowLabel = true,
                enabled = true
            )

        }
    }

}

data class BottomMenuItem(var label: String, var icon:Painter)

@Composable
fun prepareBottomMenu():List<BottomMenuItem> {
   val bottomMenuItemList = arrayListOf<BottomMenuItem>()

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Home",
            icon = painterResource(R.drawable.bottom_btn1)
        )
    )

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Profile",
            icon = painterResource(R.drawable.bottom_btn2)
        )
    )

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Support",
            icon = painterResource(R.drawable.bottom_btn3)
        )
    )

    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Settings",
            icon = painterResource(R.drawable.bottom_btn4)
        )
    )

    return bottomMenuItemList
}

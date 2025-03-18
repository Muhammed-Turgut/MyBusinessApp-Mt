package com.muhammedturgut.myjobapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.muhammedturgut.myjobapp.ui.theme.MyJobAppTheme

class   IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContent {
            intro()
        }

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
    @Preview
    @Composable
    fun intro(){
        ConstraintLayout(modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(Color.White)) {
            val (img,img2,logo,today,text)=createRefs()

            Image(painter = painterResource(R.drawable.top_tight), contentDescription = null, modifier = Modifier
                .constrainAs(img){
                    end.linkTo(parent.end)
                    top.linkTo(img.top)
                })

            Image(painter = painterResource(R.drawable.logo), contentDescription = null,
                modifier = Modifier.padding(32.dp)
                    .constrainAs(logo){
                        end.linkTo(parent.end)
                        top.linkTo(img.bottom)
                    })

            Text(text="Elevator your \n"+"Learining Experience",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .constrainAs(text){
                        top.linkTo(logo.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(today.top)
                    })

            Image(painter = painterResource(R.drawable.bottom_left), contentDescription = null,
                modifier = Modifier
                    .constrainAs(img2){
                        start.linkTo(parent.start)
                        bottom.linkTo(parent.bottom)
                    })

            Image(painter = painterResource(R.drawable.today), contentDescription = null,
                modifier = Modifier
                    .padding(top=16.dp)
                    .constrainAs(today){
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                        top.linkTo(text.bottom)
                        bottom.linkTo(img2.top)
                    })

        }

    }

}


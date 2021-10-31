package com.metehanbolat.composelearningss5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.metehanbolat.composelearningss5.ui.theme.ComposeLearningSS5Theme
import com.metehanbolat.composelearningss5.ui.theme.color1
import com.metehanbolat.composelearningss5.ui.theme.color2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearningSS5Theme {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GradientButton(
                        text = "Button",
                        textColor = Color.White,
                        gradient = Brush.horizontalGradient(
                            colors = listOf(
                                color1,
                                color2
                            )
                        )
                    ) { }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Button")
                    }
                }
            }
        }
    }
}

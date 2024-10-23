package com.example.project3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import org.w3c.dom.Text

@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize()) {
            SectionHeader()
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = " Kepada Yth:", Modifier.padding(8.dp))
            Text(text = " Vina Rahma Vionita", Modifier.padding(8.dp))
            MainSection(
                judulParam = "Nama", isiParam = "Vionita"
            )
            MainSection(
                judulParam = "Kelas", isiParam = "B"
            )

            MainSection(
                judulParam = "Nim", isiParam = "20220140056"
            )

            MainSection(
                judulParam = "Keterangan", isiParam = "Mahasiswi di univ UGM"
            )
        }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(color = Color.DarkGray)){
        Row (
            modifier = Modifier.padding(15.dp)
        )
        {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = " ",
                    Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                )
                Icon(Icons.Filled.Check,
                    contentDescription = " ",
                    Modifier.padding(end = 13.dp),
                    tint = Color.Red
                )
            }
            Column(Modifier.padding(15.dp))
            {
                Text(text = "Teknologi Inoformasi",
                    color = Color.White)
                Spacer(Modifier.padding(3.dp))
                Text(text = "Universitas Gajah Mada",
                    color = Color.White)
            }
        }
    }
}

@Composable
fun MainSection(judulParam:String, isiParam:String){

    Column (horizontalAlignment = Alignment.Start, modifier = Modifier.padding(10.dp))
    {
        Row( modifier = Modifier.fillMaxWidth()
            .padding(8.dp), horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "$isiParam",
                modifier = Modifier.weight(2f) )
        }
    }

}
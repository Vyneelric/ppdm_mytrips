package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R



@Composable
fun TelaLogin(){
    Box(
        modifier = Modifier
            .fillMaxSize()

    ){}
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.End
        ){
            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(180.dp),
                shape = RoundedCornerShape(
                    bottomStart = 20.dp,
                    topEnd = 30.dp,
                ),
                colors = CardDefaults.cardColors(Color(0xFFBB2EE7))
            ){}
        }
        Column(
            modifier = Modifier
                .padding(10.dp)
        ){
            Text(
            text = stringResource(
                R.string.title
            ),
            modifier = Modifier,
            fontSize = 40.sp,
                color = (Color(0xFFBB2EE7)),
                fontWeight = FontWeight.ExtraBold

            )
            Text(
                modifier = Modifier
                    .padding(bottom = 100.dp)
                ,
                text = stringResource(
                    R.string.subtitle
                ),
                color = (Color.Gray),
                fontWeight = FontWeight.Light
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .fillMaxWidth()
                ,
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        stringResource(
                            R.string.email
                        )
                    )
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "",
                        tint = Color(0xFFBB2EE7)
                    )
                }
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .fillMaxWidth()
                ,
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        stringResource(
                            R.string.password
                        )
                    )
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.cadeado),
                        contentDescription = "",
                        tint = Color(0xFFBB2EE7)
                    )
                }
            )

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .align(Alignment.End),
                shape = RoundedCornerShape(
                    bottomEnd = 10.dp,
                    bottomStart = 10.dp,
                    topStart = 10.dp,
                    topEnd = 10.dp,
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = (Color(0xFFBB2EE7))
                )
            ) {
                Text(
                    text = stringResource(
                        R.string.button
                    ),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = stringResource(R.string.question)
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = stringResource(R.string.signup),
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFFBB2EE7)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Card(
                modifier = Modifier
                    .height(50.dp)
                    .width(180.dp),
                shape = RoundedCornerShape(
                    bottomStart = 20.dp,
                    topEnd = 30.dp,
                ),
                colors = CardDefaults.cardColors(Color(0xFFBB2EE7))
            ){}
    }

    }
}


@Preview
@Composable
private fun LoginScreenPreview() {
    TelaLogin()
}
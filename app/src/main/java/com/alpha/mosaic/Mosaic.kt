package com.alpha.mosaic
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background

@Composable
fun SimpleVerifyCode() {
    val context = LocalContext.current
    val focusRequesters = List(5) { remember { FocusRequester() } }
    val inputStates = List(5) { remember { mutableStateOf("") } }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.verifycode),
                contentDescription = "Top Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(Color(0xAA783B00))
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Spacer(modifier = Modifier.height(45.dp))
            Text(
                text = "Verify code",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF783B00)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "Code has sent to your email account",
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Enter your code",
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                inputStates.forEachIndexed { index, state ->
                    OutlinedTextField(
                        value = state.value,
                        onValueChange = {
                            if (it.length <= 1 && it.all(Char::isDigit)) {
                                state.value = it
                                if (it.isNotEmpty() && index < 4) {
                                    focusRequesters[index + 1].requestFocus()
                                }
                            }
                        },
                        modifier = Modifier
                            .width(50.dp)
                            .height(56.dp)
                            .focusRequester(focusRequesters[index]),
                        singleLine = true,
                        textStyle = TextStyle(
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        ),
                        shape = RoundedCornerShape(3.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                }
            }
            Spacer(modifier = Modifier.height(65.dp))
            Button(
                onClick = {
                    val code = inputStates.joinToString("") { it.value }
                    if (code.length == 5) {
                        Toast.makeText(context, "Code entered: $code", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context, "Enter all 5 digits", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF783B00))
            ) {
                Text("Confirm", color = Color.White, fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.height(28.dp))
            OutlinedButton(
                onClick = {
                    Toast.makeText(context, "Cancelled", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.outlinedButtonColors(containerColor = Color(0xFFFFF3E6))
            ) {
                Text("Cancel", color = Color.Black, fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}



@Preview(showBackground = true)
@Composable
fun SimpleVerifyCodePreview(){
    SimpleVerifyCode()
}

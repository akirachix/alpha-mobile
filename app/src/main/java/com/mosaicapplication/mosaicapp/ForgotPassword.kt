package com.mosaicapplication.mosaicapp.ui.screens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mosaicapplication.mosaicapp.R
@Composable
fun ForgotPasswordScreen() {
    var email by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        HeaderImage()
        Spacer(modifier = Modifier.height(32.dp))
        TitleText(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(45.dp))
        InstructionText(modifier = Modifier.align(Alignment.CenterHorizontally).padding(horizontal = 20.dp))
        Spacer(modifier = Modifier.height(32.dp))
        EmailLabel(modifier = Modifier.align(Alignment.Start).padding(start = 20.dp, top = 5.dp))
        EmailInputField(email = email, onValueChange = { email = it })
        Spacer(modifier = Modifier.height(50.dp))
        ContinueButton()
        Spacer(modifier = Modifier.height(24.dp))
        CancelButton(onClick = {  })
    }
}
@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.fashion),
        contentDescription = "fashionable cloth",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.25f),
        contentScale = ContentScale.FillWidth
    )
}
@Composable
fun TitleText(modifier: Modifier = Modifier) {
    Text(
        text = "Forgot Password",
        modifier = modifier,
        fontSize = 35.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xCC834207)
    )
}
@Composable
fun InstructionText(modifier: Modifier = Modifier) {
    Text(
        text = "Enter your email address and you will receive a link to reset password.",
        modifier = modifier,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    )
}
@Composable
fun EmailLabel(modifier: Modifier = Modifier) {
    Text(
        text = "Enter your email address",
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        modifier = modifier
    )
}
@Composable
fun EmailInputField(email: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(
        value = email,
        onValueChange = onValueChange,
        placeholder = { Text("Enter email address") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 20.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color(0xFF8B4513),
            unfocusedBorderColor = Color(0xFF8B4513),
            cursorColor = Color(0xFF8B4513)
        )
    )
}
@Composable
fun ContinueButton() {
    Button(
        onClick = { /* TODO: handle continue */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
            .padding(horizontal = 30.dp),
        shape = RoundedCornerShape(15.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8B4513))
    ) {
        Text(
            "Continue",
            color = Color.White,
            fontSize = 25.sp
        )
    }
}
@Composable
fun CancelButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFFF5EE),
            contentColor = Color.Black
        ),
        border = BorderStroke(2.dp, Color(0xFF8B4513)),
        shape = RoundedCornerShape(12.dp),
        elevation = ButtonDefaults.buttonElevation(0.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp, vertical = 16.dp)
            .height(50.dp)
    ) {
        Text(
            text = "Cancel",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
    }
}
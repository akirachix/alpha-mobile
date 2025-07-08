package com.mosaicapplication.mosaicapp.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mosaicapplication.mosaicapp.R


@Composable
fun SignUp(navController: NavController) {
    var fullname by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.mosaicsignup),
            contentDescription = "mosaicSignUp",
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(1.dp))
        Text(
            text = "Full Name",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(131, 66, 7),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)

        )
        OutlinedTextField(
            value = fullname,
            onValueChange = { fullname = it },
            label = { Text("fullname", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Phone Number",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(131, 66, 7),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)

        )
        OutlinedTextField(
            value = phonenumber,
            onValueChange = { phonenumber = it },
            label = { Text("phonenumber", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Email",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(131, 66, 7),
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)

        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("email", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Password",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(131, 66, 7),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)

        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,

            )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Confirm Password",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(131, 66, 7),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)

        )
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("confirmpassword", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,

            )


        var termsChecked by remember { mutableStateOf(false) }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 7.dp, start = 6.dp)
        ) {
            Checkbox(
                checked = termsChecked,
                onCheckedChange = { termsChecked = it },
                colors = CheckboxDefaults.colors(checkedColor = Color(131, 66, 7))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "I agree to the Terms and Conditions",
                modifier = Modifier.clickable { navController.navigate("TermsAndConditions") }
            )
        }

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .height(58.dp)
                .padding(start = 16.dp, end = 16.dp),

            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF834207),
                contentColor = Color.White,
                disabledContainerColor = Color(0xFF834207).copy(alpha = 0.5f),
                disabledContentColor = Color.White
            ),
            enabled = fullname.isNotBlank() && phonenumber.isNotBlank() && email.isNotBlank() &&
                    password.isNotBlank() && confirmPassword.isNotBlank() && termsChecked
        ) {
            Text("Sign Up", color = Color.White, fontSize = 25.sp)

        }
        Spacer(modifier = Modifier.height(7.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Do you have an account?")
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Sign In",
                color = Color(131, 66, 7),
                modifier = Modifier.clickable { navController.navigate("Authentication") }
            )
        }
    }
}

@Composable
fun TermsAndConditions(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 45.dp, end = 45.dp, top = 50.dp, bottom = 209.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "Back",
            tint = Color(0xFF834207),
            modifier = Modifier
                .align(Alignment.TopStart)
                .size(32.dp)
                .clickable { navController.popBackStack() }
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(45.dp))
            Text(
                text = "Terms & Conditions",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF834207),
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Please read these terms and conditions carefully before using Mosaic app.",
                style = MaterialTheme.typography.bodySmall,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "1) Conditions of Use",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "By using this app, you certify that you have read and reviewed this agreement " +
                        "and that you agree to comply with its terms. If you don't want to be bound by the terms of this agreement, you are advised to stop using the app accordingly. Mosaic only grants use and access of this app.",
                style = MaterialTheme.typography.bodySmall,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "2) Privacy Policy",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Before using our app, consider reading our privacy policy regarding user data collection. It will help you understand our practices better.",
                style = MaterialTheme.typography.bodySmall,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(18.dp))
            Text(
                text = "3) Intellectual Property",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "You agree that all materials, products, and services provided on this app are Mosaic property.",
                style = MaterialTheme.typography.bodySmall,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(24.dp))

        }
    }
}

@Composable
fun Authentication(navController: NavController) {
    var phonenumber by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.mosaicsignin),
            contentDescription = "fashionable lady",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
                .fillMaxHeight(0.25f),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Email or phone number",
            style = MaterialTheme.typography.headlineSmall,
            color = Color(0xFF834207),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)
        )
        OutlinedTextField(
            value = phonenumber,
            onValueChange = { phonenumber = it },
            label = { Text("Email/phone number", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Password",
            style = MaterialTheme.typography.headlineSmall,
            color = Color(0xFF834207),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,

        )
        Spacer(modifier = Modifier.height(1.dp))
        TextButton(
            onClick = { navController.navigate("ForgotPasswordScreen") },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = "Forgot password?",
                fontStyle = FontStyle.Italic,
                style = MaterialTheme.typography.headlineSmall,
                color = Color(0xFF834207),
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.height(80.dp))
        Button(
            onClick = {  },
            modifier = Modifier
                .size(width = 377.dp, height = 58.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF834207),
                contentColor = Color.White,
                disabledContainerColor = Color(0xFF834207).copy(alpha = 0.5f),
                disabledContentColor = Color.White
            ),
            enabled = phonenumber.isNotBlank() && password.isNotBlank()
        ) {
            Text("Sign In", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Don't have an account?",
                style = MaterialTheme.typography.headlineSmall,
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 18.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Sign Up",
                color = Color(0xFF834207),
                style = MaterialTheme.typography.headlineSmall,
                fontSize = 15.sp,
                modifier = Modifier.clickable { navController.navigate("SignUp") }
            )
        }
    }
}


@Composable
fun ForgotPasswordScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        HeaderImage()
        Spacer(modifier = Modifier.height(32.dp))
        TitleText(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(45.dp))
        InstructionText(modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(horizontal = 20.dp))
        Spacer(modifier = Modifier.height(32.dp))
        EmailLabel(modifier = Modifier
            .align(Alignment.Start)
            .padding(start = 20.dp, top = 5.dp))
        EmailInputField(email = email, onValueChange = { email = it })
        Spacer(modifier = Modifier.height(50.dp))
        ContinueButton(navController)
        Spacer(modifier = Modifier.height(24.dp))
        CancelButton(onClick = {  })
    }
}
@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.fashions),
        contentDescription = "fashionable cloth",
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp),
        contentScale = ContentScale.Crop
    )
}
@Composable
fun TitleText(modifier: Modifier = Modifier) {
    Text(
        text = "Forgot Password",
        modifier = modifier,
        fontSize = 35.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF834207)
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
fun ContinueButton(navController: NavController) {
    Button(
        onClick = {navController.navigate("VerifyCode")},
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
            .height(58.dp)
    ) {
        Text(
            text = "Cancel",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
    }
}



@Composable
fun VerifyCode(navController: NavController) {
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
                .height(240.dp)
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
                    .background(Color(0x70834207))
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(45.dp))
            Text(
                text = "Verify code",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF834207)
            )
            Spacer(modifier = Modifier.height(28.dp))
            Text(
                text = "Code has sent to your email account",
                fontSize = 23.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Enter your code",
                fontSize = 25.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(25.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(18.dp)) {
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
                            .height(59.dp)
                            .focusRequester(focusRequesters[index]),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = Color(0xFF8B4A1D),
                            focusedBorderColor = Color(0xFF8B4A1D)
                        ),
                        singleLine = true,
                        textStyle = TextStyle(
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp
                        ),
                        shape = RoundedCornerShape(3.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(65.dp))
            Button(
                onClick = { navController.navigate("ResetPassword") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF834207),
                    contentColor = Color.White
                )
            ) {
                Text("Confirm", color = Color.White, fontSize = 25.sp)
            }
            Spacer(modifier = Modifier.height(28.dp))
            OutlinedButton(
                onClick = { navController.navigate("SignIn")},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color(0xFF8B4A1D)
                ),
                border = BorderStroke(3.dp, Color(0xFF8B4A1D))
            ) {
                Text("Cancel", color = Color.Black, fontSize = 25.sp)
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun ResetPassword(navController: NavController) {
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.resetpasswordimage),
            contentDescription = "Reset Password Header",
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Reset password",
            color = Color(0xFF582C05),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Create new password",
            style = MaterialTheme.typography.headlineSmall,
            color = Color(0xFF834207),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp),
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,

            )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Confirm password",
            style = MaterialTheme.typography.headlineSmall,
            color = Color(0xFF834207),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 16.dp),

            )
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("confirmpassword", fontStyle = FontStyle.Italic) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            singleLine = true,

            )
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = {  },
            modifier = Modifier
                .size(width = 350.dp, height = 58.dp),

            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF834207),
                contentColor = Color.White,
                disabledContainerColor = Color(0xFF834207).copy(alpha = 0.5f),
                disabledContentColor = Color.White
            ),
            enabled = password.isNotBlank() && confirmPassword.isNotBlank()
        ) {
            Text("Reset Password", fontSize = 22.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { navController.navigate("Authentication") },
            modifier = Modifier
                .size(width = 350.dp, height = 58.dp)
                .border(BorderStroke(3.dp, Color(0xFF834207))),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            )
        ) {
            Text("Cancel", fontSize = 22.sp)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUp(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun TermsAndConditionPreview() {
    TermsAndConditions(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun AuthenticationPreview() {
    Authentication(navController = rememberNavController())
}


@Preview(showBackground = true)
@Composable
fun ForgotPasswordScreenPreview() {
    ForgotPasswordScreen(navController = rememberNavController())
}


@Preview(showBackground = true)
@Composable
fun VerifyCodePreview() {
    VerifyCode(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun ResetPasswordPreview() {
    ResetPassword(navController = rememberNavController())
}
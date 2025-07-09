package com.mosaicapplication.mosaicapp


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mosaicapplication.mosaicapp.ui.screens.Authentication
import com.mosaicapplication.mosaicapp.ui.screens.ForgotPasswordScreen
import com.mosaicapplication.mosaicapp.ui.screens.ResetPassword
import com.mosaicapplication.mosaicapp.ui.screens.SignUp
import com.mosaicapplication.mosaicapp.ui.screens.TermsAndConditions
import com.mosaicapplication.mosaicapp.ui.screens.VerifyCode


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "SignUp") {
        composable("SignUp") { SignUp(navController) }
        composable("TermsAndConditions") { TermsAndConditions(navController) }
        composable("Authentication") { Authentication(navController) }
        composable("ForgotPasswordScreen") { ForgotPasswordScreen(navController) }
        composable ("VerifyCode"){ VerifyCode(navController) }
        composable("ResetPassword") { ResetPassword(navController) }
    }
}

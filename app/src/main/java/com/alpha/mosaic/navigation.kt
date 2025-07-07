package com.alpha.mosaic

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


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

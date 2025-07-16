package com.mosaicapplication.mosaicapp


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mosaicapplication.mosaicapp.ui.screens.Authentication
import com.mosaicapplication.mosaicapp.ui.screens.ChooseRoleScreen
import com.mosaicapplication.mosaicapp.ui.screens.DesignerTeaser
import com.mosaicapplication.mosaicapp.ui.screens.ForgotPasswordScreen
import com.mosaicapplication.mosaicapp.ui.screens.HomePage
import com.mosaicapplication.mosaicapp.ui.screens.LaunchScreen
import com.mosaicapplication.mosaicapp.ui.screens.MosaicWelcomeScreen
import com.mosaicapplication.mosaicapp.ui.screens.ResetPassword
import com.mosaicapplication.mosaicapp.ui.screens.SignUp
import com.mosaicapplication.mosaicapp.ui.screens.TeaserScreenOne
import com.mosaicapplication.mosaicapp.ui.screens.TeaserScreenTwo
import com.mosaicapplication.mosaicapp.ui.screens.TermsAndConditions
import com.mosaicapplication.mosaicapp.ui.screens.VerifyCode


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "LaunchScreen") {
        composable("LaunchScreen") { LaunchScreen(navController) }
        composable("TermsAndConditions") { TermsAndConditions(navController) }
        composable("Authentication") { Authentication(navController) }
        composable("ForgotPasswordScreen") { ForgotPasswordScreen(navController) }
        composable ("VerifyCode"){ VerifyCode(navController) }
        composable("ResetPassword") { ResetPassword(navController) }
        composable("HomePage") { HomePage(navController) }
        composable("SignUp") { SignUp(navController) }
        composable("ChooseRoleScreen"){ ChooseRoleScreen(navController) }
        composable("TeaserScreenOne"){ TeaserScreenOne(navController) }
        composable("TeaserScreenTwo"){TeaserScreenTwo(navController)}
        composable("MosaicWelcomeScreen"){ MosaicWelcomeScreen(navController) }
        composable("DesignerTeaser"){ DesignerTeaser(navController) }

    }
}



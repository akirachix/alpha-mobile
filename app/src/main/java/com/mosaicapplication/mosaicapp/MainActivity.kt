
package com.mosaicapplication.mosaicapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.mosaicapplication.mosaicapp.ui.theme.MosaicAppTheme
import com.mosaicapplication.mosaicapp.ui.screens.ForgotPasswordScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MosaicAppTheme {
                AppNavigation()
            }
        }
    }
}
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "forgot_password") {
        composable("forgot_password") {
            ForgotPasswordScreen()
        }

    }
}
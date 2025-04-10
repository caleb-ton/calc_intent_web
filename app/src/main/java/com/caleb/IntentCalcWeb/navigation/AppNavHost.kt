package com.caleb.IntentCalcWeb.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.caleb.IntentCalcWeb.ui.theme.screens.home.Home_Screen

//@Composable
//fun AppNavHost(modifier: Modifier = Modifier,
//               navController: NavController= rememberNavController(),
//               startDestination:String=ROUTE_HOME) {
//    NavHost(navController = navController, modifier = modifier,
//        startDestination = startDestination){
//        composable(ROUTE_HOME){
//            Home_Screen()
//        }
//    }
//}
package presentation.ui.main.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.koin.compose.koinInject
import presentation.navigation.HomeNavigation
import presentation.ui.main.home.view_model.HomeViewModel

@Composable
fun HomeNav(logout: () -> Unit) {
    val navigator = rememberNavController()
    NavHost(
        startDestination = HomeNavigation.Home,
        navController = navigator,
        modifier = Modifier.fillMaxSize()
    ) {
        composable<HomeNavigation.Home> {
            val viewModel: HomeViewModel = koinInject()
            HomeScreen(
                errors = viewModel.errors,
                state = viewModel.state.value,
                events = viewModel::onTriggerEvent,
                navigateToNotifications = {
                    // navigator.navigate(HomeNavigation.Notification)
                },
                navigateToCategories = {
                    // navigator.navigate(HomeNavigation.Categories)
                },
                navigateToSetting = {
                    //navigator.navigate(HomeNavigation.Settings)
                },
                navigateToDetail = {
//                    navigator.navigate(HomeNavigation.Detail(id = it))
//                }) { categoryId, sort ->
//                navigator.navigate(
//                    HomeNavigation.Search(categoryId = categoryId, sort = sort)
//                )
                    // }


                })
        }
    }
}

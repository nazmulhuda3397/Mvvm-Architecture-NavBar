package presentation.ui.main.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import common.Context
import org.koin.compose.koinInject
import presentation.navigation.ProfileNavigation
import presentation.ui.main.profile.view_model.ProfileViewModel

@Composable
fun ProfileNav(context: Context, logout: () -> Unit) {
    //val addressViewModel: AddAddressViewModel = koinInject()
    val navigator = rememberNavController()
    NavHost(
        startDestination = ProfileNavigation.Profile,
        navController = navigator,
        modifier = Modifier.fillMaxSize()
    ) {
        composable<ProfileNavigation.Profile> {
            val viewModel: ProfileViewModel = koinInject()
            ProfileScreen(
                state = viewModel.state.value,
                events = viewModel::onTriggerEvent,
                errors = viewModel.errors,
                navigateToAddress = {
                   // navigator.navigate(ProfileNavigation.Address)
                },
                navigateToEditProfile = {
                    //navigator.navigate(ProfileNavigation.EditProfile)
                },
                navigateToPaymentMethod = {
                    //navigator.navigate(ProfileNavigation.PaymentMethod)
                },
                navigateToMyOrders = {
                   // navigator.navigate(ProfileNavigation.MyOrders)
                },
                navigateToMyCoupons = {
                   // navigator.navigate(ProfileNavigation.MyCoupons)
                },

                navigateToSettings = {
                    //navigator.navigate(ProfileNavigation.Settings)
                },
            )
        }

    }
}


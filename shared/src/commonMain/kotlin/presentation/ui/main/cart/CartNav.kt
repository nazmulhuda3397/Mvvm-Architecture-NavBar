package presentation.ui.main.cart

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import business.core.UIComponent
import business.datasource.network.common.JAlertResponse
import common.Context
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import org.koin.compose.koinInject
import presentation.navigation.CartNavigation
import presentation.ui.main.cart.view_model.CartViewModel

@Composable
fun CartNav(context: Context) {
    val navigator = rememberNavController()
    val _uiComponent = MutableStateFlow<UIComponent?>(null)
    val uiComponent: StateFlow<UIComponent?> = _uiComponent
   // val addressViewModel: AddAddressViewModel = koinInject()
    NavHost(
        startDestination = CartNavigation.Cart,
        navController = navigator,
        modifier = Modifier.fillMaxSize()
    ) {
        composable<CartNavigation.Cart> {
            val viewModel: CartViewModel = koinInject()
            CartScreen(
                state = viewModel.state.value,
                events = viewModel::onTriggerEvent,
                errors = viewModel.errors,
                navigateToDetail = {
                    _uiComponent.value = UIComponent.Toast(
                        alert = JAlertResponse("Hello", "This is a toast message.")
                    )
                   // navigator.navigate(CartNavigation.Detail(it))
                },
                navigateToCheckout = {
                   // navigator.navigate(CartNavigation.Checkout)
                })
        }

    }
}

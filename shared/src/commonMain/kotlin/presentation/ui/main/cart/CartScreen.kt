package presentation.ui.main.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import business.core.UIComponent
import kotlinx.coroutines.flow.Flow
import presentation.component.DefaultScreenUI
import presentation.ui.main.cart.view_model.CartEvent
import presentation.ui.main.cart.view_model.CartState


@Composable
fun CartScreen(
    state: CartState,
    events: (CartEvent) -> Unit,
    errors: Flow<UIComponent>,
    navigateToDetail: (Long) -> Unit,
    navigateToCheckout: () -> Unit,
    ) {


    DefaultScreenUI(
        errors = errors,
        progressBarState = state.progressBarState,
        networkState = state.networkState,
        onTryAgain = { events(CartEvent.OnRetryNetwork) }
    ) {
        Box(modifier = Modifier.fillMaxSize().background(Color.Green)) {

            Text("Card screen", style = TextStyle(Color.Red, fontSize = 29.sp))

        }
    }
}


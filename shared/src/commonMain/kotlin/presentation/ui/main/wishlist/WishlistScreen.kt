package presentation.ui.main.wishlist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import business.core.UIComponent
import kotlinx.coroutines.flow.Flow
import presentation.component.DefaultScreenUI
import presentation.component.Spacer_8dp
import presentation.ui.main.wishlist.view_model.WishlistEvent
import presentation.ui.main.wishlist.view_model.WishlistState

@Composable
fun WishlistScreen(
    state: WishlistState,
    events: (WishlistEvent) -> Unit,
    errors: Flow<UIComponent>,
    navigateToDetail: (Long) -> Unit
) {


    DefaultScreenUI(
        errors = errors,
        progressBarState = state.progressBarState,
        networkState = state.networkState,
        onTryAgain = { events(WishlistEvent.OnRetryNetwork) }
    ) {
        Column(modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.scrim)) {


            Spacer_8dp()


            Text("WishList screen", style = TextStyle(Color.Yellow, fontSize = 29.sp))

        }
    }
}




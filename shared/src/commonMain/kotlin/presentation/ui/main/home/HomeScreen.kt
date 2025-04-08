package presentation.ui.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import business.core.UIComponent
import kotlinx.coroutines.flow.Flow
import presentation.component.DefaultScreenUI
import presentation.component.Spacer_8dp
import presentation.ui.main.home.view_model.HomeEvent
import presentation.ui.main.home.view_model.HomeState

@Composable
fun HomeScreen(
    navigateToDetail: (Long) -> Unit = {},
    state: HomeState,
    events: (HomeEvent) -> Unit = {},
    errors: Flow<UIComponent>,
    navigateToNotifications: () -> Unit = {},
    navigateToSetting: () -> Unit = {},
    navigateToCategories: () -> Unit = {},
    navigateToSearch: (Long?, Int?) -> Unit = { _, _ -> },
) {
    val pagerState = rememberPagerState { state.home.banners.size }

    DefaultScreenUI(
        errors = errors,
        progressBarState = state.progressBarState,
        networkState = state.networkState,
        onTryAgain = { events(HomeEvent.OnRetryNetwork) }
    ) {
        Column(
            modifier = Modifier.fillMaxSize()

                .background(MaterialTheme.colorScheme.primary)
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                Spacer_8dp()
                Text("Home Screen", style = TextStyle(Color.Blue, fontSize = 29.sp))
            }
        }
    }
}
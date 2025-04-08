package presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterDialog(
//    state: SearchState,
//    events: (SearchEvent) -> Unit,
) {


//    var selectedRange by remember {
//        mutableStateOf(state.selectedRange)
//    }

  //  val selectedCategories = state.selectedCategory.toMutableStateList()


    CustomAlertDialog(
        onDismissRequest = {
           // events(SearchEvent.OnUpdateFilterDialogState(UIComponentState.Hide))
        },
        modifier = Modifier
            .fillMaxWidth(0.9f).background(MaterialTheme.colorScheme.background)
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {

            Spacer_16dp()

            Text(
                "Filter",
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer_32dp()

            Text(
                "Price:",
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                style = MaterialTheme.typography.titleMedium
            )


            Spacer_16dp()

            Text(
                "Category:",
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                style = MaterialTheme.typography.titleMedium
            )


            Spacer_16dp()
        }

    }

}
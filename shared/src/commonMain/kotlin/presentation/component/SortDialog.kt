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
fun SortDialog(
//    state: SearchState,
//    events: (SearchEvent) -> Unit,
) {

    //val selectedSort = mutableStateOf(state.selectedSort)


    CustomAlertDialog(
        onDismissRequest = {
           // events(SearchEvent.OnUpdateSortDialogState(UIComponentState.Hide))
        },
        modifier = Modifier
            .fillMaxWidth(0.9f).background(MaterialTheme.colorScheme.background)
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
        ) {


            Text(
                "Sort",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer_16dp()



        }

    }

}
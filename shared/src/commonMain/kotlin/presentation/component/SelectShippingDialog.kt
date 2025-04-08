package presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import business.core.UIComponentState
import business.domain.main.ShippingType
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import presentation.theme.BorderColor
import shoping_app.shared.generated.resources.*




@OptIn(ExperimentalResourceApi::class)
@Composable
fun ShippingBox(
    shippingType: ShippingType,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {

        Row(modifier = Modifier.fillMaxWidth().noRippleClickable { onClick() }) {
            Icon(
                painter = painterResource(Res.drawable.shipping),
                null,
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer_8dp()
            Column(modifier = Modifier.fillMaxWidth(.7f)) {
                Text(shippingType.title, style = MaterialTheme.typography.titleMedium)
                Text(
                    shippingType.getEstimatedDay(),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Spacer_8dp()
            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text("$ ${shippingType.price}")
                Checkbox(isSelected, onCheckedChange = { onClick() })
            }

            Spacer_8dp()
            HorizontalDivider(color = BorderColor)
            Spacer_8dp()
        }
    }
}
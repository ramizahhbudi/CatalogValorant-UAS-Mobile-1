package trpl.kelompok4.catalogvalorant.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import trpl.kelompok4.catalogvalorant.model.Map

@Composable
fun MapDetailScreen(map: Map) {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = painterResource(id = map.imageRes),
            contentDescription = map.name,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = map.name, style = MaterialTheme.typography.titleLarge)
        Text(text = map.description, style = MaterialTheme.typography.bodyMedium)
    }
}

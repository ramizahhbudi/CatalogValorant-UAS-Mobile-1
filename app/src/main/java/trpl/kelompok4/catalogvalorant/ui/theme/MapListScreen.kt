package trpl.kelompok4.catalogvalorant.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import trpl.kelompok4.catalogvalorant.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapsListScreen(navController: NavController) {
    // Scaffold untuk kerangka UI
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.maps_screen_title)) }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()) // Enable scrolling
        ) {
            // List Map Contoh
            MapListItem("Haven", stringResource(R.string.map_haven_description)) {
                // Navigasi ke Detail Map
                navController.navigate("mapDetail/Haven")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Bind", stringResource(R.string.map_bind_description)) {
                navController.navigate("mapDetail/Bind")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Ascent", stringResource(R.string.map_ascent_description)) {
                navController.navigate("mapDetail/Ascent")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Icebox", stringResource(R.string.map_icebox_description)) {
                navController.navigate("mapDetail/Icebox")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Breeze", stringResource(R.string.map_breeze_description)) {
                navController.navigate("mapDetail/Breeze")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Split", stringResource(R.string.map_split_description)) {
                navController.navigate("mapDetail/Split")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Fracture", stringResource(R.string.map_fracture_description)) {
                navController.navigate("mapDetail/Fracture")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Lotus", stringResource(R.string.map_lotus_description)) {
                navController.navigate("mapDetail/Lotus")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Pearl", stringResource(R.string.map_pearl_description)) {
                navController.navigate("mapDetail/Pearl")
            }

            Spacer(modifier = Modifier.height(8.dp))

            MapListItem("Abyss", stringResource(R.string.map_abyss_description)) {
                navController.navigate("mapDetail/Abyss")
            }
        }
    }
}

@Composable
fun MapListItem(name: String, description: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = name, style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

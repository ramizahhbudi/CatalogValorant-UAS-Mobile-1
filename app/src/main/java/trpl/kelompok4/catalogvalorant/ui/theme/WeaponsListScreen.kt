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
fun WeaponsListScreen(navController: NavController) {
    // Scaffold untuk kerangka UI
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.weapons_screen_title)) }
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
            // List Weapon Contoh
            WeaponListItem("Vandal", stringResource(R.string.weapon_vandal_description)) {
                // Navigasi ke Detail Weapon
                navController.navigate("weaponDetail/Vandal")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Phantom", stringResource(R.string.weapon_phantom_description)) {
                navController.navigate("weaponDetail/Phantom")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Guardian", stringResource(R.string.weapon_guardian_description)) {
                navController.navigate("weaponDetail/Guardian")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Bulldog", stringResource(R.string.weapon_bulldog_description)) {
                navController.navigate("weaponDetail/Bulldog")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Spectre", stringResource(R.string.weapon_spectre_description)) {
                navController.navigate("weaponDetail/Spectre")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Stinger", stringResource(R.string.weapon_stinger_description)) {
                navController.navigate("weaponDetail/Stinger")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Bucky", stringResource(R.string.weapon_bucky_description)) {
                navController.navigate("weaponDetail/Bucky")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Judge", stringResource(R.string.weapon_judge_description)) {
                navController.navigate("weaponDetail/Judge")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Operator", stringResource(R.string.weapon_op_description)) {
                navController.navigate("weaponDetail/Operator")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Marshall", stringResource(R.string.weapon_marshall_description)) {
                navController.navigate("weaponDetail/Marshall")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Ares", stringResource(R.string.weapon_ares_description)) {
                navController.navigate("weaponDetail/Ares")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Classic", stringResource(R.string.weapon_classic_description)) {
                navController.navigate("weaponDetail/Classic")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Shorty", stringResource(R.string.weapon_shorty_description)) {
                navController.navigate("weaponDetail/Shorty")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Frenzy", stringResource(R.string.weapon_frenzy_description)) {
                navController.navigate("weaponDetail/Frenzy")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Sheriff", stringResource(R.string.weapon_sheriff_description)) {
                navController.navigate("weaponDetail/Sheriff")
            }

            Spacer(modifier = Modifier.height(8.dp))

            WeaponListItem("Knife", stringResource(R.string.weapon_knife_description)) {
                navController.navigate("weaponDetail/Knife")
            }
        }
    }
}

@Composable
fun WeaponListItem(name: String, description: String, onClick: () -> Unit) {
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

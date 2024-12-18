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
fun AgentsListScreen(navController: NavController) {
    // Scaffold untuk kerangka UI
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.agents_screen_title)) }
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
            // Daftar agent lengkap
            AgentListItem("Jett", stringResource(R.string.agent_jett_description)) {
                navController.navigate("agentDetail/Jett")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Phoenix", stringResource(R.string.agent_phoenix_description)) {
                navController.navigate("agentDetail/Phoenix")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Reyna", stringResource(R.string.agent_reyna_description)) {
                navController.navigate("agentDetail/Reyna")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Raze", stringResource(R.string.agent_raze_description)) {
                navController.navigate("agentDetail/Raze")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Yoru", stringResource(R.string.agent_yoru_description)) {
                navController.navigate("agentDetail/Yoru")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Sova", stringResource(R.string.agent_sova_description)) {
                navController.navigate("agentDetail/Sova")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Breach", stringResource(R.string.agent_breach_description)) {
                navController.navigate("agentDetail/Breach")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("KAY/O", stringResource(R.string.agent_kayo_description)) {
                navController.navigate("agentDetail/kayo")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Brimstone", stringResource(R.string.agent_brimstone_description)) {
                navController.navigate("agentDetail/Brimstone")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Omen", stringResource(R.string.agent_omen_description)) {
                navController.navigate("agentDetail/Omen")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Viper", stringResource(R.string.agent_viper_description)) {
                navController.navigate("agentDetail/Viper")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Sage", stringResource(R.string.agent_sage_description)) {
                navController.navigate("agentDetail/Sage")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Cypher", stringResource(R.string.agent_cypher_description)) {
                navController.navigate("agentDetail/Cypher")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Killjoy", stringResource(R.string.agent_killjoy_description)) {
                navController.navigate("agentDetail/Killjoy")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Chamber", stringResource(R.string.agent_chamber_description)) {
                navController.navigate("agentDetail/Chamber")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Skye", stringResource(R.string.agent_skye_description)) {
                navController.navigate("agentDetail/Skye")
            }
            Spacer(modifier = Modifier.height(8.dp))

            AgentListItem("Astra", stringResource(R.string.agent_astra_description)) {
                navController.navigate("agentDetail/Astra")
            }
        }
    }
}

@Composable
fun AgentListItem(name: String, description: String, onClick: () -> Unit) {
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

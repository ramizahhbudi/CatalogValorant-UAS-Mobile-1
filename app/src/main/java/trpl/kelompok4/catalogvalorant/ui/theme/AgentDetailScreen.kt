package trpl.kelompok4.catalogvalorant.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import trpl.kelompok4.catalogvalorant.model.Agent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgentDetailScreen(agent: Agent) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detail Agent: ${agent.name}") }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Gambar Agent
            Image(
                painter = painterResource(id = agent.imageRes),
                contentDescription = "Agent Image",
                modifier = Modifier.size(200.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Nama Agent
            Text(text = agent.name, fontSize = 24.sp, style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(8.dp))

            // Deskripsi Agent
            Text(text = agent.description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

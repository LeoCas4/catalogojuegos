package com.example.catalogojuegos.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.catalogojuegos.data.GameRepository

/**
 * Pantalla principal del catálogo. Usa Scaffold + TopAppBar para tener una
 * barra superior con el título de la app, y LazyColumn para mostrar la
 * lista de juegos de forma eficiente (solo compone las tarjetas visibles
 * en pantalla, ideal para listas largas).
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameListScreen() {
    val games = GameRepository.getGames()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Catálogo de Videojuegos") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                top = paddingValues.calculateTopPadding() + 8.dp,
                bottom = paddingValues.calculateBottomPadding() + 16.dp
            )
        ) {
            items(games) { game ->
                GameCard(game = game)
            }
        }
    }
}
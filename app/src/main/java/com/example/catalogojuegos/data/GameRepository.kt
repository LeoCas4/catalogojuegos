package com.example.catalogojuegos.data

import com.example.catalogojuegos.R
import com.example.catalogojuegos.model.Game

/**
 * Fuente de datos del catálogo. Por ahora es una lista fija en memoria,
 * con las imágenes apuntando a los recursos locales en res/drawable.
 */
object GameRepository {
    fun getGames(): List<Game> {
        return listOf(
            Game("The Legend of Zelda: Tears of the Kingdom", "Nintendo Switch", R.drawable.zelda_totk),
            Game("God of War Ragnarök", "PlayStation 5", R.drawable.god_of_war_ragnarok),
            Game("Elden Ring", "PC", R.drawable.elden_ring),
            Game("Halo Infinite", "Xbox Series X", R.drawable.halo_infinite),
            Game("Super Mario Odyssey", "Nintendo Switch", R.drawable.mario_odyssey),
            Game("Cyberpunk 2077", "PC", R.drawable.cyberpunk_2077),
            Game("Spider-Man 2", "PlayStation 5", R.drawable.spiderman_2),
            Game("Forza Horizon 5", "Xbox Series X", R.drawable.forza_horizon_5),
            Game("Hollow Knight", "PC", R.drawable.hollow_knight),
            Game("Animal Crossing: New Horizons", "Nintendo Switch", R.drawable.animal_crossing)
        )
    }
}
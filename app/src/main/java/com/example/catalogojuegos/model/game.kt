package com.example.catalogojuegos.model

/**
 * Representa un videojuego dentro del catálogo.
 *
 * @param titulo Nombre del videojuego.
 * @param plataforma Plataforma en la que está disponible (PC, PS5, Switch, etc.).
 * @param imagen Id del recurso drawable correspondiente a la carátula del
 * juego (ej. R.drawable.zelda_totk), cargado desde res/drawable.
 */
data class Game(
    val titulo: String,
    val plataforma: String,
    val imagen: Int
)
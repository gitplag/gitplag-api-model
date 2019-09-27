package io.gitplag.model.data.graph

/**
 * Graph arrow
 */
data class Link(
    val first: String,
    val second: String,
    val weight: Int,
    val directedTo: Direction,
    val url: String
)
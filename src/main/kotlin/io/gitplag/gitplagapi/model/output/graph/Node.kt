package io.gitplag.model.data.graph

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Graph node
 */
data class Node(
    @JsonProperty(value = "name", required = true)
    val name: String,
    @JsonProperty(value = "url", required = true)
    val url: String
)
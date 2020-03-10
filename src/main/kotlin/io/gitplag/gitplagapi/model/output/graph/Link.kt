package io.gitplag.model.data.graph

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Graph arrow
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class Link(
    @JsonProperty(value = "first", required = true)
    val first: String,
    @JsonProperty(value = "second", required = true)
    val second: String,
    @JsonProperty(value = "weight", required = true)
    val weight: Int,
    @JsonProperty(value = "directedTo", required = true)
    val directedTo: Direction,
    @JsonProperty(value = "url", required = true)
    val url: String
)
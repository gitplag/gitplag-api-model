package io.gitplag.model.data.graph

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * The core graph dto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class GraphData(
    @JsonProperty(value = "nodes", required = true)
    val nodes: Collection<Node>,
    @JsonProperty(value = "links", required = true)
    val links: Collection<Link>
)






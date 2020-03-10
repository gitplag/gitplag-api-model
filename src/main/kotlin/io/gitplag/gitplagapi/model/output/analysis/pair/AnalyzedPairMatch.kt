package io.gitplag.gitplagapi.model.output.analysis.pair

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class AnalyzedPairMatch(
    @JsonProperty(value = "id", required = true)
    val id: Long,
    @JsonProperty(value = "from1", required = true)
    val from1: Int,
    @JsonProperty(value = "to1", required = true)
    val to1: Int,
    @JsonProperty(value = "from2", required = true)
    val from2: Int,
    @JsonProperty(value = "to2", required = true)
    val to2: Int,
    @JsonProperty(value = "fileName1", required = true)
    val fileName1: String,
    @JsonProperty(value = "fileName2", required = true)
    val fileName2: String
)
package io.gitplag.gitplagapi.model.input

import com.fasterxml.jackson.annotation.JsonProperty
import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.Language

data class AnalysisRequest(
    @JsonProperty(value = "branch", required = true)
    val branch: String,
    @JsonProperty(value = "analyzer", required = false)
    val analyzer: AnalyzerProperty? = null,
    @JsonProperty(value = "language", required = false)
    val language: Language? = null,
    @JsonProperty(value = "mode", required = false)
    val mode: AnalysisMode? = null,
    @JsonProperty(value = "maxResultSize", required = false)
    val maxResultSize: Int? = null,
    @JsonProperty(value = "minResultPercentage", required = false)
    val minResultPercentage: Int? = null,
    @JsonProperty(value = "responseUrl", required = false)
    val responseUrl: String? = null,
    @JsonProperty(value = "updateFiles", required = false)
    val updateFiles: Boolean = false,
    @JsonProperty(value = "additionalRepositories", required = false)
    val additionalRepositories: Collection<Long>? = emptyList()
)
package io.gitplag.gitplagapi.model.input

import com.fasterxml.jackson.annotation.JsonProperty
import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.Language

data class RepositoryUpdate(
    @JsonProperty(value = "language", required = false)
    val language: Language? = null,
    @JsonProperty(value = "filePatterns", required = false)
    val filePatterns: Collection<String> = emptyList(),
    @JsonProperty(value = "analyzer", required = false)
    val analyzer: AnalyzerProperty? = null,
    @JsonProperty(value = "analysisMode", required = false)
    val analysisMode: AnalysisMode? = null,
    @JsonProperty(value = "autoCloningEnabled", required = false)
    val autoCloningEnabled: Boolean? = null
)
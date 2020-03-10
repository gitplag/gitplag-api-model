package io.gitplag.gitplagapi.model.input

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.GitProperty
import io.gitplag.gitplagapi.model.enums.Language

@JsonIgnoreProperties(ignoreUnknown = true)
data class RepositoryInput(
    @JsonProperty(value = "git", required = true)
    val git: GitProperty,
    @JsonProperty(value = "name", required = true)
    val name: String,
    @JsonProperty(value = "language", required = true)
    val language: Language,
    @JsonProperty(value = "filePatterns", required = false)
    val filePatterns: Collection<String> = emptyList(),
    @JsonProperty(value = "analyzer", required = false)
    val analyzer: AnalyzerProperty? = null,
    @JsonProperty(value = "analysisMode", required = false)
    val analysisMode: AnalysisMode? = null,
    @JsonProperty(value = "autoCloningEnabled", required = false)
    val autoCloningEnabled: Boolean? = null
)
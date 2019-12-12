package io.gitplag.gitplagapi.model.output.repository

import com.fasterxml.jackson.annotation.JsonProperty
import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.GitProperty
import io.gitplag.gitplagapi.model.enums.Language

data class RepositoryOutput(
    @JsonProperty(value = "id", required = true)
    val id: Long,
    @JsonProperty(value = "filePatterns", required = true)
    val filePatterns: Collection<String>,
    @JsonProperty(value = "name", required = true)
    val name: String,
    @JsonProperty(value = "analyzer", required = true)
    val analyzer: AnalyzerProperty,
    @JsonProperty(value = "gitService", required = true)
    val gitService: GitProperty,
    @JsonProperty(value = "language", required = true)
    val language: Language,
    @JsonProperty(value = "analysisMode", required = true)
    val analysisMode: AnalysisMode,
    @JsonProperty(value = "autoCloningEnabled", required = true)
    val autoCloningEnabled: Boolean
)
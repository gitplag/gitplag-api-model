package io.gitplag.gitplagapi.model.input

import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.GitProperty
import io.gitplag.gitplagapi.model.enums.Language

data class RepositoryInput(
    val id: Long,
    val git: GitProperty,
    val name: String,
    val language: Language,
    val filePatterns: Collection<String> = emptyList(),
    val analyzer: AnalyzerProperty? = null,
    val analysisMode: AnalysisMode? = null,
    val autoCloningEnabled: Boolean? = null
)
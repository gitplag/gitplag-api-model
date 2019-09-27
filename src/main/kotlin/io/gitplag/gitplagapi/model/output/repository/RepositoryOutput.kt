package io.gitplag.gitplagapi.model.output.repository

import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.GitProperty
import io.gitplag.gitplagapi.model.enums.Language

data class RepositoryOutput(
    val id: Long,
    val filePatterns: Collection<String>,
    val name: String,
    val analyzer: AnalyzerProperty,
    val gitService: GitProperty,
    val language: Language,
    val analysisMode: AnalysisMode,
    val autoCloningEnabled: Boolean
)
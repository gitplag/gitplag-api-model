package io.gitplag.gitplagapi.model.input

import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.GitProperty
import io.gitplag.gitplagapi.model.enums.Language

data class RepositoryInput(
    val id: Long,
    val git: GitProperty,
    val name: String,
    var language: Language,
    var filePatterns: Collection<String>?,
    var analyzer: AnalyzerProperty?,
    var analysisMode: AnalysisMode?,
    var autoCloningEnabled: Boolean?
)
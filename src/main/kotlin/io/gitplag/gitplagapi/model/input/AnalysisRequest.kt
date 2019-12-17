package io.gitplag.gitplagapi.model.input

import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.Language

data class AnalysisRequest(
    val branch: String,
    val analyzer: AnalyzerProperty? = null,
    val language: Language? = null,
    val mode: AnalysisMode? = null,
    val maxResultSize: Int? = null,
    val minResultPercentage: Int? = null,
    val responseUrl: String? = null,
    val updateFiles: Boolean = false,
    val additionalRepositories: Collection<Long>? = emptyList()
)
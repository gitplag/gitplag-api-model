package io.gitplag.gitplagapi.model.input

import io.gitplag.gitplagapi.model.enums.AnalysisMode
import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import io.gitplag.gitplagapi.model.enums.Language

data class AnalysisRequest(
        val branch: String,
        val analyzer: AnalyzerProperty?,
        val language: Language?,
        val mode: AnalysisMode?,
        val maxResultSize: Int?,
        val minResultPercentage: Int?,
        val responseUrl: String?,
        val updateFiles: Boolean = false
)
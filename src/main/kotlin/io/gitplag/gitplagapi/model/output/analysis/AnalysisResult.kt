package io.gitplag.gitplagapi.model.output.analysis

import io.gitplag.gitplagapi.model.enums.AnalyzerProperty
import java.time.LocalDateTime

data class AnalysisResult(
        val id: Long,
        val repo: Long,
        val repoName: String,
        val analyzer: AnalyzerProperty,
        val branch: String,
        val date: LocalDateTime,
        val resultLink: String,
        val analysisPairs: List<AnalyzedPairInfo>
)
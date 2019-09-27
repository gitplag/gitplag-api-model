package io.gitplag.gitplagapi.model.output.analysis.pair

import java.time.LocalDateTime

data class AnalysedPair(
    val id: Long,
    val student1: String,
    val student2: String,
    val percentage: Int,
    val minPercentage: Int,
    val maxPercentage: Int,
    val createdAt1: LocalDateTime,
    val createdAt2: LocalDateTime,
    val lines: List<AnalyzedPairMatch>
)
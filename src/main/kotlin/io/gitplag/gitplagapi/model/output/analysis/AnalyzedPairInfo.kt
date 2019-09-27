package io.gitplag.gitplagapi.model.output.analysis

import java.time.LocalDateTime

data class AnalyzedPairInfo(
        val id: Long,
        val student1: String,
        val student2: String,
        val percentage: Int,
        val minPercentage: Int,
        val maxPercentage: Int,
        val createdAt1: LocalDateTime,
        val createdAt2: LocalDateTime
)
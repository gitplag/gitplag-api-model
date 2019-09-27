package io.gitplag.gitplagapi.model.output.analysis.pair

data class AnalyzedPairMatch(
        val id: Long,
        val from1: Int,
        val to1: Int,
        val from2: Int,
        val to2: Int,
        val fileName1: String,
        val fileName2: String
)
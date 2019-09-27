package io.gitplag.gitplagapi.model.output.analysis.pair

import io.gitplag.gitplagapi.model.output.file.content.FileContent

data class AnalysedPairContent(
    val files1: Collection<FileContent>,
    val files2: Collection<FileContent>,
    val pair: AnalysedPair
)